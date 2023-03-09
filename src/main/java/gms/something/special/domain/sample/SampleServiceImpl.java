package gms.something.special.domain.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class SampleServiceImpl implements SampleService{

    private final SampleRepository sampleRepository;

    @Override
    public void mapperSave(SampleDTO sampleDTO) {
        sampleRepository.save1(sampleDTO);
    }

    @Override
    public void noMapperSave(SampleDTO sampleDTO) {
        sampleRepository.save2(sampleDTO);
    }

    @Override
    public String mapperFind(String aaa) {
        return sampleRepository.find1(aaa);
    }

    @Override
    public String noMapperFind(String bbb) {
        return sampleRepository.find2(bbb);
    }
}
