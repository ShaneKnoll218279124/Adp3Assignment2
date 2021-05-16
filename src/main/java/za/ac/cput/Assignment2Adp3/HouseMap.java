package za.ac.cput.Assignment2Adp3;

import java.util.HashMap;
import java.util.Map;

/**
 * HouseMap class
 * Student Name&Surname: Shane knoll
 * Student Number: 218279124
 * **/
public class HouseMap {

    Map map = new HashMap();

    //These methods are going to be tested in the HouseMaptest class:
    //  I have House objects to be used in the methods that will be tested in the test class

    void addMap(House p) {


        map.put("1",p);

    }

    void removeMap(House p){
        map.put("1", p);

        map.remove("1");

    }


    void findMap(House p){
        map.put("1", p);
        map.put("2",p);

        map.get("1");


    }

}
