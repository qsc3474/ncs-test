package com.greedy.ncs.model.dto;

public class MemderDTO {
	
	private int num		= 1;
	private String id = "qsc3474";
	private String pwd = "asd3474";
	private String name = "최혁진";
	java.util.Date sds = new  java.util.Date();
	private int stature = 176;
	private int weight 	= 113;
	public MemderDTO() {}
	public MemderDTO(String id, String pwd, String name, int stature, int weight, int num) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.stature = stature;
		this.weight = weight;
		this.num = num;
		this.sds = sds;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStature() {
		return stature;
	}
	public void setStature(int stature) {
		this.stature = stature;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getNum() {
		return num;
	}

	
	
	@Override
	public String toString() {
		return "MemderDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", stature=" + stature + ", weight=" + weight
				+ ", num=" + num + "]";
	}
	
	
	
	
	
	
	

}
