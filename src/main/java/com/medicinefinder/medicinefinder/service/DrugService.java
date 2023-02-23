package com.medicinefinder.medicinefinder.service;

import com.medicinefinder.medicinefinder.entity.Drug;



public interface DrugService {

    Drug saveDrug(Drug drug);

    Drug getDrugById(int id);



}
