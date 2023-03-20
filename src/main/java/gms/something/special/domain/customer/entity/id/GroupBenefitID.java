package gms.something.special.domain.customer.entity.id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
public class GroupBenefitID implements Serializable {
    private String coDiv;
    private String msDivision;
    private String msClass;
    private String msLevel;

    public GroupBenefitID() {
    }

    public GroupBenefitID(String coDiv, String msDivision, String msClass, String msLevel) {
        this.coDiv = coDiv;
        this.msDivision = msDivision;
        this.msClass = msClass;
        this.msLevel = msLevel;
    }
}
