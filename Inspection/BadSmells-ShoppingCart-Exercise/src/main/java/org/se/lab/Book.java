package org.se.lab;

public class Book extends Article
{
	private String author;

	public Book()
	{

	}

	public Book(int id, String description, double price, String author)
	{
		super(id, description, price);
		this.author = author;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	@Override
	public String toString()
	{
		return getClass().getSimpleName().toUpperCase() + ":\t" + getId()+ "\t" + getDescription() + "\t" + getAuthor() + "\t" + getPrice() + "\n";
	}

	@Override
	public String toXml()
	{
		return "\t<" + getClass().getSimpleName().toLowerCase()+" id=\"" + getId() + "\" description=\"" + getDescription()
			+ "\" price=\"" + getPrice()
			+ "\" author=\"" + getAuthor() + "\"/>\n";
	}

}
