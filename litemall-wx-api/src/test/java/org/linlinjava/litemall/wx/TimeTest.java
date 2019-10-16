package org.linlinjava.litemall.wx;

import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class TimeTest {
    @Test
    public void generateDateTime() {
//        Date date = new Date();
////        Timestamp timestamp = new Timestamp(date.getTime());
////        System.out.println(timestamp);
        System.out.println(LocalDateTime.now());
    }
}
