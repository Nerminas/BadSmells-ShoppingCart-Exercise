package org.se.lab;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order
	extends Entity
{

	private Date date;

	public Order(int id, Date date)
	{
		setId(id);
		setDate(date);
	}

	public Date getDate()
	{
		return this.date;
	}
	private void setDate(Date date)
	{
		this.date = date;
	}
	
	
	private final List<OrderLine> lines = new ArrayList<>();
	public void addLine(OrderLine line)
	{
		if(line == null) 
			throw new IllegalArgumentException();
		lines.add(line);
	}
	public List<OrderLine> getLines()
	{
		return lines;
	}
	
	
	@Override
	public String toString()
	{
		SimpleDateFormat f = new SimpleDateFormat ("dd.MM.yyyy");
		
		return getId() + "," + f.format(getDate()) + getLines();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Order order = (Order) o;

		return (date != null ? date.equals(order.date) : order.date == null) && (lines != null ? lines.equals(order.lines) : order.lines == null);
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (date != null ? date.hashCode() : 0);
		result = 31 * result + (lines != null ? lines.hashCode() : 0);
		return result;
	}
}
