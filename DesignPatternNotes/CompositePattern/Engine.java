package DesignPatternNotes.CompositePattern;

public class Engine {
    public void acceptVisitor(AutoElementVisitor ae) {
        ae.visitEngine(this);
    }
}
