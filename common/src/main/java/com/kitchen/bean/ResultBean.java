package com.kitchen.bean;

/**
 * @fileName: ResultBean
 * @author: chen
 * @date: 2018/5/18 18:10
 * @description: controller的返回值
 */
public class ResultBean {
	public static final int SUCCESS = 1;
	public static final int FAILURE = 2;

	/**
	 * 状态码
	 */
	private int code;

	/**
	 * 提示信息
	 */
	private String msg;
	/**
	 * 返回的数据
	 */
	private Object data;

	public ResultBean() {
	}

	public ResultBean(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static ResultBean success(String msg, Object data) {
		return new ResultBean(SUCCESS, msg, data);
	}

	public static ResultBean fail(String msg, Object data) {
		return new ResultBean(FAILURE, msg, data);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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
