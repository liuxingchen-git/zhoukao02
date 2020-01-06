package com.liuxingchen.week2.domain;

import java.math.BigInteger;
import java.util.Date;

public class Column {
	
	private BigInteger id;
	private String keywords;
	private String description;
	private String name;
	private String goods;
	private String address;
	private Double money;
	private Date cdate;
	private Date jdate;
	private String jtype;
	private String clowrite;
	private String startmoney;
	private String endmoney;
	private String startcdate;
	private String endcdate;
	private String startjdate;
	private String endjdate;
	public Column() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public String getJtype() {
		return jtype;
	}
	public void setJtype(String jtype) {
		this.jtype = jtype;
	}
	public String getClowrite() {
		return clowrite;
	}
	public void setClowrite(String clowrite) {
		this.clowrite = clowrite;
	}
	public String getStartmoney() {
		return startmoney;
	}
	public void setStartmoney(String startmoney) {
		this.startmoney = startmoney;
	}
	public String getEndmoney() {
		return endmoney;
	}
	public void setEndmoney(String endmoney) {
		this.endmoney = endmoney;
	}
	public String getStartcdate() {
		return startcdate;
	}
	public void setStartcdate(String startcdate) {
		this.startcdate = startcdate;
	}
	public String getEndcdate() {
		return endcdate;
	}
	public void setEndcdate(String endcdate) {
		this.endcdate = endcdate;
	}
	public String getStartjdate() {
		return startjdate;
	}
	public void setStartjdate(String startjdate) {
		this.startjdate = startjdate;
	}
	public String getEndjdate() {
		return endjdate;
	}
	public void setEndjdate(String endjdate) {
		this.endjdate = endjdate;
	}
	
}
