package org.se.lab;

import java.util.Collections;
import java.util.List;

public class OrderTableStub implements OrderTable
{
	Order order;
	//RuntimeException because NullPointer and TableException extend RuntimeException
	RuntimeException exception;

	@Override
	public void insertOrder(Order order)
	{
		//Left empty because not needed for test
	}

	@Override
	public void deleteOrder(int id)
	{
		//Left empty because not needed for test
	}

	@Override
	public List<Order> findAllOrders()
	{
		return Collections.emptyList();
	}

	@Override
	public Order findOrderById(int id)
	{
		if(exception == null)
		{
			return order;
		}
		else
		{
			throw exception;
		}
	}
}
