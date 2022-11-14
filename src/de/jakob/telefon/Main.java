package de.jakob.telefon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String line = "";
        ArrayList<PhoneNumber> kontakte = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\schmi\\IdeaProjects\\untitled1\\src\\mr.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value, null if no more lines are available
            {
                String[] kontakt = line.split(";");    // use comma as separator
                System.out.println(kontakt[2] + " " + kontakt[3] + "" + kontakt[10] + " " + kontakt[11]);
                kontakte.add(new PhoneNumber(kontakt[3], kontakt[2], kontakt[10], kontakt[11]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Juttas finden

        for(PhoneNumber i : kontakte){
            if(i.vorname.contains("Jutta")){
                System.out.println(i);
            }
        }

        for(PhoneNumber j: kontakte){
            if(j.vorwahl.contains("06421") && j.nummer.startsWith("13")){
                System.out.println(j);
            }
        }

    }
}

