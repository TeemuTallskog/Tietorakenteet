package Suunnittelumallit.Builder.Ingredients;

public class Bun {
    private String desc = "Bun";
    public Bun(){

    }
    public Bun(String desc){
        this.desc = desc;
    }

    @Override
    public String toString(){
        return desc;
    }
}
