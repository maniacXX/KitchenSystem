package com.kitchen.bean;

/**
 * @author chen
 * @date 2018/5/18 18:10
 */
public class ResultBean {


	public static final int SUCCESS = 0;

	public static final int CHECK_FAIL = 1;

	public static final int NO_LOGIN = 2;

	public static final int NO_PERMISSION = 3;
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

	private ResultBean(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static ResultBean success(Object data) {
		return new ResultBean(SUCCESS, "SUCCESS", data);
	}

	public static ResultBean checkFail(Object data) {
		return new ResultBean(CHECK_FAIL, "CHECK_FAIL", data);
	}

	public static ResultBean noLogin(Object data) {
		return new ResultBean(NO_LOGIN, "NO_LOGIN", data);
	}

	public static ResultBean noPermission(Object data) {
		return new ResultBean(NO_PERMISSION, "NO_PERMISSION", data);
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
