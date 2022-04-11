package Suunnittelumallit.ChainOfResponsibility;

public class CEO extends RequestHandler{

    @Override
    public void HandleRequest(Personnel p, Float percentage) {
            System.out.println("CEO accepted the raise.");
            p.giveRaise(percentage);
    }
}
