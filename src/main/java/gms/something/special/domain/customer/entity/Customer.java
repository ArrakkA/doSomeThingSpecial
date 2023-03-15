package gms.something.special.domain.customer.entity;

import gms.something.special.domain.customer.dto.CustomerRequestDTO;
import gms.something.special.globals.common.Common;
import lombok.AccessLevel;
import lombok.Builder;
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

    private String msWeddingday;

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
    private String msEmailYn;
    private String msWedding;

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

    public Customer(CustomerRequestDTO dto, String msNum) {
        this.msNum = msNum;
        this.msNumOld = dto.getOldNum();
        this.msUnitedNum = msUnitedNum;
        this.msMainCodiv = msMainCodiv;
        this.msId = dto.getId();
        this.msPassword = dto.getPassword();
        this.msName = dto.getName();
        this.msStatus = dto.getStatus();
        this.msDivision = dto.getDivision();
        this.msClass = dto.getCusClass();
        this.msLevel = dto.getLevel();
        this.ms_jumin1 = dto.getPersonNum1();
        this.ms_jumin2 = dto.getPersonNum2();
        this.msCha = msCha;
        this.msNational = String.valueOf(dto.getNation());
        this.msSex = dto.getSex();
        this.msBirth = dto.getBirth();
        this.msBirthyl = msBirthyl;
        this.msEmail = dto.getEmail();
        this.msWeddingday = dto.getWeddingDay();
        this.msFirstPhone1 = msFirstPhone1;
        this.msMidPhone1 = msMidPhone1;
        this.msLastPhone1 = msLastPhone1;
        this.msFirstPhone2 = msFirstPhone2;
        this.msMidPhone2 = msMidPhone2;
        this.msLastPhone2 = msLastPhone2;
        this.msBlank = msBlank;
        this.msHometel = dto.getHomeTel();
        this.msHomezip = dto.getHomeZip();
        this.msHomeaddr1 = dto.getHomeAddr1();
        this.msHomeaddr2 = dto.getHomeAddr2();
        this.msCarNo = msCarNo;
        this.smsChk1 = Common.ynToString(dto.isSmsChk1());
        this.smsChk2 = Common.ynToString(dto.isSmsChk2());
        this.msCyberyn = Common.ynToString(dto.isCyberYn());
        this.msVipyn = Common.ynToString(dto.isVipYn());
        this.msImwonyn = Common.ynToString(dto.isImWonYn());
        this.msAreayn = Common.ynToString(dto.isAreaYn());
        this.msEntrustyn = Common.ynToString(dto.isEntrustYn());
        this.msPostYn = Common.ynToString(dto.isPostYn());
        this.msEmailYn = Common.ynToString(dto.isEmailYn());
        this.msWedding = Common.ynToString(dto.isWedding());
        this.msCompanyName = msCompanyName;
        this.msComptel = dto.getCompanyTel();
        this.msCompfax = msCompfax;
        this.msCompzip = dto.getCompanyZip();
        this.msCompaddr1 = dto.getCompanyAddr1();
        this.msCompaddr2 = dto.getCompanyAddr2();
        this.msCompPostYn = Common.ynToString(dto.isPostYn());
        this.msCompposition = msCompposition;
        this.msDmH = msDmH;
        this.msDmC = msDmC;
        this.msDmdam = msDmdam;
        this.msDmtel = msDmtel;
        this.msDmfax = msDmfax;
        this.msDmemail = msDmemail;
        this.msWeekdayCnt = msWeekdayCnt;
        this.msWeekendCnt = msWeekendCnt;
        this.msUnregiCnt = msUnregiCnt;
        this.msEntrustCnt = dto.getEntrustCnt();
        this.msInsuday = msInsuday;
        this.msFirstday = msFirstday;
        this.msTakeAmt = msTakeAmt;
        this.msRegday = msRegday;
        this.msEndday = msEndday;
        this.inputStaff = dto.getAdmin();
        this.inputDatetime = inputDatetime;
        this.inputIp = inputIp;
        this.updateStaff = dto.getAdmin();
        this.updateDatetime = updateDatetime;
        this.updateIp = updateIp;
    }
}
