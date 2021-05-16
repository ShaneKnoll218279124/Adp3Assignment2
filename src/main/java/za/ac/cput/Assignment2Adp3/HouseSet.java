package za.ac.cput.Assignment2Adp3;

import java.util.HashSet;
import java.util.Set;

/**
 * HouseList class
 * Student Name&Surname: Shane knoll
 * Student Number: 218279124
 * **/
public class HouseSet {

    Set<House> set = new HashSet<>();
    //These methods are going to be tested in the HouseSettest class:
    // I have House objects to be used in the methods that will be tested in the test class

    void addSet(House p) {

        set.add(p);
        set.add(p);

    }
    
    void removeSet(House p) {
        set.add(p);
        set.add(p);

        //remove method:
        set.remove(p);

    }


    void findSet(House p) {

        set.add(p);
        set.add(p);
        set.contains(p);

    }

}