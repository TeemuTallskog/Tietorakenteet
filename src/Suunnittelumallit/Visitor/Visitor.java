package Suunnittelumallit.Visitor;

public interface Visitor {
    public void visit(AwakeState state, Joe joe);
    public void visit(TiredState state, Joe joe);

    public void visit(HyperState state, Joe joe);
}
