package com.springcxf.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter extends XmlAdapter<String,Date> {

    private static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);

    /**
     * 将xml认可的类型转换为日期
     * @param dateStr
     * @return
     * @throws Exception
     */
    @Override
    public Date unmarshal(String dateStr) throws Exception {
        Date praseResult = sdf.parse(dateStr);
        return praseResult;
    }

    /**
     * 将日期类型转换为XML认可的类型
     * @param date
     * @return
     * @throws Exception
     */
    @Override
    public String marshal(Date date) throws Exception {
        String dateStr = sdf.format(date);
        return dateStr;
    }
}
