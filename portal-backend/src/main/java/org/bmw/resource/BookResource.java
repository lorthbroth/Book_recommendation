package org.bmw.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import org.bmw.model.Book;
import org.bmw.repository.BookRepository;
import org.bson.types.ObjectId;

import java.net.URI;
import java.net.URISyntaxException;

@Path("/books")
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") String id) {
        Book book = bookRepository.findById(new ObjectId(id));
        return Response.ok(book).build();
    }

    @POST
    public Response creat(Book book) throws URISyntaxException {
        bookRepository.persist(book);
        return Response.created(new URI("/" + book.id)).build();
    }
}
