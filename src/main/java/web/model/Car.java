package web.model;

import org.springframework.stereotype.Component;

import java.util.List;

public class Car {

    private long id;
    private String name;
    private int horsePowers;
    private double price;

    public Car() {

    }

    public Car(long id, String name, int horsePowers, double price) {
        this.id = id;
        this.name = name;
        this.horsePowers = horsePowers;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", horsePowers=" + horsePowers +
                ", price=" + price +
                '}';
    }
}
