package org.se.lab;

class User extends Entity
{

	private String username;
	private String password;
	private Group group;

	User(int id, String username, String password)
	{
		setId(id);
		setUsername(username);
		setPassword(password);
	}

	User(int id, String username, String password, Group group)
	{
		setId(id);
		setUsername(username);
		setPassword(password);
		setGroup(group);
	}

	String getUsername()
	{
		return username;
	}

	private void setUsername(String username)
	{
		if(username == null)
		{
			throw new IllegalArgumentException();
		}
		this.username = username;
	}

	String getPassword()
	{
		return password;
	}

	private void setPassword(String password)
	{
		if(password == null)
		{
			throw new IllegalArgumentException();
		}
		this.password = password;
	}


	Group getGroup()
	{
		return group;
	}

	void setGroup(Group group)
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
