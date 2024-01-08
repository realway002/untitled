package com.lv.bean.sitech;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class OsMsgAlarmInst implements Serializable {
    private Long msgAlarmInstId;

    private String busiType;

    private String busiSubType;

    private String busiOrderNo;

    private Date shouldSendDate;

    private String sendFlag;

    private Date sendDate;

    private String tmpCode;

    private String tmpContent;

    private Date createDate;

    private String note;

    private String servLoginNo;

    private String servNumber;

    private static final long serialVersionUID = 1L;

    public Long getMsgAlarmInstId() {
        return msgAlarmInstId;
    }

    public void setMsgAlarmInstId(Long msgAlarmInstId) {
        this.msgAlarmInstId = msgAlarmInstId;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public String getBusiSubType() {
        return busiSubType;
    }

    public void setBusiSubType(String busiSubType) {
        this.busiSubType = busiSubType == null ? null : busiSubType.trim();
    }

    public String getBusiOrderNo() {
        return busiOrderNo;
    }

    public void setBusiOrderNo(String busiOrderNo) {
        this.busiOrderNo = busiOrderNo == null ? null : busiOrderNo.trim();
    }

    public Date getShouldSendDate() {
        return shouldSendDate;
    }

    public void setShouldSendDate(Date shouldSendDate) {
        this.shouldSendDate = shouldSendDate;
    }

    public String getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag == null ? null : sendFlag.trim();
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getTmpCode() {
        return tmpCode;
    }

    public void setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode == null ? null : tmpCode.trim();
    }

    public String getTmpContent() {
        return tmpContent;
    }

    public void setTmpContent(String tmpContent) {
        this.tmpContent = tmpContent == null ? null : tmpContent.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getServLoginNo() {
        return servLoginNo;
    }

    public void setServLoginNo(String servLoginNo) {
        this.servLoginNo = servLoginNo == null ? null : servLoginNo.trim();
    }

    public String getServNumber() {
        return servNumber;
    }

    public void setServNumber(String servNumber) {
        this.servNumber = servNumber == null ? null : servNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", msgAlarmInstId=").append(msgAlarmInstId);
        sb.append(", busiType=").append(busiType);
        sb.append(", busiSubType=").append(busiSubType);
        sb.append(", busiOrderNo=").append(busiOrderNo);
        sb.append(", shouldSendDate=").append(shouldSendDate);
        sb.append(", sendFlag=").append(sendFlag);
        sb.append(", sendDate=").append(sendDate);
        sb.append(", tmpCode=").append(tmpCode);
        sb.append(", tmpContent=").append(tmpContent);
        sb.append(", createDate=").append(createDate);
        sb.append(", note=").append(note);
        sb.append(", servLoginNo=").append(servLoginNo);
        sb.append(", servNumber=").append(servNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_msg_alarm_inst
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table os_msg_alarm_inst
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private OsMsgAlarmInst obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new OsMsgAlarmInst();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.msg_alarm_inst_id
         *
         * @param msgAlarmInstId the value for os_msg_alarm_inst.msg_alarm_inst_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder msgAlarmInstId(Long msgAlarmInstId) {
            obj.setMsgAlarmInstId(msgAlarmInstId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.busi_type
         *
         * @param busiType the value for os_msg_alarm_inst.busi_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder busiType(String busiType) {
            obj.setBusiType(busiType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.busi_sub_type
         *
         * @param busiSubType the value for os_msg_alarm_inst.busi_sub_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder busiSubType(String busiSubType) {
            obj.setBusiSubType(busiSubType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.busi_order_no
         *
         * @param busiOrderNo the value for os_msg_alarm_inst.busi_order_no
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder busiOrderNo(String busiOrderNo) {
            obj.setBusiOrderNo(busiOrderNo);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.should_send_date
         *
         * @param shouldSendDate the value for os_msg_alarm_inst.should_send_date
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder shouldSendDate(Date shouldSendDate) {
            obj.setShouldSendDate(shouldSendDate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.send_flag
         *
         * @param sendFlag the value for os_msg_alarm_inst.send_flag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder sendFlag(String sendFlag) {
            obj.setSendFlag(sendFlag);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.send_date
         *
         * @param sendDate the value for os_msg_alarm_inst.send_date
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder sendDate(Date sendDate) {
            obj.setSendDate(sendDate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.tmp_code
         *
         * @param tmpCode the value for os_msg_alarm_inst.tmp_code
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder tmpCode(String tmpCode) {
            obj.setTmpCode(tmpCode);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.tmp_content
         *
         * @param tmpContent the value for os_msg_alarm_inst.tmp_content
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder tmpContent(String tmpContent) {
            obj.setTmpContent(tmpContent);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.create_date
         *
         * @param createDate the value for os_msg_alarm_inst.create_date
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createDate(Date createDate) {
            obj.setCreateDate(createDate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.note
         *
         * @param note the value for os_msg_alarm_inst.note
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder note(String note) {
            obj.setNote(note);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.serv_login_no
         *
         * @param servLoginNo the value for os_msg_alarm_inst.serv_login_no
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder servLoginNo(String servLoginNo) {
            obj.setServLoginNo(servLoginNo);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column os_msg_alarm_inst.serv_number
         *
         * @param servNumber the value for os_msg_alarm_inst.serv_number
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder servNumber(String servNumber) {
            obj.setServNumber(servNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public OsMsgAlarmInst build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table os_msg_alarm_inst
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        msgAlarmInstId("msg_alarm_inst_id", "msgAlarmInstId", "BIGINT", false),
        busiType("busi_type", "busiType", "VARCHAR", false),
        busiSubType("busi_sub_type", "busiSubType", "VARCHAR", false),
        busiOrderNo("busi_order_no", "busiOrderNo", "VARCHAR", false),
        shouldSendDate("should_send_date", "shouldSendDate", "TIMESTAMP", false),
        sendFlag("send_flag", "sendFlag", "VARCHAR", false),
        sendDate("send_date", "sendDate", "TIMESTAMP", false),
        tmpCode("tmp_code", "tmpCode", "VARCHAR", false),
        tmpContent("tmp_content", "tmpContent", "VARCHAR", false),
        createDate("create_date", "createDate", "TIMESTAMP", false),
        note("note", "note", "VARCHAR", false),
        servLoginNo("serv_login_no", "servLoginNo", "VARCHAR", false),
        servNumber("serv_number", "servNumber", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table os_msg_alarm_inst
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}