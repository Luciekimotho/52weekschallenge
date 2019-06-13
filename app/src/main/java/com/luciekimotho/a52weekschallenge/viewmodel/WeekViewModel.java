package com.luciekimotho.a52weekschallenge.viewmodel;

import android.app.Application;
import android.databinding.BaseObservable;
import android.util.Log;

import com.luciekimotho.a52weekschallenge.R;
import com.luciekimotho.a52weekschallenge.model.Week;
import com.luciekimotho.a52weekschallenge.model.WeekCalculation;

public class WeekViewModel extends BaseObservable {

    public String inputStart = "";
    public String outputTotalAmount = "";

    private Week week;
    private WeekCalculation weekCalculation;
    private Application app;

    public WeekViewModel(Application application){
        app = application;
        week = new Week();

    }

    public WeekViewModel(Application application, Week week){
        app = application;
        this.week = week;
        //calculateTotal();
    }

    public void calculateTotal(){
        if (!inputStart.isEmpty()){
            int start = Integer.parseInt(inputStart);
            notifyChange();
            weekCalculation = week.calculateTotal(start);
            updateOutputs();
        }
    }

    public WeekCalculation getWeekCalculation() {
        return weekCalculation;
    }

    public void setInputStartAmount(String inputStartAmount) {
        this.inputStart = inputStartAmount;
    }

    public void clearInputs(){

    }

    private void updateOutputs(){
        outputTotalAmount = ""+ weekCalculation.getTotal() ;
    }
}
