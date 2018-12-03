package org.se.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class Order extends Entity
{
	private String name;
	private List<OrderLine> lines = new ArrayList<>();

	public Order(long id, String name)
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

	public void addOrderLine(OrderLine line)
	{
		if(line == null)
		{
			throw new IllegalArgumentException();
		}
		lines.add(line);
	}

	public List<OrderLine> getOrderLines()
	{
		return lines;
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o == null || getClass() != o.getClass())
		{
			return false;
		}
		if(!super.equals(o))
		{
			return false;
		}
		Order order = (Order) o;
		return Objects.equals(name, order.name) && Objects.equals(lines, order.lines);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), name, lines);
	}

	@Override
	public String toString()
	{
		return "Order{id=" + getId() + ", orderLines=" + getOrderLines() + "}";
	}
}
