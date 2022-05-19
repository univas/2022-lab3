package br.edu.univas.controller;

import br.edu.univas.database.Database;
import br.edu.univas.exception.PostException;
import br.edu.univas.exception.UserException;
import br.edu.univas.vo.Post;
import br.edu.univas.vo.User;

import java.time.ZonedDateTime;

public class PostController {

    public void createPost(String username,
                           String content) {

        if (!Database.getUsers().contains(new User(username))) {
            throw new PostException("username not found");
        }

        isNullOrEmpty(content, "content can not be empty");
        isLengthOk(content, "content has to be less than 150 characters");

        Post post = new Post();
        post.setContent(content);
        post.setDate(ZonedDateTime.now());
        post.setUser(Database.getUser(username));

        Database.addPost(post);
    }

    private void isNullOrEmpty(String value,
                               String errorMessage) {
        if (value == null || value.isEmpty()) {
            throw new PostException(errorMessage);
        }
    }

    private void isLengthOk(String content,
                            String errorMessage) {
        if (content.length() > 150) {
            throw new PostException(errorMessage);
        }
    }
}
