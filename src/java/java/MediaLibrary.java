import java.util.Iterator;
import java.util.NoSuchElementException;

public class MediaLibrary<T> implements Iterable<T> {
    private T[] items;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public MediaLibrary() {
        this.capacity = 10;
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void add(T item) {
        if (size == capacity) {
            grow();
        }
        items[size++] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return items[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T removedItem = items[index];
        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }
        items[--size] = null;
        return removedItem;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        capacity *= 2;
        T[] newItems = (T[]) new Object[capacity];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

    @Override
    public Iterator<T> iterator() {
        return new MediaIterator();
    }

    private class MediaIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return items[currentIndex++];
        }
    }
}