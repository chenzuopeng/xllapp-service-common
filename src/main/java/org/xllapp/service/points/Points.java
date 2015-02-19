package org.xllapp.service.points;

import java.util.HashMap;
import java.util.Map;

/**
 *　积分实体.
 *
 * @author dylan.chen Nov 21, 2014
 * 
 */
public class Points {
	
	public final static String PN_POINTS_TYPE="points_type";
	
	public final static String PN_USER_ID="user_id";

	private Map<String, String> properties = new HashMap<String, String>();
	
	
	
	/**
	 * 构造函数.
	 * 
	 * @param pointsType 积分类型
	 * @param userId 用户Id
	 */
	public Points(String pointsType,String userId){
		addProperty(PN_POINTS_TYPE, pointsType);
		addProperty(PN_USER_ID, userId);
	}
	
	public void addProperty(String propertyName,String propertyValue){
		this.properties.put(propertyName, propertyValue);
	}

	public Map<String, String> getProperties() {
		return this.properties;
	}

}
