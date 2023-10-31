package CompositePattern;

public class Body {
    public void acceptVisitor(AutoElementVisitor ae) {
        ae.visitBody(this);
    }
}
