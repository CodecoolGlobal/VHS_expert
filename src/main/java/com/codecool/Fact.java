package com.codecool;

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


    public Fact(String id, String description, double rating, String[] genres, int playtime, boolean animation, boolean multlang) {
        this.id = id;
        this.description = description;
        this.rating = rating;
        this.genres = genres;
        this.playtime = playtime;
        this.animation = animation;
        this.multilang = multlang;
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
        String[] notFamilyFriendly = new String[] {"horror","drama","thriller","crime"};

        for (int i = 0; i < notFamilyFriendly.length; i++){
            for (int j =0; j < this.genres.length; j++){
                if (notFamilyFriendly[i].equals(this.genres[j])){
                    return false;
                }
            }
        }
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
        return "Fact{" +
            "id='" + id + '\'' +
            ", description='" + description + '\'' +
            ", rating=" + rating +
            ", genres=" + Arrays.toString(genres) +
            ", playtime=" + playtime +
            ", animation=" + animation +
            ", multilang=" + multilang +
            '}';
    }
}
