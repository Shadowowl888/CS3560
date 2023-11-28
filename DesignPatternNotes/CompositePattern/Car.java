package DesignPatternNotes.CompositePattern;

import java.util.List;
import java.util.ArrayList;

public class Car extends AutoElement {
    private List<AutoElement> parts = new ArrayList<>();

    public List<AutoElement> getParts() {
        return parts;
    }

    public void setParts(List<AutoElement> parts) {
        this.parts = parts;
    }

    @Override
    public void acceptVisitor(AutoElementVisitor ae) {
        System.out.println();
    }
}
