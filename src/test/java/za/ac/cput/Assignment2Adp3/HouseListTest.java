package za.ac.cput.Assignment2Adp3;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HouseListTest {
    List<House> list = new LinkedList<>();
    House hhh = new House(100,"Blue");
    House ccc = new House (20,"Red");

    @Test
    void addList() {
        list.add(hhh);
        list.add(ccc);
        //assertEquals is to test if the 2 House objects got added
        //if true the output of the size will be 2
        assertEquals(2,list.size());
        System.out.println(list.size());

    }

    @Test
    void removeList() {
        list.add(hhh);
        list.add(ccc);
        //The remove method will remove the object called ccc in the list
        list.remove(ccc);
        //the output put should be 1 because we first added 2 objects and now we removing 1 object
        assertEquals(1,list.size());
        //output of the size of the list should be one because we removed object called ccc
        System.out.println(list.size());
    }

    @Test
    void findList() {
        list.add(hhh);
        list.add(ccc);
        // here we use get method to find object in a list which in this case is the first object
        list.get(0);
        // it should show green and the test should pass if this works
        assertEquals(hhh,list.get(0));
    }
}