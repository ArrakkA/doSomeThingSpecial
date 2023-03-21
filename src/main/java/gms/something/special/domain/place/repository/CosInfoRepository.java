package gms.something.special.domain.place.repository;

import gms.something.special.domain.place.entity.CosInfo;
import gms.something.special.domain.place.entity.id.CosInfoID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CosInfoRepository extends JpaRepository<CosInfo, CosInfoID> {
}
