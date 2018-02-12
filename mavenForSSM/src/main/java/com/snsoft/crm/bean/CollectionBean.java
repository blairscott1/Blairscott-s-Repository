package com.snsoft.crm.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionBean {
	private Object[] arr;//数组类型注入
	private List list;//List/Set类型注入
	private Map map;//Map类型注入
	private Properties prop;//Properties类型注入
	public Object[] getArr() {
		return arr;
	}
	public void setArr(Object[] arr) {
		this.arr = arr;
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
		return "CollectionBean [\n arr=" + Arrays.toString(arr) + ",\n list=" + list + ",\n map=" + map + ",\n prop=" + prop
				+ "]";
	}
}