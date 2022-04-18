package Suunnittelumallit.Builder.Ingredients;

public class Sauce {

    private String desc = "Sauce";
    public Sauce(){

    }
    public Sauce(String desc){
        this.desc = desc;
    }

    @Override
    public String toString(){
        return desc;
    }
}
