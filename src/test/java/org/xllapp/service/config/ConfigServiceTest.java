package org.xllapp.service.config;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.xllapp.service.config.SCConfig;
import org.xllapp.service.config.ConfigService;
import org.xllapp.service.test.BaseTest;

/**
 *
 *
 * @Copyright: Copyright (c) 2014 FFCS All Rights Reserved 
 * @Company: 北京福富软件有限公司 
 * @author 陈作朋 Nov 20, 2014
 * @version 1.00.00
 * @history:
 * 
 */
//@Ignore
public class ConfigServiceTest extends BaseTest{

	@Autowired
	private ConfigService configService;
	
	@Test
	public void testGetConfig() throws Exception{
		System.out.println(this.configService.getConfig("a", "1"));
	}
	
	@Test
	public void testGetGroup() throws Exception{
		System.out.println(this.configService.getGroup("a"));
	}
	
	@Test
	public void testSetConfig() throws Exception{
		SCConfig config=new SCConfig();
		config.setGroup("a");
		config.setKey("1");
		config.setValue("bbb");
		config.setRemark("aaa");
		this.configService.setConfig(config);
		System.out.println(this.configService.getConfig(config.getGroup(), config.getKey()));
	}
	
}
