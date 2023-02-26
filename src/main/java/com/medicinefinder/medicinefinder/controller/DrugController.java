package com.medicinefinder.medicinefinder.controller;

import com.medicinefinder.medicinefinder.dto.DrugResponseDto;
import com.medicinefinder.medicinefinder.entity.Drug;
import com.medicinefinder.medicinefinder.service.DrugService;
import com.medicinefinder.medicinefinder.service.serviceImplementation.DrugServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DrugController {

@Autowired
private DrugServiceImpl drugService;

    @GetMapping("/drug/{id}")
    public Map<String, Object> findDrug(@PathVariable int id) {
        Map<String, Object> response = new HashMap<>();

        try {
//            Drug drug = drugService.getDrugById(id);
            Drug drug = new Drug(1,"Panadol","panadol",0.1,true);
            DrugResponseDto drugResponse = new DrugResponseDto();
            drugResponse.setName(drug.getName());
            drugResponse.setDrugWeight(drug.getDrugWeight());
            drugResponse.setDrugBrand(drug.getDrugBrand());
            response.put("STATUS", "SUCCESS");
            response.put("DATA", drugResponse);
        } catch (Exception ex) {
            response.put("STATUS", "FAILED");
            response.put("MESSAGE", "Oops FAILED " + ex.getMessage());
        }

        return response;
    }

//    @GetMapping("/drugs")
//    public Map<String, Object> viewAllDrugs() {
//        Map<String, Object> response = new HashMap<>();
//
//        try {
//            List<Drug> drug = drugService.getDrugs();
////            Drug drug = new Drug(1,"Panadol","panadol",0.1,true);
//            DrugResponseDto drugResponse = new DrugResponseDto();
//            drugResponse.setName(drug.getDrugName());
//            drugResponse.setDrugWeight(drug.getDrugWeight());
//            drugResponse.setDrugBrand(drug.getDrugBrand());
//            response.put("STATUS", "SUCCESS");
//            response.put("DATA", List<drugResponse>);
//        } catch (Exception ex) {
//            response.put("STATUS", "FAILED");
//            response.put("MESSAGE", "Oops FAILED " + ex.getMessage());
//        }
//
//        return response;
//    }

    @GetMapping("/drug/{name}")
    public Map<String, Object> findDrugByNamee(@PathVariable String name) {
        Map<String, Object> response = new HashMap<>();

        try {
            Drug drug = drugService.getDrugByName(name);
//            Drug drug = new Drug(1,"Panadol","panadol",0.1,true);
            DrugResponseDto drugResponse = new DrugResponseDto();
            drugResponse.setName(drug.getName());
            drugResponse.setDrugWeight(drug.getDrugWeight());
            drugResponse.setDrugBrand(drug.getDrugBrand());
            response.put("STATUS", "SUCCESS");
            response.put("DATA", drugResponse);
        } catch (Exception ex) {
            response.put("STATUS", "FAILED");
            response.put("MESSAGE", "Oops FAILED " + ex.getMessage());
        }

        return response;
    }

    @PostMapping("/drug")
    public Map<String, Object> addDrug(@RequestBody Drug drug) {
        Map<String, Object> response = new HashMap<>();

        try {
            drugService.saveDrug(drug);
//
            response.put("STATUS", "SUCCESS");

        } catch (Exception ex) {
            response.put("STATUS", "FAILED");
            response.put("MESSAGE", "Oops FAILED " + ex.getMessage());
        }

        return response;
    }


}
