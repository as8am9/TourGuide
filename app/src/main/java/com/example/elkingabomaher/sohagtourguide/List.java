package com.example.elkingabomaher.sohagtourguide;

public class List {
    private int tImage;
    private String tName;
    private String tDetails;

    public List(int image, String name, String det) {
        this.tDetails = det;
        this.tImage = image;
        this.tName = name;
    }

    public String gettDetails() {
        return tDetails;
    }

    public String gettName() {
        return tName;
    }

    public int gettImage() {
        return tImage;
    }


}
