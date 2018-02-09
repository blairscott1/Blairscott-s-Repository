package com.snsoft.crm.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionBean {
	private Object[] obj;//数组类型注入
	private List list;//List/Set类型注入
	private Map map;//Map类型注入
	private Properties prop;//Properties类型注入
	public Object[] getObj() {
		return obj;
	}
	public void setObj(Object[] obj) {
		this.obj = obj;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "CollectionBean [obj=" + Arrays.toString(obj) + ", list=" + list + ", map=" + map + ", prop=" + prop
				+ "]";
	}
}