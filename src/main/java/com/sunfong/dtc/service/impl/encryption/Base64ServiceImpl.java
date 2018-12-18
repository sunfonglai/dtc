package com.sunfong.dtc.service.impl.encryption;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author wfr14
 */
public class Base64ServiceImpl {
    /**
     * Base64转码
     * @param text 需要转码的字符串
     * @param chartSet 转码的字符集,默认为UTF-8
     * @return 返回转码以后的字符串
     */
    public String encode(String text ,String chartSet) {
        try {
            BASE64Encoder encoder = new BASE64Encoder();
            byte[] textByte = text.getBytes(chartSet);
            return encoder.encode(textByte);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param text 需要转码的字符串
     * @param chartSet 转码的字符集,默认为UTF-8
     * @return 返回转码以后的字符串
     */
    public String decode(String text ,String chartSet){
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] textByte = decoder.decodeBuffer(text);
            return new String(textByte,chartSet);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
