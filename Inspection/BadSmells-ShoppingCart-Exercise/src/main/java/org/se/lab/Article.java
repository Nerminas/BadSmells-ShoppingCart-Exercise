package org.se.lab;

abstract class Article
{
	private int id;
	private String description;
	private double price;

	Article(int id, String description, double price)
	{
		this.id = id;
		this.description = description;
		this.price = price;
	}

	int getId()
	{
		return id;
	}

	String getDescription()
	{
		return description;
	}

	double getPrice()
	{
		return price;
	}

	public String toString()
	{
		return getId() + "\t" + getDescription() + "\t" + getPrice() + "\n";
	}

	public String toXml()
	{
		return " id=\"" + getId() + "\" description=\"" + getDescription() + "\" price=\""
			+ getPrice() + "\"/>\n";
	}
}
