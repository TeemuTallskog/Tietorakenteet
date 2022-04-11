package Suunnittelumallit.ChainOfResponsibility;

public class ChainOfRequests {


    public static RequestHandler getRequestChain(){
        RequestHandler superior = new ImmediateSuperior();
        RequestHandler hou = new HeadOfUnit();
        RequestHandler ceo = new CEO();

        hou.setNextHandler(ceo);
        superior.setNextHandler(hou);

        return superior;
    }
}
