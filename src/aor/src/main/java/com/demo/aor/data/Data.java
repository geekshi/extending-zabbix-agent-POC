package com.demo.aor.data;

public class Data {
	private int cpuLoad;
	private int memLoad;
	
	public Data(){}
	
	public Data(int cpuLoad, int memLoad){
		this.cpuLoad = cpuLoad;
		this.memLoad = memLoad;
	}
	
	public int getCpuLoad(){
		return cpuLoad;
	}
	
	public void setCpuLoad(int cpuLoad){
		this.cpuLoad = cpuLoad;
	}
	
	public int getMemLoad(){
		return memLoad;
	}
	
	public void setMemLoad(int memLoad){
		this.memLoad = memLoad;
	}
}
