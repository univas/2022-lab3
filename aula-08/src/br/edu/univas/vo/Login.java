package br.edu.univas.vo;

public interface Login {

    boolean doLogin();

    default void logout() {
        System.out.println("faço alguma coisa");
    }

}
