package com.seb;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("When you finish enter the word list");




        ArrayList<Person> persons = new ArrayList<Person>();
        String otherPerson = "";

        do {

            Person aperson = new Person();
            System.out.println("Enter Name:");
            String inputname = input.nextLine();
            aperson.setName(inputname);
            System.out.println("Enter Email ");
            String email = input.nextLine();
            aperson.setEmail(email);
            System.out.println("Enter favorite color");
            String color = input.nextLine();
            aperson.setFavoriteColor(color);
            System.out.println(aperson.feedBack(color));
            persons.add(aperson);
            System.out.println("Is there another person you want to insert?");
            otherPerson = input.nextLine();


        } while (otherPerson.equalsIgnoreCase("yes"));



//        ArrayList<String> sameColor=new ArrayList<String>();
        System.out.println("Name \t\t\t\t\t Email\t\t\t\t\t\t FavoriteColor\n");
        for (Person eachPerson : persons) {

            System.out.println(eachPerson.getName() + "\t\t\t\t\t " + eachPerson.getEmail() + "\t\t\t\t\t\t\t\t\t" + eachPerson.getFavoriteColor());
        }

        System.out.println("search for people with the same colour. ");
        String sameColor=input.nextLine();

        for (Person eachPerson: persons)

            if(eachPerson.getFavoriteColor().equalsIgnoreCase(sameColor)){
                System.out.println(eachPerson.getName());

        }








//        HashMap<String,String> listOfSearches=new HashMap<String, String>();
//        for( listOfSearches: search.entrySet()){
//            String key=listOfSearches.getKey();
//            String value=listOfSearches.getValue();
//            if(key.equalsIgnoreCase("Red")){
//                System.out.println(value);
//            }

        }
    }










