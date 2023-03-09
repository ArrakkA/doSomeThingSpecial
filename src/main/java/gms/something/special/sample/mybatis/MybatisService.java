package gms.something.special.sample.mybatis;

public interface MybatisService {

    void mapperSave(MybatisDTO mybatisDTO);

    void noMapperSave(MybatisDTO mybatisDTO);

    String mapperFind(String aaa);

    String noMapperFind(String bbb);

}
