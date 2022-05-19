package br.edu.univas.vo;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Post {

    private User user;
    private String content;
    private ZonedDateTime date;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(user, post.user) && Objects.equals(date, post.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, date);
    }
}
