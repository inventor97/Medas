package com.inventor.core.dao.interfaces;

import com.inventor.core.impls.DefaultavaiblityHSC;

import java.util.List;

public interface HealthServCenterDAO extends CommonDAO<DefaultavaiblityHSC> {
    String USER_TABLE_NAME = "pharmacies";
    String HSC_TABLE_NAME = "health_serv_centers";

    void getByAvailablityDays(boolean availablityD);

    void getByAvailablityW(boolean availableW);

    List<DefaultavaiblityHSC> getByRating();

}
