package com.inventor.core.interfaces;

public interface availablityHSC<T extends availablityHSC> extends TreeNode<T> {

    String getWorkTime();

    void setWorkTime(String workTime);

    String getLunchTime();

    void setLunchTime(String lunchTime);

    String getAvailableDays();

    void setAvailableDays(String availableDays);

    float getRating();

    void setRating(float rating);
}
