package material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrispyFlour extends Material {
    public CrispyFlour(int id, String name, LocalDate manufacturingDate, int cost, int weight) {
        super(id, name, manufacturingDate, cost,weight);
    }

    @Override
    double getAmount() {
       return weight*cost;
    }

    @Override
    LocalDate getExpirationDate() {
       return manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {
        long dayBetween = ChronoUnit.DAYS.between(LocalDate.now(),getExpirationDate());
        int costReal;
        if(dayBetween<0){
            costReal = 0;
        }
        else if (dayBetween>=0 && dayBetween<60){
            costReal = cost-cost*40/100;
        }else if(dayBetween>=60 && dayBetween<=120){
            costReal = cost-cost*20/100;
        }
        else {
            costReal = cost - cost*5/100;
        }return costReal*weight;
    }

    @Override
    public double getDifference() {
        return getAmount() - getRealMoney();
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + weight +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
