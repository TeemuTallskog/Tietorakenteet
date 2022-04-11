package Suunnittelumallit.ChainOfResponsibility;

public class Main {
    public static void main(String[] args){
        Personnel employee = new Personnel();

        employee.requestRaise(1.01f);
        employee.requestRaise(1.04f);
        employee.requestRaise(1.2f);
    }
}
