package gms.something.special.domain.customer.service;


import gms.something.special.domain.customer.dto.GroupBenefitRequestDTO;
import gms.something.special.domain.customer.entity.GroupBenefit;
import gms.something.special.domain.customer.entity.id.GroupBenefitID;
import gms.something.special.domain.customer.repository.GroupBenefitRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class GroupBenefitServiceImpl implements GroupBenefitService{


    private final GroupBenefitRepository groupBenefitRepository;

    public GroupBenefitServiceImpl(GroupBenefitRepository groupBenefitRepository) {
        this.groupBenefitRepository = groupBenefitRepository;
    }

    @Override
    public GroupBenefit giveBenefit(GroupBenefitRequestDTO dto, String ip) {

        GroupBenefitID id = new GroupBenefitID(dto.getCoDiv(), dto.getMemDivision(), dto.getMemClass(), dto.getLevel());
        Optional<GroupBenefit> byId = groupBenefitRepository.findById(id);

        GroupBenefit groupBenefit;
        if(byId.isPresent()){
            GroupBenefit benefit = byId.get();
            benefit.setDto(dto, ip);
            groupBenefit = benefit;
        }else {
            groupBenefit = new GroupBenefit(dto, ip);
        }

        return groupBenefitRepository.save(groupBenefit);


    }
}
