package gms.something.special.domain.inventory.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class RealAmountRequestDTO {
    private String coDiv;
    private String month;
    private String shopCd;
    private String pdCd;
    private int pdJegoQty;
    private int pdChulQty;
    private String staff;
    private LocalDateTime dateTime;
    private String ip;
}
