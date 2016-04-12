package com.importsource.yarn.rpc.client;

import com.importsource.rpc.RPC;
import com.importsource.yarn.rpc.service.XService;

/**
 * rpc客户端启动器
 * 
 * @author Hezf
 *
 */
public class MainClient {
	public static void main(String[] args) {
			XService xService=RPC.getProxy(XService.class, "127.0.0.1", 20382);
			System.out.println(xService.getCpu());
			System.out.println(xService.getMemory());
	}
}
