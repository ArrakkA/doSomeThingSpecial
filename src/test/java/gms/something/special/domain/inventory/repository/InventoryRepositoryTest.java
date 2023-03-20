package gms.something.special.domain.inventory.repository;

import gms.something.special.domain.inventory.dto.RealAmountRequestDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import static java.time.LocalDateTime.now;

@SpringBootTest
@Transactional
class InventoryRepositoryTest {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Test
    public void 실사값_적용_테스트(){
        //given
        String month = "202303";
        String shopCd = "11";
        String cd ="0401040004";

        RealAmountRequestDTO test = RealAmountRequestDTO.builder()
                .coDiv("65")
                .month(month)
                .pdCd(cd)
                .shopCd(shopCd)
                .pdJegoQty(-11)
                .pdChulQty(6)
                .staff("아일")
                .dateTime(now())
                .ip("10.3.60.60")
                .build();
        //when
        inventoryRepository.realAmount(test);

        int i = inventoryRepository.realAmountFind(month, shopCd, cd);

        //then
        Assertions.assertThat(1).isEqualTo(i);
    }


}