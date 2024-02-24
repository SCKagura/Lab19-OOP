import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class PostorderIterator<E extends Comparable<? super E>> implements Iterator<E> {
    private Stack<AVLTree.TreeNode<E>> stack;

    public PostorderIterator(AVLTree.TreeNode<E> root) {
        stack = new Stack<>();
        traverse(root);
    }

    private void traverse(AVLTree.TreeNode<E> node) {
        if (node == null) return;

        Stack<AVLTree.TreeNode<E>> tempStack = new Stack<>();
        tempStack.push(node);

        while (!tempStack.isEmpty()) {
            AVLTree.TreeNode<E> current = tempStack.pop();
            stack.push(current);

            if (current.left != null) {
                tempStack.push(current.left);
            }

            if (current.right != null) {
                tempStack.push(current.right);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public E next() {
        if (!hasNext())
            throw new NoSuchElementException("No more elements in the tree");

        return stack.pop().val;
    }
}
