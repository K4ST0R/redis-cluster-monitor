package com.redis.cluster.monitor.model.cluster.node;

public class Master extends Node{
	private Range range;

	public Range getRange() {
		return range;
	}

	public void setRange(Range range) {
		this.range = range;
	}
}
