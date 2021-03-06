package xyz.kracker1911.xls2doc.business.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.kracker1911.xls2doc.business.entity.WeixinMessage;
import xyz.kracker1911.xls2doc.business.entity.WeixinMessageExample;

public interface WeixinMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    long countByExample(WeixinMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    int deleteByExample(WeixinMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    int deleteByPrimaryKey(Long msgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    int insert(WeixinMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    int insertSelective(WeixinMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    List<WeixinMessage> selectByExample(WeixinMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    WeixinMessage selectByPrimaryKey(Long msgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") WeixinMessage record, @Param("example") WeixinMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    int updateByExample(@Param("record") WeixinMessage record, @Param("example") WeixinMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    int updateByPrimaryKeySelective(WeixinMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_message
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    int updateByPrimaryKey(WeixinMessage record);
}