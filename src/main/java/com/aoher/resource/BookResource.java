package com.aoher.resource;

import com.aoher.bean.BookDaoBean;
import com.aoher.model.Book;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Stateless
@Path("book")
public class BookResource {

    @Inject
    private BookDaoBean bookDaoBean;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> all() {
        return bookDaoBean.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(Book book) {
        bookDaoBean.save(book);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Book book) {
        bookDaoBean.update(book);
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") Long id){
        Book book = bookDaoBean.find(id);
        bookDaoBean.delete(book);
    }
}
