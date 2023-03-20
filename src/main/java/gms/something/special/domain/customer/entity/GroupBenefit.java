package gms.something.special.domain.customer.entity;


import gms.something.special.domain.customer.entity.id.GroupBenefitID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "ms_benefit")
@IdClass(GroupBenefitID.class)
public class GroupBenefit {

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
    private LocalDateTime inputDatetime;
    private String inputIp;

    private String updateStaff;                                 //최종 수정자
    private LocalDateTime updateDatetime;
    private String updateIp;

    public GroupBenefit(){
    }

    public GroupBenefit(String coDiv, String msDivision, String msClass, String msLevel, String mb_gubun_ect, String mb_target, int mbFoodRate, int mbProshopRate, int mbCartRate, String mbContent, String mbSday, String mbEday, String mbBigo, String bmEntrustYn, int mbEntrustCnt, int mbWeekdayCnt, int mbWeekendCnt, int mbCWeekdayCnt, int mbCWeekendCnt, String inputStaff, LocalDateTime inputDatetime, String inputIp, String updateStaff, LocalDateTime updateDatetime, String updateIp) {
        this.coDiv = coDiv;
        this.msDivision = msDivision;
        this.msClass = msClass;
        this.msLevel = msLevel;
        this.mb_gubun_ect = mb_gubun_ect;
        this.mb_target = mb_target;
        this.mbFoodRate = mbFoodRate;
        this.mbProshopRate = mbProshopRate;
        this.mbCartRate = mbCartRate;
        this.mbContent = mbContent;
        this.mbSday = mbSday;
        this.mbEday = mbEday;
        this.mbBigo = mbBigo;
        this.bmEntrustYn = bmEntrustYn;
        this.mbEntrustCnt = mbEntrustCnt;
        this.mbWeekdayCnt = mbWeekdayCnt;
        this.mbWeekendCnt = mbWeekendCnt;
        this.mbCWeekdayCnt = mbCWeekdayCnt;
        this.mbCWeekendCnt = mbCWeekendCnt;
        this.inputStaff = inputStaff;
        this.inputDatetime = inputDatetime;
        this.inputIp = inputIp;
        this.updateStaff = updateStaff;
        this.updateDatetime = updateDatetime;
        this.updateIp = updateIp;
    }
}
