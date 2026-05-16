package ViduInk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static void main() {
      
        //Sistema de cadastro de clientes:

        //Criando um objeto para usar a Classe Scanner do Java:
        var scanner = new Scanner(System.in);

        //Criando objeto para acessar o conteúdo da Classe cliente:
        var cliente = new Cliente();

        System.out.print("Bem vindo ao sistema de cadastro de clientes!");
        System.out.println("\nPor favor, insira os dados abaixo:");

        System.out.print("\nNome: ");
        cliente.nome = scanner.nextLine();

        //Definir o formato para captura da data:
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("\nData de nascimento: ");
        cliente.dataDeNascimento = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.print("\nCPF: ");
        cliente.cpf = scanner.nextLine();

        System.out.print("\nProfissão: ");
        cliente.profissão = scanner.nextLine();

        System.out.print("\nTelefone: ");
        cliente.telefone = scanner.nextLine();

        System.out.print("\nE-Mail: ");
        cliente.email = scanner.nextLine();

        cliente.id = UUID.randomUUID(); //Gerando ID do cliente
        cliente.dataHoraCadastro = LocalDateTime.now(); //Gerando a data e hora atuais

        //Executar o método para salvar os dados do cliente
        cliente.salvarDados();

        //Fim do sistema.

    }
}
