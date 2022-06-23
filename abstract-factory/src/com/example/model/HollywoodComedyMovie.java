package com.example.model;

import com.example.creator.HollywoodMovies;

public class HollywoodComedyMovie implements HollywoodMovies {
    private String name;
    private static final String movieGenre = "COMEDY MOVIE";
    public  HollywoodComedyMovie(){

    }

    public  HollywoodComedyMovie(String movieName){

        this.name=movieName;
    }


    @Override
    public String genreName() {
        return movieGenre;
    }
    @Override
    public String getMovieName() {
     return name;
    }
}
