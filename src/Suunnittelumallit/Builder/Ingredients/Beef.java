package Suunnittelumallit.Builder.Ingredients;

public class Beef {
    private String desc = "Beef";
    public Beef(){

    }
    public Beef(String desc){
        this.desc = desc;
    }

    @Override
    public String toString(){
        return desc;
    }
}
