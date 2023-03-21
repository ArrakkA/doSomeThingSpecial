package gms.something.special.domain.customer.service;

import gms.something.special.domain.customer.dto.GroupBenefitRequestDTO;
import gms.something.special.domain.customer.entity.GroupBenefit;

public interface GroupBenefitService {

    GroupBenefit giveBenefit(GroupBenefitRequestDTO dto, String ip);

}
