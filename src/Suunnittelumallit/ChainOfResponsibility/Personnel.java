package Suunnittelumallit.ChainOfResponsibility;

public class Personnel {
    private Float pay = 2000.0f;

    public void giveRaise(float raise){
        System.out.print("Pay increased from " + pay);
        pay *= raise;
        System.out.print(" to " + pay + "\n");
    }

    public void requestRaise(float raise){
        ChainOfRequests.getRequestChain().HandleRequest(this, raise);
    }
}
