package com.mohylevska.adapter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataAdapterInterface xy = new DataAdapter(1,3);
        System.out.println(xy.getX());
    }
}
