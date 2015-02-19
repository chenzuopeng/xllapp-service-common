package org.xllapp.service.sms;

import java.util.Map;

/**
 * 短信服务.
 *
 * @author dylan.chen Nov 21, 2014
 * 
 */
public class SMSService {

	/**
	 * 发送短信.
	 * 
	 * @param recipient 接收者
	 * @param content　　　短信内容
	 * @throws Exception
	 */
	public void sendSMS(String recipient,String content) throws Exception{
		//TODO 实现发送短信
	}
	
	/**
	 * 获取短信内容.
	 * 
	 * @param productId 　　产品Id
	 * @param clientType  客户端类型
	 * @param smsType     短信类型
	 * @param osType　　　　　　系统类型
	 * @param args　　　　　　　　短信模板参数
	 * @return 短信内容
	 * @throws Exception
	 */
	public String getSMSContent(String productId,String clientType,String smsType,String osType,Map<String,String> args) throws Exception{
		//TODO 实现获取短信内容
		return null;
	}
}
