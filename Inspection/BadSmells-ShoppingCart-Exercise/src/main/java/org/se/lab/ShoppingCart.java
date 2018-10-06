package org.se.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart
{

	public int id;
	public List<Article> articles = new ArrayList<Article>();

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
		for(Iterator it = articles.iterator(); it.hasNext();)
		{
			Article a = (Article)it.next();	
			/*switch(a.type)
			{
				case BOOK:
					xml += "\t<book id=\"" + a.id + "\" description=\"" + a.description 
							+ "\" price=\"" + a.price  
							+ "\" author=\"" + a.author + "\"/>\n";
				break;
				
				case CD:
					xml += "\t<cd id=\"" + a.id + "\" description=\"" + a.description 
						+ "\" price=\"" + a.price + "\"/>\n";
				break;
				
				case DVD:
					xml += "\t<dvd id=\"" + a.id + "\" description=\"" + a.description 
					+ "\" price=\"" + a.price + "\"/>\n";
				break;
			}*/
		}				
		xml += "</shoppingcart>";
		return xml;
	}
}
