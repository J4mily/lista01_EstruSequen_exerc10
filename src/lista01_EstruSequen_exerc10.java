import java.util.Scanner;
/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Celsius ==> Fahrenheit
* Descrição: 10.Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
* Data: 07/04/2023 */

public class lista01_EstruSequen_exerc10 {
    public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Conversor de temperatura: Graus Celsius -> Fahrenheit\n"); 
    System.out.print("Digite a temperatura em Celsius: ");

    double Celsius = entrada.nextDouble();

    System.out.println("\nA medida convertida é " + (( 9 * Celsius + 160 ) / 5) + "ºF\n");
    
    entrada.close();
}
}
