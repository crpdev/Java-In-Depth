package com.crpdev.thrillio.dao;

import com.crpdev.thrillio.DataStore;
import com.crpdev.thrillio.entities.User;

public class UserDao {

	public User[] getUsers() {
		return DataStore.getUsers();
	}

}
