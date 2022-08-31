package com.example;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.example.Listener.IMEIListener;
import com.example.domain.IMEI;
import com.example.domain.activation_information;
import com.example.service.Actionvation_codeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EasyexceldemoApplicationTests {

    @Autowired
    private Actionvation_codeService actionvation_codeService;

    @Test
    public void test01(){
        /**
         * 注意：写入pathname的路径需要自己建立
         */
        //  获取一个工作簿对象
        ExcelReaderBuilder wordRead =
                EasyExcel.read("D:\\唐彩秘钥\\excel文档\\IMEI.xlsx", IMEI.class,new IMEIListener());
        //  获取一个工作表对象
        ExcelReaderSheetBuilder sheet = wordRead.sheet();
        //  读取工作表中的内容
        sheet.doRead();

    }

    @Test
    public void test02(){
        /**
         * 注意： 读取pathname的路径无需自己建立
         */
        //  工作簿对象
        ExcelWriterBuilder wordWrite = EasyExcel.write("D:\\唐彩秘钥\\excel文档\\激活码test.xlsx", activation_information.class);
        //  工作表对象
        ExcelWriterSheetBuilder sheet = wordWrite.sheet();
        //  写
        sheet.doWrite(actionvation_codeService.list());

    }

}
