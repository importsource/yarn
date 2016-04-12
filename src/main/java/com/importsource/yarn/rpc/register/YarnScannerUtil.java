package com.importsource.yarn.rpc.register;

import java.util.List;

import com.importsource.rpc.entity.ServiceInfo;
import com.importsource.yarn.common.exc.ServiceNotFoundException;

/**
 * yarn扫描工具使用类
 * 
 * @author Hezf
 *
 */
public class YarnScannerUtil {
	/**
	 * 返回默认包下的服务列表
	 * @return List<ServiceInfo> 服务列表
	 */
	public static List<ServiceInfo> scan(){
		Scanner scanner=new DefaultServiceScanner();
		try {
			return scanner.scan("com.importsource.yarn.rpc.service");
		} catch (ClassNotFoundException e) {
			throw new ServiceNotFoundException(e.getMessage());
		}
	}

}
