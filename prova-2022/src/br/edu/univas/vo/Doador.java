package br.edu.univas.vo;

import br.edu.univas.enums.TipoSanguineo;

public class Doador {

    private Long cpf;
    private TipoSanguineo tipoSanguineo;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}
