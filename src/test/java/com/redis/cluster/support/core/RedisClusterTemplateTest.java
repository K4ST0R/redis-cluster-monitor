package com.redis.cluster.support.core;

import static org.junit.Assert.assertTrue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.redis.cluster.TestConfig;

public class RedisClusterTemplateTest extends TestConfig {
	private static final Log logger = LogFactory.getLog(RedisClusterTemplateTest.class);
	@Autowired RedisClusterTemplate<String, Object> clusterTemplate;
	
	@Before
	public void setUp(){

	}
	
	@Test
	public void testExists(){
		assertTrue(clusterTemplate.hasKey("docker@10000test:15441"));
	}
	
	@Test
	public void testInfo() {
		System.setProperty("line.separator", "\n");
		logger.info(clusterTemplate.opsForCluster().getClusterInfo());
	}
}
