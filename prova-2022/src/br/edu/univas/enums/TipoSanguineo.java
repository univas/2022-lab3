package br.edu.univas.enums;

public enum TipoSanguineo {

    APOSITIVO("A_POSITIVO"),
    ANEGATIVO("A_NEGATIVO"),
    BPOSITIVO("B_POSITIVO"),
    BNEGATIVO("B_NEGATIVO"),
    ABPOSITIVO("AB_POSITIVO"),
    ABNEGATIVO("AB_NEGATIVO"),
    OPOSITIVO("O_POSITIVO"),
    ONEGATIVO("O_NEGATIVO");

    private String tipo;

    TipoSanguineo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public static TipoSanguineo fromTipo(String tipo) {
        for (TipoSanguineo tipoSanguineo : TipoSanguineo.values()) {
            if (tipoSanguineo.getTipo().equals(tipo)) {
                return tipoSanguineo;
            }
        }

        return null;
    }
}
