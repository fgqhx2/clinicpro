package cn.ali.drug;

import cn.ali.drug.mapper.DrugMapper;
import cn.ali.drug.pojo.Drug;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Tests {
    @Autowired
    DrugMapper drugMapper;
    @Test
    public void test() {
        List<Drug> drugs=drugMapper.findDrugByDrug_typeOrDrugNameOrPinYinCode(null,"替");
        for (Drug d:drugs
             ) {
            System.out.println(d.toString());
        }
    }



}
