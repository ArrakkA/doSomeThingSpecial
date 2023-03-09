package gms.something.special.domain.sample;

public interface SampleService {

    void mapperSave(SampleDTO sampleDTO);

    void noMapperSave(SampleDTO sampleDTO);

    String mapperFind(String aaa);

    String noMapperFind(String bbb);

}
