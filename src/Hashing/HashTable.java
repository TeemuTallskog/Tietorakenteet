package Hashing;

public class HashTable {
    private static class HashObject
    {
        int key;
        String data;
        public HashObject(int key, String data)
        {
            this.key = key;
            this.data = data;
        }
        public int getkey()
        {
            return key;
        }
        public String getdata()
        {
            return data;
        }
    }

    private final int maxSize = 10;

    private HashObject[] table;


    public HashTable() {
        table = new HashObject[maxSize];
        for (int i = 0; i < maxSize; i++)
        {
            table[i] = null;
        }
    }
    public String retrieve(int key)
    {
        int hash = key % maxSize;
        while (table[hash] != null && table[hash].getkey() != key)
        {
            hash = (hash + 1) % maxSize;
        }
        if (table[hash] == null)
        {
            return "nothing found!";
        }
        else
        {
            return table[hash].getdata();
        }
    }
    public void insert(int key, String data)
    {
        if (!checkForSpace())
        {
            System.out.println("table is full");
            return;
        }
        int hash = (key % maxSize);
        while (table[hash] != null && table[hash].getkey() != key)
        {
            hash = (hash + 1) % maxSize;
        }
        table[hash] = new HashObject(key, data);
    }
    private boolean checkForSpace() {
        boolean isOpen = false;
        for (int i = 0; i < maxSize; i++)
        {
            if (table[i] == null)
            {
                isOpen = true;
            }
        }
        return isOpen;
    }
}
