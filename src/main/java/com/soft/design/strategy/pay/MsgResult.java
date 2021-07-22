package com.soft.design.strategy.pay;

/**
 * @ClassName MsgResult
 * @Description: 响应结果对象
 * @Author ZhaoZhao.Yu
 * @Date 2021/7/22 21:08
 * @Version V1.0
 **/
public class MsgResult {

    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
