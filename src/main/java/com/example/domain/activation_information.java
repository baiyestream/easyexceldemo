package com.example.domain;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;
import java.util.Date;

@Data
public class activation_information {
    /**
     *  id
     */
    @ExcelProperty(value = "id",index = 7)
    @ExcelIgnore
    private Long id;
    /**
     *  客户名称
     */
    @ExcelProperty(value = "客户名称",index = 0)
    @ColumnWidth(20)
    private String username;
    /**
     *  平台名称
     */
    @ExcelProperty(value = "平台名称",index = 1)
    @ColumnWidth(20)
    private String appplatform;
    /**
     *  应用名称
     */
    @ExcelProperty(value = "应用名称",index = 2)
    @ColumnWidth(30)
    private String applyname;
    /**
     *  Imei 1
     */
    @ExcelProperty(value = "Imei 1",index = 3)
    @ColumnWidth(30)
    private Long imei1;
    /**
     *  Imei 2
     */
    @ExcelProperty(value = "Imei 2",index = 4)
    @ColumnWidth(30)
    private Long imei2;
    /**
     *  激活码
     */
    @ColumnWidth(30)
    @ExcelProperty(value = "激活码",index = 5)
    private String activationcode;
    /**
     *  激活状态
     */
    @ExcelProperty(value = "激活状态",index = 8)
    @ExcelIgnore
    private int status;
    /**
     *  激活时间
     */
    @ColumnWidth(20)
    @ExcelProperty(value = "激活时间",index = 6)
    private Date activationtime;
}
