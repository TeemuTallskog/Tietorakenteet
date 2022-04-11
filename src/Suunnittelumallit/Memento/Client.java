package Suunnittelumallit.Memento;

import javax.swing.plaf.metal.MetalMenuBarUI;

public class Client extends Thread {

    private Guesser guesser;
    private int attempts = 0;
    private String name = "";

    public Client(Guesser guesser, String name){
        this.guesser = guesser;
        this.name = name;
    }
    public void run(){
        Object memento = guesser.joinGame();
        boolean runCondition = true;
        while(runCondition){
            attempts++;
            if(guesser.guess(memento, (int) (Math.random() * 20))) runCondition = false;
        }
        System.out.println(this.name + " Guessed right after " + attempts + " attempts!");
    }
}
