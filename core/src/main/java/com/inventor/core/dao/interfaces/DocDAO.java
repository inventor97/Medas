package com.inventor.core.dao.interfaces;

import com.inventor.core.impls.DefaultDoctors;

import java.util.List;

public interface DocDAO extends CommonDAO<DefaultDoctors>{

    String DOCTOR_TABLE_NAME = "doctors";

    List<DefaultDoctors> getBySpeciality();

    List<DefaultDoctors> getByRating();

    void getByAvailablity(boolean availablity);

}
