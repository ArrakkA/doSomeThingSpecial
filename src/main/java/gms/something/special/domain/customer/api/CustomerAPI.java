package gms.something.special.domain.customer.api;

import gms.something.special.domain.customer.dto.CustomerRequestDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(tags = "회원 관련 API")
public class CustomerAPI {


    @ApiOperation(value = "회원 신상 등록")
    @PostMapping("v1/customer")
    public ResponseEntity registerCustomer(
            @RequestBody CustomerRequestDTO dto
            ){







        return ResponseEntity.ok().build();
    }







}
