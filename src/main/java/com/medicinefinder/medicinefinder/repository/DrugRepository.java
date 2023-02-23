package com.medicinefinder.medicinefinder.repository;

import com.medicinefinder.medicinefinder.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepository extends JpaRepository<Drug,Integer> {
}
