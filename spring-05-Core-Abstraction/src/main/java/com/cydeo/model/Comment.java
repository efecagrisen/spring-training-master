package com.cydeo.model;

import lombok.Data;

//model/entity objects never need @Component because it doesn't have any dependency, or it is not a dependency itself.

@Data
public class Comment {

    private String author;
    private String text;

}
