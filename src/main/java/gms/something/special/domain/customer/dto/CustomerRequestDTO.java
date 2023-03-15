package gms.something.special.domain.customer.dto;

import lombok.Data;

@Data
public class CustomerRequestDTO {

    private String oldNum;                // null or 존재

    private String name;                  //이름
    private String id;                    //아이디
    private String password;              //비밀번호

    private String division;

    private String level;
    private String status;                //01 or null

    private String cusClass;
    //회원 등급
    //00 비회원 01 등록자
    //14 예약광고 18 제휴사 21 에이전시
    //31 연회원 32 시즌쿠폰 33 월회원
    //34 연습장기타 35 연습장미등록

    //개인 정보
    private String sex;                   //성별
    private String birth;                  //생일
    private int nation;                   //국적  1:국내 , 2:국외
    private String email;                 //이메일
    private String weddingDay;            //결혼 기념일

    private String personNum1;            //주민번호
    private String personNum2;

    private String carNum;                //차 번호
    private String handy;                 //핸디


    private String homeZip;               //집
    private String homeAddr1;
    private String homeAddr2;
    private String homeTel;

    private String companyZip;             //회사
    private String companyAddr1;
    private String companyAddr2;
    private String companyTel;

    private boolean emailYn;               //이메일 수신 여부
    private boolean wedding;               //결혼 여부
    private boolean smsChk1;               //핸드폰 sms
    private boolean smsChk2;               //예약(담당자) sms
    private boolean vipYn;                 //vip 여부
    private boolean imWonYn;               //임원 여부
    private boolean cyberYn;               //사이버 회원 여부
    private boolean postYn;                //우편 수신 여부
    private boolean areaYn;                //지역회원 여부
    private boolean entrustYn;             //위임가능 여부

    private int entrustCnt;                //위임가능 횟수

    private String admin;                  //입력한 사람

}
