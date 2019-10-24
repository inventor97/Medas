package com.inventor.core.enums;

public enum HSCTypes {

    Hospitals(1), Diagnosis_center(2), Pharmacy(3), Personal_Hospitals(4), Dentistry(5);

    private  Integer id;

    HSCTypes(Integer id) {
        this.id = id;
    }
}
