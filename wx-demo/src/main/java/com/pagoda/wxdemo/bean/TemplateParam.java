package com.pagoda.wxdemo.bean;

//模板消息参数
public class TemplateParam {
	
	//参数名
	private String name;
	//参数值
	private String value;
	//颜色
	private String color;
	
	public TemplateParam(String name, String value, String color) {
		super();
		this.name = name;
		this.value = value;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TemplateParam [name=" + name + ", value=" + value + ", color=" + color + "]";
	}

}
