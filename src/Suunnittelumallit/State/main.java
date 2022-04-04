package Suunnittelumallit.State;

import java.util.Random;

public class main {
    public static void main(String[] args){
        Joe joe = new Joe();

        for(int i = 0; i<20; i++){
            int n = (int) ((Math.random() * (4 - 1)) + 1);
            System.out.println(n);
            switch (n){
                case 1:
                    joe.exercise();
                    break;
                case 2:
                    joe.chill();
                    break;
                case 3:
                    joe.sleep();
                    break;
            }
        }
    }
}
