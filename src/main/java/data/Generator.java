/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jesper
 */
public class Generator {

    private static final String[] FNAMES = {"Jesper", "Christian", "Mads", "Lars", "Line", "Abdul", "Ivor", "Adam", "Nikolaj", "Jens", "James", "Liam", "Arthus", "Kel'Thuzard"};
    private static final String[] LNAMES = {"Christensen", "Larsen", "Jensen", "Hartmann", "Pedersen", "Hansen", "Petersen", "Mathiasen", "Gudrundsen", "Kavazaki"};

    public static String generateData(int sampleAmount, int startID) {
        List<Person> persons = new ArrayList();
        Random rand = new Random();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        
        int id = startID;
        for (int i = 0; i < sampleAmount; i++) {
            int fName = rand.nextInt(FNAMES.length);
            int lName = rand.nextInt(LNAMES.length);
            int age = rand.nextInt(54) + 17;

            persons.add(new Person(id, FNAMES[fName], LNAMES[lName], age));
            id++;
        }
        return gson.toJson(persons);
    }
    
    public static void main(String[] args) {
        System.out.println(generateData(50, 1));
    }

}
