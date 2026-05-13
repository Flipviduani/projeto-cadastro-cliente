package ViduInk;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

//Classe de modelo de dadops para Cliente
public class Cliente {

    //Atributos do cliente
    public UUID id;
    public String nome;
    public String email;
    public String telefone;
    public String cpf;
    public LocalDateTime dataHoraCadastro;
    public LocalDate dataDeNascimento;
    public String profissão;


    //Método para salvar os dados do cliente em um arquivo:
    public void salvarDados() {
        try {
            //Definir local e nome do arquivo
            var fileWriter = new FileWriter("c:\\Aula01\\clientes.txt", true);
            //Adicionar dados (escrever) no arquivo:
            var printWriter = new PrintWriter(fileWriter);
            printWriter.println(id);
            printWriter.println(nome);
            printWriter.println(dataDeNascimento);
            printWriter.println(email);
            printWriter.println(telefone);
            printWriter.println(cpf);
            printWriter.println(dataHoraCadastro);
            printWriter.println("------------");

            //Fechar o arquivo
            printWriter.close();

            System.out.println("Dados gravados com sucesso!");

        }
        catch (Exception e) {
            System.out.println("\nErro ao gravar dados!");
        }
    }
}
