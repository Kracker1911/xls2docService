package xyz.kracker1911.xls2doc.business.service;

import xyz.kracker1911.xls2doc.exception.AesException;

import java.io.InputStream;

public interface IWeixinService {
    String getQRUrl();
    String handleEventFromWeixin(InputStream requestInputStream) throws AesException;
    String createMPMenu(String appId, String appSecret);
    void refreshTextReply();
}
