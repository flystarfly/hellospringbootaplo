package com.flystarfly.hellospringbootaplo.immoc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;



/**
 *
 *
 * 描述:
 *
 * @author 001298
 * @created 2016年11月25日 上午11:39:22
 * @since v1.0.0
 */
public class JsonResult implements Serializable {

    /**
     * serialVersionUID:
     */
    private static final long serialVersionUID = -4444713437166205428L;

    private boolean isSuccess = true;

    private String message = "操作成功";

    private String code = "2000";

    private String ticket;

    private String jsessionid;

    private Map<String, Object> datas = new HashMap<String, Object>();

    private String tipsCode;

    public static JsonResult getInstance() {
        return new JsonResult();
    }

    public JsonResult() {
    }

    public JsonResult(boolean success) {
        this.isSuccess = success;
    }

    public JsonResult(String message) {
        this.message = message;
    }

    public JsonResult(boolean success, String message) {
        this.isSuccess = success;
        this.message = message;
    }

    public JsonResult(boolean success, String message, String errorMessage) {
        this.isSuccess = success;
        if (success) {
            this.message = message;
        } else {
            this.message = errorMessage;
        }
    }


    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getDatas() {
        return datas;
    }

    public JsonResult setData(Object obj) {
        this.datas.put("data", obj);
        return this;
    }

    public JsonResult setPage(Object obj) {
        this.datas.put("page", obj);
        return this;
    }

    public JsonResult setList(Object obj) {
        this.datas.put("list", obj);
        return this;
    }

    public JsonResult getList(Object obj) {
        this.datas.get("list");
        return this;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the ticket
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the jsessionid
     */
    public String getJsessionid() {
        return jsessionid;
    }

    /**
     * @param jsessionid the jsessionid to set
     */
    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }


    public void setSuccess(String msg) {
        setIsSuccess(true);
        setMessage(msg);
    }

    public String getTipsCode() {
        return tipsCode;
    }

    public void setTipsCode(String tipsCode) {
        this.tipsCode = tipsCode;
    }
}


