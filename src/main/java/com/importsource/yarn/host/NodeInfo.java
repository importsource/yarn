package com.importsource.yarn.host;

import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

/**
 * cpu信息
 * @author Hezf
 *
 */
public class NodeInfo {
	//通过sigar来获取主机信息
	private static Sigar sigar = new Sigar();
	private int mhz;
	private String vendor;
	private String model;
	private long cacheSize;
	
	private double idle;
	/**
	 * 得到cpu空闲
	 * @return
	 */
	public static double getIdle() {
	       try {
			return sigar.getCpuPerc().getIdle();
		} catch (SigarException e) {
			return 0;
		}
	       
	}
	
	/**
	 * 得到当前剩余内存
	 * @return
	 */
	public static double getMemory() {
	       try {
			return sigar.getMem().getFree();
		} catch (SigarException e) {
			return 0;
		}
	}
	//private String get
	public static void main(String[] args) throws SigarException{
		NodeInfo cpu=new NodeInfo();
		System.out.println(cpu.getIdle());
		cpu();
	}
	
	private static void cpu() throws SigarException {
		Sigar sigar = new Sigar();
        org.hyperic.sigar.CpuInfo[] infos = sigar.getCpuInfoList();
        CpuPerc cpuList[] = null;
        cpuList = sigar.getCpuPercList();
        for (int i = 0; i < infos.length; i++) {// 不管是单块CPU还是多CPU都适用
        	org.hyperic.sigar.CpuInfo info = infos[i];
            System.out.println("第" + (i + 1) + "块CPU信息");
            System.out.println("CPU的总量MHz:    " + info.getMhz());// CPU的总量MHz
            System.out.println("CPU生产商:    " + info.getVendor());// 获得CPU的卖主，如：Intel
            System.out.println("CPU类别:    " + info.getModel());// 获得CPU的类别，如：Celeron
            System.out.println("CPU缓存数量:    " + info.getCacheSize());// 缓冲存储器数量
            printCpuPerc(cpuList[i]);
        }
    }
	
	 private static void printCpuPerc(CpuPerc cpu) {
	        System.out.println("CPU用户使用率:    " + CpuPerc.format(cpu.getUser()));// 用户使用率
	        System.out.println("CPU系统使用率:    " + CpuPerc.format(cpu.getSys()));// 系统使用率
	        System.out.println("CPU当前等待率:    " + CpuPerc.format(cpu.getWait()));// 当前等待率
	        System.out.println("CPU当前错误率:    " + CpuPerc.format(cpu.getNice()));//
	        System.out.println("CPU当前空闲率:    " + CpuPerc.format(cpu.getIdle()));// 当前空闲率
	        System.out.println("CPU总的使用率:    " + CpuPerc.format(cpu.getCombined()));// 总的使用率
	    }
}
