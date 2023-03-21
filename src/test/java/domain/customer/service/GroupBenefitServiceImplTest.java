package domain.customer.service;

import gms.something.special.domain.customer.dto.GroupBenefitRequestDTO;
import gms.something.special.domain.customer.entity.GroupBenefit;
import gms.something.special.domain.customer.service.GroupBenefitService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class GroupBenefitServiceImplTest {
    private final GroupBenefitService groupBenefitService;

    GroupBenefitServiceImplTest(GroupBenefitService groupBenefitService) {
        this.groupBenefitService = groupBenefitService;
    }


    @Test
    public void benefit_저장_테스트(){

        //given
        String content = "프로샵12, 카트5 , 식음 11";

        GroupBenefitRequestDTO build = GroupBenefitRequestDTO.builder()
                .coDiv("65")
                .memDivision("11")
                .memClass("00")
                .level("13")
                .ect("일반 등록자")
                .target("일반")
                .foodRate(11)
                .proShopRate(12)
                .cartRate(5)
                .content("프로샵12, 카트5 , 식음 11")
                .startDay("20230320")
                .endDay("20230420")
                .bigo("아일")
                .staff("아일")
                .entrustYn(true)
                .golfWeekdayCnt(0)
                .golfWeekendCnt(2)
                .condoWeekdayCnt(3)
                .condoWeekendCnt(1)
                .build();

        String ip = "10.3.60.60";

        //when
        GroupBenefit groupBenefit = groupBenefitService.giveBenefit(build, ip);

        //then
        Assertions.assertThat(content).isEqualTo(groupBenefit.getMbContent());

    }










}