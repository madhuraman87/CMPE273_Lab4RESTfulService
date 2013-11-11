package edu.sjsu.cmpe.library.ui.views;

import com.yammer.dropwizard.views.View;
import java.util.List;
import edu.sjsu.cmpe.library.domain.Book;

public class HomeView extends View 
{
    private final List<Book> books;

    public HomeView(List<Book> books) 
    {
	super("home.mustache");
	this.books = books;
    }

    public List<Book> getBooks() 
    {
	return books;
    }
}
