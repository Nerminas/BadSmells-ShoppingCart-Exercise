package org.se.lab;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArticleServiceTestWithStub
{

	private ArticleTableStub stub;
	private ArticleService service;
	private static final String DESCRIPTION = "Effective Java";

	@Before
	public void setup()
	{
		stub = new ArticleTableStub();
		service = new ArticleService(stub);
	}

	@Test
	public void testAddArticle()
	{
		// setup
		Article book = new Article(1, DESCRIPTION, 3495);

		// exercise
		service.addArticle(book);

		// verify
		Article a = stub.articles.get(0);
		Assert.assertEquals(1, a.getId());
		Assert.assertEquals(DESCRIPTION, a.getDescription());
		Assert.assertEquals(3495, a.getPrice());
	}

	@Test
	public void testAddArticleTableException()
	{
		//setup
		stub.exception = new TableException();
		Article barbell = new Article(1, "Standard 20kg olympic barbell", 699);

		//exercise
		try
		{
			Assert.assertNotNull(stub.exception);
			Assert.assertNotNull(barbell);
			Assert.assertEquals(0, stub.articles.size());
			service.addArticle(barbell);
		}
		catch(ServiceException e)
		{
			//verify
			Assert.assertTrue(e.getCause() instanceof TableException);
		}


	}


	@Test
	public void testNumberOfArticles()
	{
		// setup
		stub.articles = Arrays.asList(new Article(1, DESCRIPTION, 3495),
			new Article(2, "Java Concurrency in Practice", 3895),
			new Article(3, "Clean Code: A Handbook of Agile Software Craftsmanship", 3095));

		// exercise
		int number = service.numberOfArticles();

		// verify
		Assert.assertEquals(3, number);
	}

	@Test
	public void testNumberOfArticlesNullPointerException(){
		//setup
		stub.exception = new NullPointerException();

		//exercise
		try{
			Assert.assertTrue(stub.exception instanceof NullPointerException);
			Assert.assertNotNull(stub.exception);
			service.numberOfArticles();
		}catch(ServiceException e)
		{
			//verify
			Assert.assertTrue(e.getCause() instanceof NullPointerException);
		}

	}

	@Test
	public void testNumberOfArticlesTableException(){
		//setup
		stub.exception = new TableException();

		//exercise
		try{
			Assert.assertTrue(stub.exception instanceof TableException);
			Assert.assertNotNull(stub.exception);
			service.numberOfArticles();
		}catch(ServiceException e)
		{
			//verify
			Assert.assertTrue(e.getCause() instanceof TableException);
		}

	}
}
