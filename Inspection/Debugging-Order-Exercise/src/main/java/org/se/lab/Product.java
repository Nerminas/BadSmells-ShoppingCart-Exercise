package org.se.lab;


public class Product extends Entity
{
	private String desc;
	private long price;

	public Product(int id, String desc, long price)
	{
		setId(id);
		setDesc(desc);
		setPrice(price);
	}

	public String getDesc()
	{
		return this.desc;
	}

	private void setDesc(String desc)
	{
		if(desc == null)
		{
			throw new IllegalArgumentException();
		}
		else if(desc.trim().equals(""))
		{
			throw new IllegalArgumentException();
		}
		else
		{
			this.desc = desc;
		}

	}

	public long getPrice()
	{
		return price;
	}

	private void setPrice(long price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return getId() + "," + getDesc() + "," + getPrice();
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

		return price == product.price && (desc != null ? desc.equals(product.desc)
			: product.desc == null);
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (desc != null ? desc.hashCode() : 0);
		result = 31 * result + (int) (price ^ (price >>> 32));
		return result;
	}
}
