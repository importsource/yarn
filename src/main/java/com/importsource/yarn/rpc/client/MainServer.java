package com.importsource.yarn.rpc.client;

import java.util.List;

import com.importsource.rpc.RPC;
import com.importsource.rpc.entity.ServiceInfo;
import com.importsource.rpc.support.Server;
import com.importsource.yarn.rpc.register.YarnScannerUtil;

/**
 * 
 * rpc 服务启动器
 * @author Hezf
 *
 */
public class MainServer {
	public static void main(String[] args) {
		Server server = new RPC.RPCServer();
		List<ServiceInfo> services=YarnScannerUtil.scan();
		server.register(services);
		server.start();
	}
}
