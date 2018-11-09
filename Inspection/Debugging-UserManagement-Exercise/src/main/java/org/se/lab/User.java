package org.se.lab;

public class User extends Entity
{

	private String username;
	private String password;
	private Group group;

	public User(int id, String username, String password)
	{
		setId(id);
		setUsername(username);
		setPassword(password);
	}

	public User(int id, String username, String password, Group group)
	{
		setId(id);
		setUsername(username);
		setPassword(password);
		setGroup(group);
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		if(username == null)
		{
			throw new IllegalArgumentException();
		}
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		if(password == null)
		{
			throw new IllegalArgumentException();
		}
		this.password = password;
	}


	public Group getGroup()
	{
		return group;
	}

	public void setGroup(Group group)
	{
		if(group == null)
		{
			throw new IllegalArgumentException();
		}
		this.group = group;
	}


	public String toString()
	{
		return getId() + "," + getUsername() + "," + getPassword();
	}

}
