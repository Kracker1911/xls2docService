package xyz.kracker1911.xls2doc.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.kracker1911.xls2doc.business.dao.WeixinMessageMapper;
import xyz.kracker1911.xls2doc.business.entity.WeixinMessage;
import xyz.kracker1911.xls2doc.business.entity.WeixinMessageExample;
import xyz.kracker1911.xls2doc.business.service.IWeixinMessageService;

import java.util.Date;
import java.util.List;

@Service
public class WeixinMessageService implements IWeixinMessageService {

    @Autowired
    private WeixinMessageMapper weixinMessageMapper;

    @Override
    public int insertWeixinMessage(String openId, String messageContent) {
        WeixinMessage message = new WeixinMessage();
        message.setMsgContent(messageContent);
        message.setMsgTime(new Date());
        message.setOpenId(openId);
        message.setUserId(0);
        message.setUserName(openId);
        message.setYxbz("Y");
        return weixinMessageMapper.insert(message);
    }

    @Override
    public List<WeixinMessage> findWeixinMessageByContent(String messageContent) {
        WeixinMessageExample example = new WeixinMessageExample();
        example.or().andMsgContentLike("%"+messageContent+"%");
        return weixinMessageMapper.selectByExample(example);
    }

    @Override
    public WeixinMessage findWeixinMessageById(Long msgId) {
        return weixinMessageMapper.selectByPrimaryKey(msgId);
    }

    @Override
    public int deleteWeixinMessageById(Long msgId) {
        return weixinMessageMapper.deleteByPrimaryKey(msgId);
    }

    @Override
    public int banWeixinMessageById(Long msgId) {
        WeixinMessage message = weixinMessageMapper.selectByPrimaryKey(msgId);
        message.setYxbz("N");
        return weixinMessageMapper.updateByPrimaryKey(message);
    }

    @Override
    public int debanWeixinMessageById(Long msgId) {
        WeixinMessage message = weixinMessageMapper.selectByPrimaryKey(msgId);
        message.setYxbz("Y");
        return weixinMessageMapper.updateByPrimaryKey(message);
    }
}
