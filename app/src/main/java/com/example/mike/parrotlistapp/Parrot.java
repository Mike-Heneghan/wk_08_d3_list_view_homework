package com.example.mike.parrotlistapp;

public class Parrot {

    private Integer ranking;
    private String commonName;
    private String scientificName;
    private String colour;

    public Parrot(Integer ranking, String commonName, String scientificName, String colour){
        this.ranking = ranking;
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.colour = colour;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getColour() {
        return colour;
    }
}
