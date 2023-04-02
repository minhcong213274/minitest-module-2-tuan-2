package material;

import java.time.LocalDate;
import java.util.Date;

public abstract class Material {
     int id;
    String name;
    LocalDate manufacturingDate;
     int cost;
     int weight;

    public Material(int id, String name, LocalDate manufacturingDate, int cost,int weight) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
        this.weight = weight;
    }

    abstract double getAmount();
    abstract LocalDate getExpirationDate();
    abstract double getRealMoney();
    abstract double getDifference();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
