package com.inventor.core.impls;

import com.inventor.core.abstracts.AbstractTreeNode;
import com.inventor.core.interfaces.patient;

public class DefaultPatient extends AbstractTreeNode  implements patient {

    private String iconName;
    private String medCardName;
    private String phoneNumber;

    @Override
    public String getIconName() {
        return iconName;
    }

    @Override
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    @Override
    public String getMedCardName() {
        return medCardName;
    }

    @Override
    public void setMedCardName(String medCardName) {
        this.medCardName = medCardName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
