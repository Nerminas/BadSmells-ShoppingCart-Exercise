package org.se.lab;

@SuppressWarnings("WeakerAccess")
public class OrderLine extends Entity
{

	private int quantity;
	private Product product;


	public OrderLine(long id, int quantity, Product product)
	{
		setId(id);
		setQuantity(quantity);
		setProduct(product);
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		if(quantity < 0)
		{
			throw new IllegalArgumentException();
		}
		this.quantity = quantity;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		if(product == null)
		{
			throw new IllegalArgumentException();
		}
		this.product = product;
	}


	public String toString()
	{
		return "OrderLine{id=" + getId() + ", quantity=" + getQuantity() + ", product="
			+ getProduct() + "}";
	}
}
