package org.se.lab;

import java.util.ArrayList;
import java.util.List;

public class Group extends Entity
{

	private String name;
	private List<User> users = new ArrayList<>();

	public Group(int id, String name)
	{
		setId(id);
		setName(name);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		if(name == null)
		{
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	public void addUser(User user)
	{
		if(user == null)
		{
			throw new IllegalArgumentException();
		}
		this.users.add(user);
	}

	public List<User> getUsers()
	{
		return users;
	}

}
