package org.se.lab;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{

	private int id;
	private List<Article> articles = new ArrayList<Article>();

	public ShoppingCart(){

	}

	public ShoppingCart(int id, ArrayList<Article> articles)
	{
		this.id = id;
		this.articles = articles;
	}

	public String toString()
	{
		String s = "Cart: " + this.id + "\n";

		for(Article article : articles)
		{
			s += article.toString();
		}

		return s;
	}
	
	
	public String toXml()
	{
		String xml = "<shoppingcart id=\"" + id + "\">\n";
		for(Article article : articles)
		{
			xml += article.toXml();
		}

		xml += "</shoppingcart>";
		return xml;
	}
}
