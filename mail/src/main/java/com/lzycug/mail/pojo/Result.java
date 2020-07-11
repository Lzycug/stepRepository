
package com.lzycug.mail.pojo;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @author lzycug
 * @param <T>
 * @since 2020-03-24
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -7264375751490927423L;

    private String code = "0";

    private String msg;

    private transient T data;

    public <T> Result() {
    }

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result ok() {
        return new Result(ResultCode.OK.getCode(), ResultCode.OK.getMsg());
    }

    public static <T> Result ok(T data) {
        return new Result(ResultCode.OK.getCode(), ResultCode.OK.getMsg(), data);
    }

    public static Result error() {
        return new Result(ResultCode.ERROR.getCode(), ResultCode.ERROR.getMsg());
    }

    public static Result error(String code) {
        return new Result(code, ResultCode.getMsgByCode(code));
    }

    public static Result error(String code, String msg) {
        return new Result(code, msg);
    }

    public static <T> Result error(String code, T data) {
        return new Result(code, ResultCode.getMsgByCode(code), data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
