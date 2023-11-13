package Assignment2;

/**
 * Interface for the visitor pattern in the 4 visitor classes
 */
public interface UserGroupVisitor {
    public void visitUser(UserLeaf user);

    public void visitGroup(GroupContainer group);
}
