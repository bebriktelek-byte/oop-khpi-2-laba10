import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediaLibraryTest {
    @Test
    void testAddAndSize() {
        MediaLibrary<String> library = new MediaLibrary<>();
        library.add("Item 1");
        library.add("Item 2");
        assertEquals(2, library.size());
    }

    @Test
    void testRemove() {
        MediaLibrary<Integer> library = new MediaLibrary<>();
        library.add(100);
        library.add(200);
        int removed = library.remove(0);
        assertEquals(100, removed);
        assertEquals(1, library.size());
        assertEquals(200, library.get(0));
    }

    @Test
    void testIterator() {
        MediaLibrary<String> library = new MediaLibrary<>();
        library.add("A");
        library.add("B");
        int count = 0;
        for (String s : library) {
            count++;
        }
        assertEquals(2, count);
    }
}