package org.se.lab;

import java.util.ArrayList;
import java.util.List;

class Group extends Entity
{

	private String name;
	private final List<User> users = new ArrayList<>();

	Group(int id, String name)
	{
		setId(id);
		setName(name);
	}

	String getName()
	{
		return name;
	}

	private void setName(String name)
	{
		if(name == null)
		{
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	void addUser(User user)
	{
		if(user == null)
		{
			throw new IllegalArgumentException();
		}
		this.users.add(user);
	}

	List<User> getUsers()
	{
		return users;
	}

}
