package cn.ekgc.doctor.base.pojo.vo;

import cn.ekgc.doctor.base.pojo.enums.ResponseCode;

import java.io.Serializable;
import java.util.List;

/**
 * <b>基础信息功能 - 系统响应视图信息</b>
 * <p>
 *     系统响应视图信息设置如下属性：
 *     1. code：系统响应编码<br/>
 *     2. message：系统响应结果<br/>
 *     3. data：系统响应数据<br/>
 *     本项目所有功能返回前端数据<b>都必须以本系统响应视图信息返回 </b>
 * </p>
 *
 * @author 李帅旗
 * @date 2021/12/29
 * @since
 */
public class ResponseVO implements Serializable {
	private static final long serialVersionUID = -8020502991037770572L;
	private String code;                //系统响应编码
	private String message;             //系统响应信息
	private Object data;                //系统响应数据

	public ResponseVO(ResponseCode responseCode, String message, Object data) {
		this.code = responseCode.getCode();
		this.message = message;
		this.data = data;
	}

	/**
	 * <b>获得系统处理完毕，响应成功视图信息</b>
	 * @param message
	 * @return
	 */
	public static ResponseVO success(String message){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message,"");
	}

	/**
	 * <b>系统业务逻辑处理完毕，系统响应成功视图信息</b>
	 * @param message
	 * @param data
	 * @return
	 */
	public static ResponseVO success(String message, Object data){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS, message, data);
	}

	/**
	 * <b>获得系统未认证用户视图信息</b>
	 * @return
	 */
	public static ResponseVO unAuth(){
		return new ResponseVO(ResponseCode.RESPONSE_UNAUTH, ResponseCode.RESPONSE_UNAUTH.getRemark(), "");
	}

	/**
	 * <b>系统业务逻辑处理错误视图信息</b>
	 * @param errorMessage
	 * @return
	 */
	public static ResponseVO error(String  errorMessage){
		return new ResponseVO(ResponseCode.RESPONSE_ERROR,errorMessage,"");
	}

	/**
	 * <b>获得系统响应异常视图信息</b>
	 * @param e
	 * @return
	 */
	public static ResponseVO exception(Exception e){
		return new ResponseVO(ResponseCode.RESPONSE_EXCEPTION, e.getMessage(), "");
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
