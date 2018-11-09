package org.se.lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupTest
{
	private Group g;
	private String userHomer;
	private String userMarge;
	private String groupName;


	@Before
	public void setup()
	{
		userHomer = "homer";
		userMarge = "marge";
		groupName = "students";

		g = new Group(1, groupName);

		User u1 = new User(3, userHomer, "***");
		u1.setGroup(g);
		g.addUser(u1);

		User u2 = new User(5, userMarge, "***", g);
		g.addUser(u2);
	}


	@Test
	public void testUsers()
	{
		Assert.assertEquals(2, g.getUsers().size());

		Assert.assertEquals(userHomer, g.getUsers().get(0).getUsername());
		Assert.assertEquals(userMarge, g.getUsers().get(1).getUsername());
	}


	@Test
	public void testUserToGroupToUser()
	{
		User u1 = g.getUsers().get(0);
		Assert.assertEquals(userHomer, u1.getUsername());

		Assert.assertEquals(groupName, u1.getGroup().getName());
	}
}
