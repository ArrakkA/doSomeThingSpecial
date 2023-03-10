package gms.something.special.sample.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MybatisServiceImpl implements MybatisService {

    private final MybatisRepository mybatisRepository;

    @Override
    public void mapperSave(MybatisDTO mybatisDTO) {
        mybatisRepository.save1(mybatisDTO);
    }

    @Override
    public void noMapperSave(MybatisDTO mybatisDTO) {
        mybatisRepository.save2(mybatisDTO);
    }

    @Override
    public String mapperFind(String aaa) {
        return mybatisRepository.find1(aaa);
    }

    @Override
    public String noMapperFind(String bbb) {
        return mybatisRepository.find2(bbb);
    }
}
