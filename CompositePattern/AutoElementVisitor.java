package CompositePattern;

public interface AutoElementVisitor {
    public void visitWheel(Wheel w);
    public void visitBody(Body b);
    public void visitEngine(Engine e);
    public void visitCar(Car c);
    public void visitWindow(Window w);
}
