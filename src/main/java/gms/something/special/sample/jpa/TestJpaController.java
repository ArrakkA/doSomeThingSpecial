package gms.something.special.sample.jpa;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(tags = {"샘플 데이터 JPA API"})
public class TestJpaController {
}
