package Trabalho2Petri;

import java.util.ArrayList; // Usei o ArrayList para armazenar os dados do funcionario e poder gerencialos
import java.util.Scanner;

public class SistemaEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("======Selecione uma opção======");
            System.out.println("1 - Criar Desenvolvedor");
            System.out.println("2 - Criar Designer");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1) {
                System.out.print("Digite o nome do Desenvolvedor: ");
                String SFuncionario = scanner.nextLine();

                System.out.println("Escolha o setor de trabalho do Desenvolvedor:");
                System.out.println("1 - Desenvolvimento Web");
                System.out.println("2 - Desenvolvimento Mobile");
                int opescolha = scanner.nextInt();
                scanner.nextLine();

                String Sfuncionario = "";

                switch (opescolha) {
                    case 1:
                        Sfuncionario = "Desenvolvimento Web";
                        break;
                    case 2:
                        Sfuncionario = "Desenvolvimento Mobile";
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        continue;
                }

                Desenvolvedor desenvolvedor = new Desenvolvedor(SFuncionario); 
                desenvolvedor.setSetor(Sfuncionario); 
                funcionarios.add(desenvolvedor); //ex do uso

                desenvolvedor.trabalhar();
            } else if (op == 2) {
                System.out.print("Digite o nome do Designer: ");
                String Nfuncionario = scanner.nextLine();

                System.out.println("Escolha o setor de trabalho do Designer:");
                System.out.println("1 - Design de Interfaces");
                System.out.println("2 - Design Gráfico");
                int opsetor = scanner.nextInt();
                scanner.nextLine();

                String Sfuncionario = "";

                switch (opsetor) {
                    case 1:
                        Sfuncionario = "Design de Interfaces";
                        break;
                    case 2:
                        Sfuncionario = "Design Gráfico";
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        continue;
                }

                Designer designer = new Designer(Nfuncionario);
                designer.setSetor(Sfuncionario);
                funcionarios.add(designer); //exemplo do uso 

                designer.trabalhar();
            } else if (op == 3) {
                System.out.println("Saindo do programa.");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
