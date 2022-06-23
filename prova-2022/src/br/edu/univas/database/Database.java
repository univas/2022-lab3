package br.edu.univas.database;

import br.edu.univas.vo.Doador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    private static List<Doador> doadores = new ArrayList<>();
    private static Map<String, Long> estoqueSanguineo = new HashMap<>();

    public static void addDoador(Doador doador) {
        doadores.add(doador);
    }

    public static void addDoacao(String tipoSanguineo, Long quantidade) {
        if (estoqueSanguineo.containsKey(tipoSanguineo)) {
            quantidade += estoqueSanguineo.get(tipoSanguineo);
        }
        estoqueSanguineo.put(tipoSanguineo, quantidade);
    }

    public static Long getSituacaoEstoque(String tipoSanguineo) {
        return estoqueSanguineo.get(tipoSanguineo);
    }
}
