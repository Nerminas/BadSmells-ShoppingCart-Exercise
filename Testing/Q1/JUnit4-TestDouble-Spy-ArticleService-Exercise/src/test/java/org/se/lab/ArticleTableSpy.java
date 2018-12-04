package org.se.lab;

import java.util.ArrayList;
import java.util.List;

class ArticleTableSpy implements ArticleTable
{

	List<String> logs = new ArrayList<>();
	private ArticleTable table;

	public ArticleTableSpy(ArticleTable table)
	{
		if(table != null)
		{
			this.table = table;
		}
		else
		{
			throw new TableException();
		}
	}

	@Override
	public void insert(Article article)
	{
		if(article != null)
		{
			logs.add("ArticleTable.insert(" + article.toString() + ")");
			table.insert(article);
		}
		else
		{
			throw new NullPointerException();
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
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleTable.findAll()");
		List<Article> articles = table.findAll();
		for(Article article : articles)
		{
			builder.append(article.toString());
			builder.append("; ");
		}
		builder.append(")");
		logs.add(builder.toString());
		return articles;
	}
}
