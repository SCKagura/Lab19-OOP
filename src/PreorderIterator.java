import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class PreorderIterator<E extends Comparable<? super E>> implements Iterator<E> {
    private Stack<AVLTree.TreeNode<E>> stack;

    public PreorderIterator(AVLTree.TreeNode<E> root) {
        stack = new Stack<>();
        if (root != null)
            stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public E next() {
        if (!hasNext())
            throw new NoSuchElementException("No more elements in the tree");

        AVLTree.TreeNode<E> current = stack.pop();
        if (current.right != null)
            stack.push(current.right);
        if (current.left != null)
            stack.push(current.left);

        return current.val;
    }
}