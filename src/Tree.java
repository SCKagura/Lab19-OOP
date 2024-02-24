import java.util.Iterator;

public interface Tree<E> {
    void add(E e);
    Iterator<E> getPreorderIterator();
    Iterator<E> getPostorderIterator();
}
