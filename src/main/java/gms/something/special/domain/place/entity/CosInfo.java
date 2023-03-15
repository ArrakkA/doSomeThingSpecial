package gms.something.special.domain.place.entity;


import gms.something.special.domain.place.entity.id.CosInfoID;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "cos_info")
@IdClass(CosInfoID.class)
@NoArgsConstructor
@Getter
public class CosInfo {

    @Id
    private String coDiv;

    @Id
    private String cosCd;

    private int cosPar;
    private int cosLength;
    private int cosArea1;
    private int cosArea2;
    private int cosTeeTotal;

    private int cosTee1Yds;
    private int cosTee2Yds;
    private int cosTee3Yds;
    private int cosTee4Yds;
    private int cosTee5Yds;

    private int cosTee1Area;
    private int cosTee2Area;
    private int cosTee3Area;
    private int cosTee4Area;
    private int cosTee5Area;

    private int cosGreen;
    private int cosGreenColor;

    private int cosBunkerTotal;
    private int cosBunker1;
    private int cosBunker2;
    private int cosBunker3;
    private int cosBunker4;
    private int cosBunker5;

    private int cosFwBunker1;
    private int cosFwBunker2;
    private int cosFwBunker3;
    private int cosFwBunker4;
    private int cosFwBunker5;

    private int cosRoughTotal;
    private int cosRough1;
    private int cosRough2;
    private int cosRough3;

    private int cosPondArea;
    private int cosPondTon;
    private int cosPondDeep;

    private int cosSpGnHd;
    private int cosSpGnQc;
    private int cosSpGnEv;
    private int cosSpTeeHd;
    private int cosSpTeeQc;
    private int cosSpTeeEv;
    private int cosSpFwHd;
    private int cosSpFwQc;
    private int cosSpFwEv;
    private int cosSpArea;
    private int cosFwArea;

    private int cosCctv;
    private int cosLighting;
    private int cosMap;
    private int cosWash;
    private int cosTong;

    private String inputStaff;
    private LocalDateTime inputDatetime;
    private String inputIp;

    private String updateStaff;
    private LocalDateTime updateDatetime;
    private String updateIp;









}
