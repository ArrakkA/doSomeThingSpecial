package gms.something.special.domain.customer.repository;

import gms.something.special.domain.customer.entity.GroupBenefit;
import gms.something.special.domain.customer.entity.id.GroupBenefitID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupBenefitRepository extends JpaRepository<GroupBenefit, GroupBenefitID> {
}
