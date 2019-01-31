package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Fact {
    private String id;
    private String description;
    private double rating;
    private String [] genres;
    private int playtime;
    private boolean animation;
    private boolean multilang;
    private boolean include;


    public Fact(String id, String description, double rating, String[] genres, int playtime, boolean animation, boolean multilang) {
        this.id = id;
        this.description = description;
        this.rating = rating;
        this.genres = genres;
        this.playtime = playtime;
        this.animation = animation;
        this.multilang = multilang;
        this.include = true;
    }

    public void setInclude(boolean include) {
        this.include = include;
    }

    public String getId(){
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public double getRating(){
        return this.rating;
    }

    public String[] getGenres(){
        return this.genres;
    }

    public int getPlaytime(){
        return this.playtime;
    }

    public boolean isAnimation(){
        return this.animation;
    }

    public boolean isMultilang(){
        return this.multilang;
    }

    public boolean isInclude() {
        return include;
    }

    //Special methods:
    public boolean isHighRated(){
        if (this.rating >= 5.0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFamilyFriendy(){
        //String[] notFamilyFriendly =  {"horror","drama","thriller","crime"};
        /*ArrayList<String> nonFamilyFriendly = new ArrayList<String>();
        nonFamilyFriendly.add("horror");
        nonFamilyFriendly.add("drama");
        */
        String nonFamily = "horrordramathrillercrime";
        for(String genre : genres) {
            if(nonFamily.contains(genre)){
                return false;
            }
        }
        /*for (int i = 0; i < notFamilyFriendly.length; i++){
            for (int j =0; j < this.genres.length; j++){
                if (notFamilyFriendly[i].equals(this.genres[j])){
                    return false;
                }
            }
        }*/
        return true;
    }

    public boolean isLongMovie() {
        if (this.playtime >= 90) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return
            "Title: " + description + "\n" +
            "Rating: " + rating + "\n" +
            "Genre(s): " + genreString() + "\n" +
            "Playtime (in minutes): " + playtime + "\n" +
            "Animated movie? " + animString() + "\n" +
            "Available in multiple languages? " + langString() + "\n\n"
            ;
    }

    public String genreString() {
        String tempStr = "";
        for(String genre : genres) {
            tempStr += genre + ", ";
        }
        return tempStr;
    }

    public String animString() {
        if(isAnimation()) {
            return "yes";
        } else {
            return "no";
        }
    }

    public String langString() {
        if(isMultilang()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
