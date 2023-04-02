package material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material{

    public Meat(int id, String name, LocalDate manufacturingDate, int cost, int weight) {
        super(id, name, manufacturingDate, cost,weight);
    }

    @Override
    double getAmount() {

        return cost*weight;
    }

    @Override
    LocalDate getExpirationDate() {
        return manufacturingDate.plusDays(7);
    }
    @Override
    public double getRealMoney() {
        long dayBetween = ChronoUnit.DAYS.between(LocalDate.now(),getExpirationDate());
        int costReal;
        if(dayBetween<0){
            costReal = 0;
        }
        else if (dayBetween>=0 && dayBetween<=5){
            costReal = getCost()-getCost()*30/100;
        }else {
            costReal = getCost() - getCost()*10/100;
        }return costReal*weight;
    }


    @Override
    public double getDifference() {
        return getAmount() - getRealMoney();
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}' ;
    }
}
