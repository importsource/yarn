package com.importsource.yarn.rpc.service;

import com.importsource.yarn.host.NodeInfo;

public class XServiceImpl implements XService {

	public String getCpu() {
		return String.valueOf(NodeInfo.getIdle());
	}

	public String getMemory() {
		return String.valueOf(NodeInfo.getMemory());
	}

}
