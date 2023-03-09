package gms.something.special.domain.sample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@Api(tags = {"샘플 데이터 Mybatis API"})
public class SampleController {

    private final SampleService sampleService;

    @ApiOperation(value = "mapper 사용 저장")
    @PostMapping("v1/sample/mapper")
    public ResponseEntity sampleMapperRegister(
            @RequestBody SampleDTO sampleDTO
    ){
        sampleService.mapperSave(sampleDTO);

        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "mapper 사용 안한 저장")
    @PostMapping("v1/sample/no_mapper")
    public ResponseEntity sampleNoMapperRegister(
            @RequestBody SampleDTO sampleDTO
    ){
        sampleService.noMapperSave(sampleDTO);

        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "mapper 사용 찾기")
    @GetMapping("v1/sample/mapper")
    public ResponseEntity sampleMapperFind(
            @RequestParam String aaa
    ){
        String result = sampleService.mapperFind(aaa);

        return ResponseEntity.ok().body(result);
    }

    @ApiOperation(value = "mapper 사용 찾기")
    @GetMapping("v1/sample/no_mapper")
    public ResponseEntity sampleNoMapperFind(
            @RequestParam String bbb
    ){
        String result = sampleService.noMapperFind(bbb);

        return ResponseEntity.ok().body(result);
    }


}
