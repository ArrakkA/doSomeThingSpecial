package gms.something.special.domain.customer.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "ms_maininfo")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Customer {

    @Id
    private String msNum;

    private String msNumOld;
    private String msUnitedNum;
    private String msMainCodiv;

    private String msId;
    private String msPassword;
    private String msName;

    //회원 권한
    private String msStatus;
    private String msDivision;
    private String msClass;
    private String msLevel;

    //개인 정보
    private String ms_jumin1;
    private String ms_jumin2;
    private String msCha;
    private String msNational;
    private String msSex;
    private String msBirth;
    private String msBirthyl;
    private String msEmail;
    private String msEmailYn;

    private String msWeddingday;
    private String msWedding;
    //핸드폰 번호
    private String msFirstPhone1;
    private String msMidPhone1;
    private String msLastPhone1;

    private String msFirstPhone2;
    private String msMidPhone2;
    private String msLastPhone2;

    private String msBlank;
    private String msHometel;
    private String msHomezip;
    private String msHomeaddr1;
    private String msHomeaddr2;

    private String msCarNo;

    //권한 관련
    private String smsChk1;
    private String smsChk2;

    private String msCyberyn;
    private String msVipyn;
    private String msImwonyn;
    private String msAreayn;
    private String msEntrustyn;
    private String msPostYn;

    //Company 내용
    @Column(name = "ms_compnm")
    private String msCompanyName;

    private String msComptel;
    private String msCompfax;
    private String msCompzip;
    private String msCompaddr1;
    private String msCompaddr2;
    private String msCompPostYn;
    private String msCompposition;

    // dm? 관련
    private String msDmH;
    private String msDmC;
    private String msDmdam;
    private String msDmtel;
    private String msDmfax;
    private String msDmemail;

    //횟수
    private int msWeekdayCnt;
    private int msWeekendCnt;
    private int msUnregiCnt;

    private int msEntrustCnt;

    //날짜 관련
    private String msInsuday;
    private String msFirstday;
    private int msTakeAmt;
    private String msRegday;
    private String msEndday;

    private String inputStaff;
    private LocalDateTime inputDatetime;
    private String inputIp;

    private String updateStaff;
    private LocalDateTime updateDatetime;
    private String updateIp;












}
