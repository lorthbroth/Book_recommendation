package org.bmw.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Data;

@Data
public class Book extends PanacheMongoEntity {

    public String title;
    public String author;
    public String genre;
}
