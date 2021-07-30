package com.als.appfinancas.model.enums;

public enum RecordStatus {

    PENDENTE(1, "Pendente"), CANCELADO(2, "Cancelado"), EFETIVADO(3, "Efetivado");

    private Integer id;
    private String nome;

    private RecordStatus(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static RecordStatus toEnum(Integer id) {
        if (id == null)
            return null;

        for (RecordStatus obj : RecordStatus.values()) {
            if (id == obj.getId())
                return obj;
        }

        throw new IllegalArgumentException("O id passado não existe");
    }
}
