package com.inventor.core.impls;

import com.inventor.core.interfaces.doctors;

public class DefaultDoctors extends DefaultavaiblityHSC implements doctors {

    private String iconName;
    private String experience;
    private String speciality;
    private String phoneNumber;


    @Override
    public String getIconName() {
        return iconName;
    }

    @Override
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    @Override
    public String getExperience() {
        return experience;
    }

    @Override
    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String getSpeciality() {
        return speciality;
    }

    @Override
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
