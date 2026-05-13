package ViduInk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       /*
       IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
        */

        /*
        Para fazer:
        Sistema para cadastro de clientes

        Funcionalidades:
        •	Deve permitir que o usuário preencha os dados de um cliente:
        o	Nome do cliente
        o	Email
        o	Telefone
        o	CPF
        •	Deve capturar os dados informados e salvar os registros dos clientes em um arquivo de extensão .TXT na máquina do usuário.
        Este arquivo deverá salvar os seguintes dados:
        o	ID (identificador único) do cliente
        o	Nome do cliente
        o	Email
        o	Telefone
        o	CPF
        o	Data e hora do cadastro
         */

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
