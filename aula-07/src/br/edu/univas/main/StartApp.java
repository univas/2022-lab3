package br.edu.univas.main;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Gato;

import java.util.ArrayList;

public class StartApp {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.setRaca("ABC");
        c1.emiteSom();

        Gato g1 = new Gato();
        g1.setRaca("XYZ");
        g1.pular();
        g1.emiteSom();

        Animal a2 = new Gato();
        a2.setRaca("kkk");
        a2.emiteSom();

        if (a2 instanceof Gato) {
            Gato g4 = (Gato) a2;
            g4.pular();
        }

        Animal a3 = new Cachorro();
        a3.setRaca("kkk2");
        a3.emiteSom();
    }

}
