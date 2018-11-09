package org.se.lab;

public class OrderLine extends Entity
{

	private Product product;
	private int quantity;

	OrderLine(int id, int quantity, Product product)
	{
		setId(id);
		setQuantity(quantity);
		setProduct(product);
	}

	int getQuantity()
	{
		return quantity;
	}

	private void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	Product getProduct()
	{
		return product;
	}

	private void setProduct(Product product)
	{
		this.product = product;
	}

	@Override
	public String toString()
	{
		return getId() + "," + getQuantity() + "," + getProduct();
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

		OrderLine orderLine = (OrderLine) o;

		return quantity == orderLine.quantity && (product != null ? product
			.equals(orderLine.product) : orderLine.product == null);
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + quantity;
		result = 31 * result + (product != null ? product.hashCode() : 0);
		return result;
	}
}
