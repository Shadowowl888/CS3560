package Assignment2;

/**
 * Interface for the composite pattern for the tree
 */
public interface CompositeTree {
    public String getID();

    public String toString();

    public void accept(UserGroupVisitor visitor);
}
