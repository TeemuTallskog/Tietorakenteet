package Suunnittelumallit.ChainOfResponsibility;

public class HeadOfUnit extends RequestHandler{

    @Override
    public void HandleRequest(Personnel p, Float percentage) {
        if(percentage <= 1.05){
            System.out.println("Head of Unit accepted the raise.");
            p.giveRaise(percentage);
        }else{
            super.HandleRequest(p, percentage);
        }
    }
}
