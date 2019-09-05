package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Form;

@Mapper
public interface FormMapper {
	List<Form> selectAll();
    void insert(@Param("form") Form form);
	

}
