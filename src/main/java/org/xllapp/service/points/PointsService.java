package org.xllapp.service.points;

import org.springframework.beans.factory.annotation.Autowired;
import org.xllapp.jms.JMSProducer;

/**
 * 积分服务.
 *
 * @author dylan.chen Nov 21, 2014
 * 
 */
public class PointsService {

	public final static String DEFAULT_QUEUE = "XLLAPP_POINTS";

	private JMSProducer jmsProducer;

	private String queue = DEFAULT_QUEUE;

	/**
	 * 添加积分.
	 * 
	 * @author: 陈作朋 Nov 21, 2014
	 * @param points
	 * @throws Exception
	 */
	public void addPoints(final Points points) throws Exception{
		this.jmsProducer.sendSync(this.queue, points.getProperties());
	}

	@Autowired
	public void setJmsProducer(JMSProducer jmsProducer) {
		this.jmsProducer = jmsProducer;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

}
