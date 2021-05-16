package za.ac.cput.Assignment2Adp3;

import java.util.LinkedList;
import java.util.List;

/**
 * HouseList class
 * Student Name&Surname: Shane knoll
 * Student Number: 218279124
 * **/
public class HouseList {

    List<House> list = new LinkedList<>();

    //These methods are going to be tested in the HouseListtest class:
    //  I have House objects to be used in the methods that will be tested in the test class
    void addList(House p){

     list.add(p);

    }

    void removeList(House p){

        list.add(p);
        list.remove(p);

    }

    void findList(House p){
        list.add(p);
        list.get(0);


    }


}
