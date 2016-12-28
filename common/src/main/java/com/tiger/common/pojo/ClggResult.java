package com.tiger.common.pojo;

public class ClggResult {

    // 响应业务状态
    private boolean status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static ClggResult build(boolean status, String msg, Object data) {
        return new ClggResult(status, msg, data);
    }

    public static ClggResult ok(Object data) {
        return new ClggResult(data);
    }

    public static ClggResult ok() {
        return new ClggResult(null);
    }

    public ClggResult() {

    }

    public static ClggResult build(boolean status, String msg) {
        return new ClggResult(status, msg, null);
    }

    public ClggResult(boolean status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ClggResult(Object data) {
        this.status = true;
        this.msg = "OK";
        this.data = data;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
