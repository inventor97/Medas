package com.inventor.core.impls;

import com.inventor.core.abstracts.AbstractTreeNode;
import com.inventor.core.interfaces.availablityHSC;


public class DefaultavaiblityHSC extends AbstractTreeNode implements availablityHSC {

    private String workTime;
    private String lunchTime;
    private String availableDays;
    private float rating;


    @Override
    public String getWorkTime() {
        return workTime;
    }

    @Override
    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    @Override
    public String getLunchTime() {
        return lunchTime;
    }

    @Override
    public void setLunchTime(String lunchTime) {
        this.lunchTime = lunchTime;
    }

    @Override
    public String getAvailableDays() {
        return availableDays;
    }

    @Override
    public void setAvailableDays(String availableDays) {
        this.availableDays = availableDays;
    }

    @Override
    public float getRating() {
        return rating;
    }

    @Override
    public void setRating(float rating) {
        this.rating = rating;
    }
}
