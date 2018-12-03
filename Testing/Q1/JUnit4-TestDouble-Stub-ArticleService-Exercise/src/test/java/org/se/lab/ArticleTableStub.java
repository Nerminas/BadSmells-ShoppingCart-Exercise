package org.se.lab;

import java.util.ArrayList;
import java.util.List;

class ArticleTableStub implements ArticleTable
{
	List<Article> articles = new ArrayList<>();
	RuntimeException exception;

	@Override
	public void insert(Article article)
	{
		if(exception == null)
		{
			if(article != null)
			{
				articles.add(article);
			}
			else
			{
				throw new NullPointerException();
			}
		}
		else
		{
			throw exception;
		}
	}

	@Override
	public void update(Article article)
	{
		//intentionally left empty
	}

	@Override
	public void delete(int id)
	{
		//intentionally left empty

	}

	@Override
	public Article findById(int id)
	{
		return null;
	}

	@Override
	public List<Article> findAll()
	{
		if(exception == null)
		{
			return articles;
		}
		else
		{
			throw exception;
		}
	}
}
