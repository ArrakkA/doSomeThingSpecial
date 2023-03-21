package gms.something.special.sample.mybatis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class MybatisRepositoryTest {

    @Autowired
    private MybatisRepository mybatisRepository;

    @Test
    public void mapper_sample_테스트(){
        //given
        String aaa = "1";
        String bbb = "2";

        MybatisDTO mybatisDTO = new MybatisDTO(aaa, bbb);

        //when
        mybatisRepository.save1(mybatisDTO);
        //then
        String findEquals = mybatisRepository.find1(aaa);

        Assertions.assertThat(bbb).isEqualTo(findEquals);
    }

    @Test
    public void no_mapper_sample_테스트(){
        //given
        String aaa = "1";
        String bbb = "2";

        MybatisDTO mybatisDTO = new MybatisDTO(aaa, bbb);

        //when
        mybatisRepository.save2(mybatisDTO);
        String findEquals = mybatisRepository.find2(bbb);

        //then
        Assertions.assertThat(aaa).isEqualTo(findEquals);
    }


}