package com.inventor.core.dao.interfaces;

import com.inventor.core.impls.DefaultAddess;

import java.util.List;

public interface AdressDAO extends CommonDAO<DefaultAddess> {

    String ADRESS_REGION_TABLE_NAME = "region";
    String ADRESS_DISTRICT_TABLE_NAME = "district";
    String ADRESS_THE_COUNTRY_TABLE_NAME = "the_country";

}
