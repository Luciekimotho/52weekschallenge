package com.luciekimotho.a52weekschallenge.model;

import android.support.annotation.Nullable;

public class WeekCalculation {
    int deposit;
    int total;
    int start;


    public WeekCalculation(){}

    public WeekCalculation(int start, int deposit, int total){
        this.start = start;
        this.total = total;
        this.deposit = deposit;
    }

    public WeekCalculation(WeekCalculation weekCalculation){
        this.start = weekCalculation.getStart();
        this.deposit = weekCalculation.getDeposit();
        this.total = weekCalculation.getTotal();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof WeekCalculation))
            return false;
        WeekCalculation calculation = (WeekCalculation) obj;
        return (this.start == calculation.getStart()
                && this.deposit == calculation.getDeposit()
                && this.total == calculation.getTotal());
    }

    public int getStart(){
        return start;
    }

    public void setStart(int start){
        this.start = start;
    }

    public int getDeposit(){
        return deposit;
    }

    public void setDeposit(int deposit){
        this.deposit = deposit;
    }

    public int getTotal(){
        return total;
    }

    public void setTotal(int total){
        this.total = total;
    }

}
