package org.xllapp.service.points;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.xllapp.service.points.Points;
import org.xllapp.service.points.PointsService;
import org.xllapp.service.test.BaseTest;

/**
 *
 *
 * @Copyright: Copyright (c) 2014 FFCS All Rights Reserved 
 * @Company: 北京福富软件有限公司 
 * @author 陈作朋 Nov 21, 2014
 * @version 1.00.00
 * @history:
 * 
 */
//@Ignore
public class PointsServiceTest extends BaseTest {

	@Autowired
	private PointsService pointsService;
	
	@Test
	public void testAddPoints() throws Exception{
		Points points=new Points("test","189");
		points.addProperty("abc", "123");
		this.pointsService.addPoints(points);
	}
	
}
