package com.bmw.resource;

import com.bmw.model.Book;
import com.bmw.model.User;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookRecommendationResource {
    @POST
    @Path("/users")
    public void createUser(User user){
        //implement user creation logic and save to MongoDB
    }

    @GET
    @Path("/users")
    public List<User> getAllUsers(){
        //Logic to fetch all users from mongodb
        return User.listAll();
    }

    @POST
    @Path("/books")
    public void createBook(Book book) {
        // Implement book creation logic and save to MongoDB
    }

    @GET
    @Path("/books")
    public List<Book> getAllBooks() {
        // Implement logic to fetch all books from MongoDB
        return Book.listAll();
    }

    // Implement more API endpoints as needed for book recommendations, ratings, etc.
}
