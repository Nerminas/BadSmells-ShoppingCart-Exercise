package org.se.lab;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart
{

	private int id;
	List<Article> articles = new ArrayList<>();

	public ShoppingCart(){

	}

	public ShoppingCart(int id, ArrayList<Article> articles)
	{
		this.id = id;
		this.articles = articles;
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder("Cart: " + this.id + "\n");

		for(Article article : articles)
		{
			s.append(article.toString());
		}

		return s.toString();
	}
	
	
	public String toXml()
	{
		StringBuilder xml = new StringBuilder("<shoppingcart id=\"" + id + "\">\n");
		for(Article article : articles)
		{
			xml.append(article.toXml());
		}

		xml.append("</shoppingcart>");
		return xml.toString();
	}
}
