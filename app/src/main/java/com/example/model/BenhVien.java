package com.example.model;


public class BenhVien {

    private int thumbBV;
    private String name;
    private String address;

    public BenhVien(int thumbBV, String name, String address) {
        this.thumbBV = thumbBV;
        this.name = name;
        this.address = address;

    }

    public int getThumbBV() {
        return thumbBV;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}

