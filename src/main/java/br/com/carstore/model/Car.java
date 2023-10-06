package br.com.carstore.model;

public class Car {

    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
