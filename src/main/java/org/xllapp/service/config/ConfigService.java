package org.xllapp.service.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 配置服务.
 *
 * @author dylan.chen Nov 19, 2014
 * 
 */
public class ConfigService {
	
	private SCConfigDao configDao;

	/**
	 * 获取配置.
	 * 
	 * @author: 陈作朋 Nov 21, 2014
	 * @param group 组
	 * @param key 键
	 * @return 配置信息
	 * @throws Exception
	 */
	public SCConfig getConfig(String group,String key) throws Exception{
		return this.configDao.getConfig(group, key);
	}

	/**
	 * 获取指定组中的全部配置.
	 * 
	 * @author: 陈作朋 Nov 21, 2014
	 * @param group 组
	 * @return 配置信息列表
	 * @throws Exception
	 */
	public  List<SCConfig> getGroup(String group) throws Exception{
		return this.configDao.getGroup(group);
	}
	
	/**
	 * 修改配置.
	 * 
	 * @author: 陈作朋 Nov 21, 2014
	 * @param config 新的配置信息
	 * @throws Exception
	 */
	public void setConfig(SCConfig config) throws Exception{
		this.configDao.setConfig(config);
	}

	@Autowired
	public void setConfigDao(SCConfigDao configDao) {
		this.configDao = configDao;
	}
	
}
