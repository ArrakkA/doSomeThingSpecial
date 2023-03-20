package gms.something.special.domain.customer.dto;

import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
public class GroupBenefitRequestDTO {

    private String coDiv;                                      //사업장
    private String memDivision;                                //회원구분
    private String memClass;                                   //회원등급
    private String level;                                      //요금구분

    private String ect;                                        //기타구분
    private String target;                                     //대상

    private int foodRate;                                      //식음료 할인율
    private int proShopRate;                                   //프로샵 할인율
    private int cartRate;                                      //카트 할인율

    private String content;                                     //혜택내용
    private String startDay;                                    //적용기간 시작일
    private String endDay;                                      //적용기간 종료일
    private String bigo;                                        //비고

    private boolean entrustYn;                                  //위임가능 여부

    private int entrustCnt;                                     //위임가능 횟수

    private int golfWeekdayCnt;                                  //골프 주중 횟수
    private int golfWeekendCnt;                                  //골프 주말 횟수
    private int condoWeekdayCnt;                                 //콘도 주중 횟수
    private int condoWeekendCnt;                                 //콘도 주말 횟수

    private String staff;                                        //입력자
}
