/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author kamaj
 */
public class Stack {

        int top; // top näkyy oletuspakkaukseen
        private int size;
        private int MAX = 10;
        String[] taulu = new String[MAX];

        public Stack() {
                top = 0;
                size = 0;
        }
        //  palautetaan pino-iteraattori
        public StackIterator iterator() {
            return new StackIterator(this);
        }
        // muodostetaan uusi alkio ja viedään se huipulle
        public void push(String aData) {
                if(top == 9){
                        System.out.println("Stack overflow");
                }else{
                        taulu[top] = aData;
                        top +=1;
                }

        }
        // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
        public String pop() {
                String takeAway;
                if(top == 0){
                        System.out.println("Stack is empty!");
                        return null;
                }else{
                        takeAway = taulu[top];
                        taulu[top] = null;
                        top-=1;

                }

                return takeAway;
        }
        // palautetaan pinottujen alkioiden lukumäärä
        public int getSize() {
                return top + 1;
        }
        // listataan sisältö
        public void printItems() {
                int pointer = top;
                while(pointer != 0){
                        System.out.println(taulu[pointer]);
                        pointer -= 1;
                }

        }
}

