package cn.ali.drug.mapper;

import cn.ali.drug.pojo.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugMapper {

    List<Drug> findDrugByDrug_typeOrDrugNameOrPinYinCode(@Param("drug_typeId")Integer drug_typeId,@Param("drugNameOrPinYinCode")String drugNameOrPinYinCode);



}
