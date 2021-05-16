package za.ac.cput.Assignment2Adp3;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HouseSetTest {

    Set<House> set = new HashSet<>();
    House ss = new House(5,"blue");
    House uu = new House(5,"blue");

    @Test
    void addSet() {
        set.add(uu);
        set.add(ss);
        //Used assertEquals to test:
        assertEquals(2,set.size());
        //display size of Set to show that 2 House objects was added
        System.out.println(set.size());

    }

    @Test
    void removeSet() {
        set.add(uu);
        set.add(ss);

        //remove method:
        set.remove(ss);
        //test the remove:
        assertEquals(1,set.size());
        //display size. Size should be 1
        System.out.println(set.size());
    }

    @Test
    void findSet() {
        set.add(uu);
        set.add(ss);
        System.out.println("True or false does the set contain a House object called uu:"+" "+set.contains(uu));
        //assert true is to show if we can find the object called uu if not it will show false
        assertTrue(set.contains(uu));
        System.out.println(set.contains(uu));
    }
}