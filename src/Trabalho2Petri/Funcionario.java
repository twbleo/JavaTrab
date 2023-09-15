package Trabalho2Petri;

public class Funcionario {
    private String nome;
    private String setor;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }
}
