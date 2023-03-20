package gms.something.special.domain.customer.entity;


import gms.something.special.domain.customer.dto.GroupBenefitRequestDTO;
import gms.something.special.domain.customer.entity.id.GroupBenefitID;
import gms.something.special.globals.common.Common;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ms_benefit")
@IdClass(GroupBenefitID.class)
@EntityListeners(AuditingEntityListener.class)
public class GroupBenefit implements Persistable<GroupBenefitID> {

    @Id
    private String coDiv;                                       //사업장
    @Id
    private String msDivision;                                  //회원구분
    @Id
    private String msClass;                                     //회원등급
    @Id
    private String msLevel;                                     //요금구분

    private String mb_gubun_ect;                                //기타구분
    private String mb_target;                                   //대상

    private int mbFoodRate;                                     //식음료 할인율
    private int mbProshopRate;                                  //프로샵 할인율
    private int mbCartRate;                                     //카트 할인율

    private String mbContent;                                   //혜택내용
    private String mbSday;                                      //적용기간 시작일
    private String mbEday;                                      //적용기간 종료일
    private String mbBigo;                                      //비고

    private String bmEntrustYn;                                 //위임가능 여부

    private int mbEntrustCnt;                                   //위임가능 횟수

    private int mbWeekdayCnt;                                   //골프 주중 횟수
    private int mbWeekendCnt;                                   //골프 주말 횟수
    private int mbCWeekdayCnt;                                  //콘도 주중 횟수
    private int mbCWeekendCnt;                                  //콘도 주말 횟수

    private String inputStaff;                                  //최초 입력자
    @CreatedDate
    private LocalDateTime inputDatetime;
    private String inputIp;

    private String updateStaff;                                 //최종 수정자
    @LastModifiedDate
    private LocalDateTime updateDatetime;
    private String updateIp;

    public GroupBenefit(){
    }

    public GroupBenefit(GroupBenefitRequestDTO dto) {
        this.coDiv = dto.getCoDiv();
        this.msDivision = dto.getMemDivision();
        this.msClass = dto.getMemClass();
        this.msLevel = dto.getLevel();
        this.mb_gubun_ect = dto.getEct();
        this.mb_target = dto.getTarget();
        this.mbFoodRate = dto.getFoodRate();
        this.mbProshopRate = dto.getProShopRate();
        this.mbCartRate = dto.getCartRate();
        this.mbContent = dto.getContent();
        this.mbSday = dto.getStartDay();
        this.mbEday = dto.getEndDay();
        this.mbBigo = dto.getBigo();
        this.bmEntrustYn = Common.ynToString(dto.isEntrustYn());
        this.mbEntrustCnt = dto.getEntrustCnt();
        this.mbWeekdayCnt = dto.getCondoWeekdayCnt();
        this.mbWeekendCnt = dto.getCondoWeekendCnt();
        this.mbCWeekdayCnt = dto.getCondoWeekdayCnt();
        this.mbCWeekendCnt = dto.getCondoWeekendCnt();
        this.inputStaff = dto.getStaff();
        this.inputDatetime = inputDatetime;
        this.inputIp = inputIp;
        this.updateStaff = dto.getStaff();
        this.updateDatetime = updateDatetime;
        this.updateIp = updateIp;
    }

    @Override
    public GroupBenefitID getId() {
        return new GroupBenefitID(coDiv, msDivision, msClass, msLevel);
    }

    @Override
    public boolean isNew() {
        return inputDatetime == null;
    }
}
