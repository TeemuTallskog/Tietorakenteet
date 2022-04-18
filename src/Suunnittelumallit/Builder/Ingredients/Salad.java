package Suunnittelumallit.Builder.Ingredients;

public class Salad {

    private String desc = "Salad";
    public Salad(){

    }
    public Salad(String desc){
        this.desc = desc;
    }

    @Override
    public String toString(){
        return desc;
    }
}
