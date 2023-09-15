package Trabalho2Petri;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome) {
        super(nome);
    }


    public void trabalhar() {
        System.out.println(getNome() + " está desenvolvendo software no setor de " + getSetor());
    }
}
