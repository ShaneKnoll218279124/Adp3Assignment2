package za.ac.cput.Assignment2Adp3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HouseMapTest {

    Map map = new HashMap();
    House w = new House(44, "blue");
    House s = new House(55, "brown");

    @Test
    void addMap() {
        map.put("1", w);
        map.put("2", s);
        //Used assertEquals to test
        assertEquals(2, map.size());
        //the output size should show 2 because it did put 2 House objects in Map
        System.out.println(map.size());
    }

    @Test
    void removeMap() {
        map.put("1", w);
        map.put("2", s);
        // we remove a object by using a key.
        map.remove("1");
        assertEquals(1, map.size());
        //this is true when the output size of map will be one
        System.out.println("Size of map:"+""+""+map.size());

    }

    @Test
    void findMap() {
        map.put("1", w);
        map.put("2", s);
        // this test will work because we getting the key from the map
        assertEquals(w,map.get("1"));
        map.get("1");

    }
}