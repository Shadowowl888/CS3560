package DesignPatternNotes.CompositePattern;

public class Wheel extends AutoElement {
    public void acceptVisitor(AutoElementVisitor ae) {
        ae.visitWheel(this);
    }
}
