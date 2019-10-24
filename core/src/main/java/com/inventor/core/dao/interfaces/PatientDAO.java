package com.inventor.core.dao.interfaces;

import com.inventor.core.impls.DefaultPatient;

import java.util.List;

public interface PatientDAO extends CommonDAO<DefaultPatient> {

    String PATIENT_TABLE_NAME = "patients";


}
