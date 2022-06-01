package br.edu.univas.controller;

import br.edu.univas.database.Database;
import br.edu.univas.exception.PostException;
import br.edu.univas.vo.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PostControllerTest {

    private PostController controller = new PostController();
    private String validContent = "bla bla bla";
    private static String validUser = "rlfaria";

    @BeforeAll
    public static void setup() {
        User user = new User();
        user.setUsername(validUser);
        user.setPassword("abc123");

        Database.addUser(user);
    }


    @Test
    public void createPost_whenParametersAreValid_shouldCreatePostSuccessfully() {
        Assertions.assertEquals(
                0, Database.getPosts().size());

        controller.createPost(
                validUser, validContent);

        Assertions.assertEquals(
                1, Database.getPosts().size());
    }

    @Test
    public void createPost_whenUserIsInvalid_shouldThrowsPostException() {
        Assertions.assertThrows(PostException.class,
                () -> controller.createPost(
                        "ze_da_esquina",
                        validContent));
    }

    @Test
    public void createPost_whenContentIsNull_shouldThrowsPostException() {
        Assertions.assertThrows(PostException.class,
                () -> controller.createPost(
                        validUser, null));
    }

    @Test
    public void createPost_whenContentIsBiggerThan150Characters_shouldThrowsPostException() {
        String content = "";
        for (int i = 0; i < 151; i++) {
            content += "-" + i;
        }

        String finalContent = content;

        Assertions.assertThrows(PostException.class,
                () -> controller.createPost(
                        validUser,
                        finalContent));
    }
}
