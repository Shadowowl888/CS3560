package CompositePattern;

public class Window extends AutoElement {
    public void acceptVisitor(AutoElementVisitor ae) {
        ae.visitWindow(this);
    }
}
