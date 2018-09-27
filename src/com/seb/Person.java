package com.seb;

import java.util.HashMap;

public class Person {
    private String name;
    private String email;
    private String favoriteColor;

    public Person(String name, String email, String favoriteColor) {
        this.name = name;
        this.email = email;
        this.favoriteColor = favoriteColor;
    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
    public String feedBack(String color){
        String feedBack="";
        if(color.equalsIgnoreCase("blue")){
           feedBack="It is a nNice Color";
        }
        if(color.equalsIgnoreCase("grey")){
           feedBack="OK";
        }
        if (color.equalsIgnoreCase("red")){
            feedBack="It pops!";
        }
        else
          Colors.randomGenerator();

        return feedBack;


    }
}