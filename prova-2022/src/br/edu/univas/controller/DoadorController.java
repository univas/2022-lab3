package br.edu.univas.controller;

import br.edu.univas.database.Database;
import br.edu.univas.enums.TipoSanguineo;
import br.edu.univas.exception.TipoSanguineoNotFoundException;
import br.edu.univas.vo.Doador;

public class DoadorController {

    public void cadastrarDoador(Long cpf, String tipoSanguineo) {
        TipoSanguineo tipo = getTipoSanguineo(tipoSanguineo);

        Doador doador = new Doador();
        doador.setCpf(cpf);
        doador.setTipoSanguineo(tipo);

        Database.addDoador(doador);
    }

    public void cadastrarDoacao(String tipoSanguineo, Long quantidade) {
        getTipoSanguineo(tipoSanguineo);
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        Database.addDoacao(tipoSanguineo, quantidade);
    }

        private TipoSanguineo getTipoSanguineo(String tipoSanguineo) {
        TipoSanguineo tipo = TipoSanguineo.fromTipo(tipoSanguineo);
        if (tipo == null) {
            throw new TipoSanguineoNotFoundException(tipoSanguineo + " não é um tipo sanguineo valido!");
        }
        return tipo;
    }
}
