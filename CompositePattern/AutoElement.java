package CompositePattern;

public abstract class AutoElement {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    abstract public void acceptVisitor(AutoElementVisitor ae);
}
