package za.ac.cput.Assignment2Adp3;

import java.util.Collection;
import java.util.HashSet;

/**
 * HouseCollection class
 * Student Name&Surname: Shane knoll
 * Student Number: 218279124
 * **/
public class HouseCollection {

    Collection<House> houseCollect = new HashSet<House>();

    //These methods are going to be tested in the HouseCollectiontest class:
    //  I have House objects to be used in the methods that will be tested in the test class

    void addCollection(House p){

        houseCollect.add(p);

    }
    void removeCollection(House p){

        houseCollect.remove(p);

    }

    void findCollection(House p){

        houseCollect.contains(p);


    }

}
