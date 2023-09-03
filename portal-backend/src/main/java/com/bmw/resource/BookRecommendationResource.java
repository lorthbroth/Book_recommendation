package com.bmw.resource;

import com.bmw.model.Book;
import com.bmw.model.User;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.logger;

import java.util.List;

@Path("/api")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookRecommendationResource {

    private static final logger LOGGER =
}
