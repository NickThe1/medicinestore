package com.nick.software.medicine.medicinestore.store;

import com.nick.software.medicine.medicinestore.base.model.BaseModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@Entity
public class Medicine extends BaseModel {

    private String title;

    private String description;

    @OneToOne()
    private Permission permission;
}
