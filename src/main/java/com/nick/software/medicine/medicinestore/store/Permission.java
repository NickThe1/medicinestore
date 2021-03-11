package com.nick.software.medicine.medicinestore.store;

import com.nick.software.medicine.medicinestore.base.model.BaseModel;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Permission extends BaseModel {


}

enum PermissionType {
    ALL(1),
    DESCRIPTION(2)
    ;

    PermissionType(int type) {

    }
}