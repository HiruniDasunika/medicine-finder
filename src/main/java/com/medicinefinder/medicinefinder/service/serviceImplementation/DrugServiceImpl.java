package com.medicinefinder.medicinefinder.service.serviceImplementation;

import com.medicinefinder.medicinefinder.entity.Drug;
import com.medicinefinder.medicinefinder.repository.DrugRepository;
import com.medicinefinder.medicinefinder.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "drugService")
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugRepository repository;
    @Override
    public Drug saveDrug(Drug drug) {
        return repository.save(drug);
    }

    @Override
    public Drug getDrugById(int id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Drug> getDrugs() {
        return repository.findAll();
    }

    public Drug getDrugByName(String drug_name) {
        return repository.findByName(drug_name);
    }





}
