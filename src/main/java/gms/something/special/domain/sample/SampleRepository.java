package gms.something.special.domain.sample;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleRepository {

    void save1(SampleDTO sampleDTO);

    @Insert("insert into " +
            "aaa(aaa, bbb) " +
            "values( #{aaa}, #{bbb} ) ")
    void save2(SampleDTO sampleDTO);

    String find1(String aaa);

    @Select("select a.aaa from aaa a" +
            " where a.bbb = #{bbb} ")
    String find2(String bbb);

}
