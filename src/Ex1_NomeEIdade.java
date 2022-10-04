package loopsifood;
/*
Faça um programa que leia conjuntos de 2 valores,
o primeiro representando o nome do aluno e 2o representando sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/ 
import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        int contador;

        while(true){
            
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
    
            System.out.println("Idade: ");
            idade = scan.nextInt();
 
        }

        System.out.println("Continua aqui...");

    }
}
