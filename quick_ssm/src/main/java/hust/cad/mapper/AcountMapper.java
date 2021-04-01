package hust.cad.mapper;

import hust.cad.domain.Acount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


//@Component
public interface AcountMapper {

    //@Insert("insert into acount values(#{id},#{name},#{money}")
    public void save(Acount acount);

   // @Select("select * from acount")
    public List<Acount> findAll();
}
