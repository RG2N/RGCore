package me.RG2N.RGCore;

public class Main {
	
	String prefix = "[RGCore] ";
	
	public void onEnable() {
		log("RGCore loaded!");
	}
	
	public void onDisable() {
		log("RGCore loaded!");
	}
	
	public void log(String msg) {
		System.out.println(prefix + msg);
	}

}
