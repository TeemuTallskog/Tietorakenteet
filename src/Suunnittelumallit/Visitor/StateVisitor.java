package Suunnittelumallit.Visitor;

public class StateVisitor implements Visitor{

    @Override
    public void visit(AwakeState state, Joe joe) {
        System.out.println("Points added for exercising in awake state + 1");
        joe.addPoints(1);
        joe.printPoints();
    }

    @Override
    public void visit(TiredState state, Joe joe) {
        System.out.println("No points awarded for attempting to exercise in tired state + 0");
        joe.addPoints(0);
        joe.printPoints();
    }

    @Override
    public void visit(HyperState state, Joe joe) {
        System.out.println("Points added for exercising in hyper state + 2");
        joe.addPoints(2);
        joe.printPoints();
    }
}
