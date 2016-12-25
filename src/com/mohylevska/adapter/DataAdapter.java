package com.mohylevska.adapter;

/**
 * Created by cs.ucu.edu.ua on 13.12.2016.
 */
public class DataAdapter extends Data implements DataAdapterInterface {
    /**
     * Extend x and y from Data
     * @param x
     * @param y
     */
    public DataAdapter(int x, int y) {
        super(x, y);
    }

    @Override
    public int getX() {
        return getAwesomeX();
    }
    @Override
    public int getY() {
        return getPrettyY();
    }
}
