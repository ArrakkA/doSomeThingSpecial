package gms.something.special.domain.inventory.repository;

import gms.something.special.domain.inventory.dto.RealAmountRequestDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InventoryRepository {

        void realAmount(RealAmountRequestDTO dto);
        int realAmountFind(String month, String shopCd, String cd);


}
