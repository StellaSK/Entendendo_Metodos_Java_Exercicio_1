import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIAVEIS DO METODO: CALCULADORA
        double numero1, numero2;

        // CALCULADORA
        System.out.println("CALCULADORA");

        System.out.println("=====================================");
        System.out.println("Soma");
        System.out.println("-------------------------------------");
        System.out.println("Primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        numero2 = sc.nextDouble();
        Calculadora.soma(numero1,numero2);

        System.out.println("=====================================");
        System.out.println("Subtracao");
        System.out.println("-------------------------------------");
        System.out.println("Primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        numero2 = sc.nextDouble();
        Calculadora.subtracao(numero1,numero2);

        System.out.println("=====================================");
        System.out.println("Multiplicacao");
        System.out.println("-------------------------------------");
        System.out.println("Primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        numero2 = sc.nextDouble();
        Calculadora.multiplicacao(numero1,numero2);

        System.out.println("=====================================");
        System.out.println("Divisao");
        System.out.println("-------------------------------------");
        System.out.println("Primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Segundo numero: ");
        numero2 = sc.nextDouble();
        Calculadora.divisao(numero1,numero2);
        System.out.println();

        // ESPACADOR
        System.out.println("=====================================");
        System.out.println();

        // VARIAVEL DO METODO: MENSAGEM
        int hora;

        // MENSAGEM
        System.out.println("MENSAGEM");
        System.out.println("=====================================");
        System.out.println("Digite um horário fechado: ");
        hora = sc.nextInt();
        Mensagem.mensagem(hora);

        // ESPACADOR
        System.out.println("=====================================");
        System.out.println();

        // VARIAVEL DO METODO: EMPRESTIMO
        int quantidadeParcelas;
        double valor;

        // EMPRESTIMO
        System.out.println("EMPRESTIMO");
        System.out.println("=====================================");
        System.out.println("A nossa taxa fixa por numero de parcelas eh de 0,15.");
        System.out.println("Digite um numero de 1 a 12:");
        quantidadeParcelas = sc.nextInt();
        Emprestimo.getParcelas(quantidadeParcelas);
        System.out.println("Qual é o valor do emprestimo?");
        valor = sc.nextDouble();
        Emprestimo.calcular(valor, quantidadeParcelas);
    }
}