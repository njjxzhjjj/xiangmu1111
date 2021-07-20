package com.hp.entity;

public class LiuYan {
	private String timu;
	private String zuozhe;
	private String content;
	public String getTimu() {
		return timu;
	}
	public void setTimu(String timu) {
		this.timu = timu;
	}
	public String getZuozhe() {
		return zuozhe;
	}
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LiuYan(String timu, String zuozhe, String content) {
		super();
		this.timu = timu;
		this.zuozhe = zuozhe;
		this.content = content;
	}
	public LiuYan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LiuYan [timu=" + timu + ", zuozhe=" + zuozhe + ", content="
				+ content + "]";
	}
	
	
}
