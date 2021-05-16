package za.ac.cput.Assignment2Adp3;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class HouseCollectionTest {

    Collection<House> houseCollect = new HashSet<House>();
    House h1 = new House(15,"Blue");
    House h2 = new House (20,"Red");
    House h3 = new House(30,"Green");
    @Test
    void addCollection() {
        houseCollect.add(h1);
        houseCollect.add(h2);
        houseCollect.add(h3);
        //Used assertEquals for test:
        assertEquals(3,houseCollect.size());
        System.out.println(houseCollect.size());
    }

    @Test
    void removeCollection() {
        houseCollect.add(h1);
        houseCollect.add(h2);
        houseCollect.add(h3);
        //The remove(h3) is to remove object called h3 from the collection and the size should show 2
        houseCollect.remove(h3);
        //Used assertEquals for test:
        assertEquals(2,houseCollect.size());
        System.out.println(houseCollect.size());
    }

    @Test
    void findCollection() {
        houseCollect.add(h1);
        houseCollect.add(h2);
        // Use contains methods to find:
        houseCollect.contains(h1);
        //The output should show true to show that the test passed successfully
        assertTrue(houseCollect.contains(h1));
        System.out.println(houseCollect.contains(h1));
    }
}