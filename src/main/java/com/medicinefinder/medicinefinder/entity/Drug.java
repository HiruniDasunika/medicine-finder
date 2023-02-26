package com.medicinefinder.medicinefinder.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "hd_drugs")
public class Drug {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "drug_name")
    private String drugName;

    @Column(name = "drug_brand")
    private String drugBrand;

    @Column(name = "drug_weight")
    private double drugWeight;

    @Column(name = "stock_available")
    private boolean isStockAvailable;

}
