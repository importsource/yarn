package com.importsource.yarn.rpc.client;

import com.importsource.rpc.RPC;
import com.importsource.rpc.op.Echo;
import com.importsource.rpc.op.RemoteEcho;
import com.importsource.rpc.support.Server;
import com.importsource.yarn.rpc.service.XService;
import com.importsource.yarn.rpc.service.XServiceImpl;

public class Main {
	public static void main(String[] args) {
		Server server = new RPC.RPCServer();
		server.register(Echo.class, RemoteEcho.class);
		server.register(XService.class, XServiceImpl.class);
		server.start();
	}
}
