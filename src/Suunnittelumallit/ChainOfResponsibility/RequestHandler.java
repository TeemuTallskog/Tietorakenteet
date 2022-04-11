package Suunnittelumallit.ChainOfResponsibility;


public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public void setNextHandler(RequestHandler requestHandler){
        this.nextHandler = requestHandler;
    }

    public void HandleRequest(Personnel p, Float percentage){
        if(nextHandler != null){
            nextHandler.HandleRequest(p, percentage);
        }
    }
}
