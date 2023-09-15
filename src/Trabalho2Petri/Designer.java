package Trabalho2Petri;

public class Designer extends Funcionario {
    public Designer(String nome) {
        super(nome);
    }

    public void trabalhar() {
        System.out.println(getNome() + " está criando designs no setor de " + getSetor());
    }
}
