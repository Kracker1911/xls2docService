package xyz.kracker1911.xls2doc.business.entity;

import java.io.Serializable;
import java.util.Date;

public class WeixinUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_user.user_id
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_user.open_id
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    private String openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_user.user_name
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_user.tele_num
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    private String teleNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_user.create_time
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table weixin_user
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.user_id
     *
     * @return the value of weixin_user.user_id
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.user_id
     *
     * @param userId the value for weixin_user.user_id
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.open_id
     *
     * @return the value of weixin_user.open_id
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.open_id
     *
     * @param openId the value for weixin_user.open_id
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.user_name
     *
     * @return the value of weixin_user.user_name
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.user_name
     *
     * @param userName the value for weixin_user.user_name
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.tele_num
     *
     * @return the value of weixin_user.tele_num
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public String getTeleNum() {
        return teleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.tele_num
     *
     * @param teleNum the value for weixin_user.tele_num
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum == null ? null : teleNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.create_time
     *
     * @return the value of weixin_user.create_time
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.create_time
     *
     * @param createTime the value for weixin_user.create_time
     *
     * @mbg.generated Tue Sep 24 15:52:07 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}