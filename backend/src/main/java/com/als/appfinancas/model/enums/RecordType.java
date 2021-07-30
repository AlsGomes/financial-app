package com.als.appfinancas.model.enums;

public enum RecordType {

    RECEITA(1, "Receita"), DESPESA(2, "Despesa");

    private Integer id;
    private String nome;

    private RecordType(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static RecordType toEnum(Integer id) {
        if (id == null)
            return null;

        for (RecordType obj : RecordType.values()) {
            if (id == obj.getId())
                return obj;
        }

        throw new IllegalArgumentException("O id passado não existe");
    }
}
