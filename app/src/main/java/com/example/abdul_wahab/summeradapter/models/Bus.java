package com.example.abdul_wahab.summeradapter.models;

/**
 * Created by Abdul-Wahab on 7/14/2017.
 */

public class Bus {

    public Bus(int id, String modelno) {
        this.id = id;
        this.modelno = modelno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }


    private String modelno;
    private int id;
    private int capacity;
    private boolean hasAC;

    @Override
    public String toString() {
        return "Bus{" +
                "modelno='" + modelno + '\'' +
                '}';
    }

}
