package xyz.kracker1911.xls2doc.business.service;

public interface IWeixinCacheService {

    void associateSeqOpnByEvent(String QRSequences, String QROpenId);
    void associateOpnPersonByUploadData(String QROpenId, Integer personId);
}
