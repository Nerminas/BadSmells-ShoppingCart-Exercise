package org.se.lab;

import java.util.Objects;

@SuppressWarnings("WeakerAccess")
public class Product extends Entity
{
	private String description;
	private long price;


	public Product(long id, String description, long price)
	{
		setId(id);
		setDescription(description);
		setPrice(price);
	}


	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		if(description == null)
		{
			throw new IllegalArgumentException();
		}
		this.description = description;
	}

	public long getPrice()
	{
		return price;
	}

	public void setPrice(long price)
	{
		if(price < 0)
		{
			throw new IllegalArgumentException();
		}
		this.price = price;
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
		Product product = (Product) o;
		return price == product.price && Objects.equals(description, product.description);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), description, price);
	}

	@Override
	public String toString()
	{
		return "Product{id=" + getId() + ", description=" + getDescription() + ", price=" + getPrice() +"}";
	}
}
