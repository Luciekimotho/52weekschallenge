package com.luciekimotho.a52weekschallenge.model;

public class Week {

    public WeekCalculation calculateTotal(int start){
        int prevdepo = 0;
        int prevtotal = 0;
        int deposit = 0;
        int total = 0;
        WeekCalculation calculation = new WeekCalculation();
        calculation.setStart(start);

        for (int i = 1; i < 53; i++) {
            deposit = start + prevdepo;
            total = prevtotal + deposit;

            calculation.setDeposit(deposit);
            calculation.setTotal(total);

            prevdepo = deposit;
            prevtotal = total;
        }
        return calculation;
    }
}

