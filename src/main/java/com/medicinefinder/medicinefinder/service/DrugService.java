package com.medicinefinder.medicinefinder.service;

import com.medicinefinder.medicinefinder.entity.Drug;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public interface DrugService {

    Drug saveDrug(Drug drug);

    Drug getDrugById(int id);



}
