package com.importsource.yarn.rpc.service;

import com.importsource.yarn.host.CpuInfo;

public class XServiceImpl implements XService {

	public String getCpu() {
		return String.valueOf(CpuInfo.getIdle());
	}

}
