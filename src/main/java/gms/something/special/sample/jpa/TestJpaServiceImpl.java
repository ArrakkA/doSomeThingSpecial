package gms.something.special.sample.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TestJpaServiceImpl implements TestJpaService{

    private final TestJpaRepository testJpaRepository;


    @Override
    public void jpaSave(TestExample testExample) {

    }

    @Override
    public String jpaFind(int num) {
        return null;
    }
}
