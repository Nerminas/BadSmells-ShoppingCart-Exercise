package org.se.lab;

import java.util.ArrayList;
import java.util.List;

class ArticleTableStub implements ArticleTable
{
	List<Article> articles = new ArrayList<>();
	RuntimeException exception;
	
	
	public void insert(Article article)
	{
		if(exception != null)
			throw exception;
		
		articles.add(article);
	}

	public void update(Article p)
	{

	}

	public void delete(int id)
	{

	}

	public Article findById(int id)
	{
		return null;
	}

	public List<Article> findAll()
	{
		if(exception != null)
			throw exception;

		return articles;
	}
}
