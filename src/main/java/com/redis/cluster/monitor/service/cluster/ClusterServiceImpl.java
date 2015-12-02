package com.redis.cluster.monitor.service.cluster;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisClusterNode;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.stereotype.Service;

import com.redis.cluster.support.core.RedisClusterTemplate;

@Service
public class ClusterServiceImpl implements ClusterService {
	private static final Log logger = LogFactory.getLog(ClusterServiceImpl.class);
	@Autowired RedisClusterTemplate<String, Object> clusterTemplate;
	
	@Override
	public void info() {
		logger.info(clusterTemplate.getClusterOps().getClusterInfo());
	}

	@Override
	public void slots() {
		Set<RedisClusterNode> nodes = clusterTemplate.getClusterOps().getClusterNodes();
		logger.info(nodes);
	}

	@Override
	public void nodes() {
		Set<RedisClusterNode> nodes = clusterTemplate.getClusterOps().getClusterNodes();
		logger.info(nodes);
	}

	@Override
	public void nodesInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nodeInfo(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void server(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clients(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memory(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persistence(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stats(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replication(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cpu(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cluster(RedisNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyspace(RedisNode node) {
		// TODO Auto-generated method stub
		
	}
}
