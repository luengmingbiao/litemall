package org.linlinjava.litemall.wx.util;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

public class Md5Util {
    /**
     * 生成24位的md5字符串
     * @param targetStr
     * @return
     */
    public static String getMd5Str(String targetStr)
    {
        String str = null;
        //确定计算方法
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            str=base64en.encode(md5.digest(targetStr.getBytes("utf-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;

    }
}
