package com.chetan.standalone.collection;

import java.util.List;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Properties dbdetail;

	public Properties getDbdetail() {
		return dbdetail;
	}

	public void setDbdetail(Properties dbdetail) {
		this.dbdetail = dbdetail;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", dbdetail=" + dbdetail + "]";
	}



}
