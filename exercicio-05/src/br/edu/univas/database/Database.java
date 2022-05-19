package br.edu.univas.database;

import br.edu.univas.vo.Post;
import br.edu.univas.vo.User;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static List<User> users = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static void addPost(Post post) {
        posts.add(post);
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Post> getPosts() {
        return posts;
    }

    public static User getUser(String username) {
        int index = users.indexOf(new User(username));
        if (index > -1) {
            return users.get(index);
        }

        return null;
    }
}
