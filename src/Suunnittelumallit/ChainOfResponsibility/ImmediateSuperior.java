package Suunnittelumallit.ChainOfResponsibility;

public class ImmediateSuperior extends RequestHandler{

    @Override
    public void HandleRequest(Personnel p, Float percentage) {
        if(percentage <= 1.02){
            System.out.println("Immediate Superior accepted the raise.");
            p.giveRaise(percentage);
        }else{
            super.HandleRequest(p, percentage);
        }
    }
}
