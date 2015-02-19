package org.xllapp.service.config;

import java.util.List;

import org.xllapp.mybatis.MyBatisRepository;

/**
 * 配置信息表Dao接口.
 *
 * @author dylan.chen Nov 20, 2014
 * 
 */
@MyBatisRepository
public interface SCConfigDao {
	
	SCConfig getConfig(String group,String key);

	List<SCConfig> getGroup(String group);
	
	public void setConfig(SCConfig config);

}
