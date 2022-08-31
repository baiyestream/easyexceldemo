package com.example.Listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.domain.IMEI;

public class IMEIListener extends AnalysisEventListener<IMEI> {
    /**
     * 每读取一行数据，都会调用一次invoke,在invoke可以操作使用读取到的数据
     * @param imei
     * @param analysisContext
     */
    @Override
    public void invoke(IMEI imei, AnalysisContext analysisContext) {
        System.out.println("IEMI:"+imei);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
