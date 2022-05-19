package br.edu.univas.controller;

import br.edu.univas.database.Database;
import br.edu.univas.exception.UserAlreadyExistException;
import br.edu.univas.exception.UserException;
import br.edu.univas.vo.User;

public class UserController {

    public void createUser(String username,
                           String password) {
        isNullOrEmpty(username, "username can not be empty");
        isNullOrEmpty(password, "password can not be empty");

        isLengthOk(username,
                "username has to be less than 15 characters");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        if (Database.getUsers().contains(user)) {
            throw new UserAlreadyExistException(
                    "username already exist on database");
        }

        Database.addUser(user);
    }

    private void isNullOrEmpty(String value,
                               String errorMessage) {
        if (value == null || value.isEmpty()) {
            throw new UserException(errorMessage);
        }
    }

    private void isLengthOk(String username,
                            String errorMessage) {
        if (username.length() > 15) {
            throw new UserException(errorMessage);
        }
    }
}
