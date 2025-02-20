import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ano = 2025;
        System.out.println("Hello world!");
        System.out.println("Hello " + ano + "!");
        // solicita inpout do usuario para calcular o fatorial
        readInput();
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero para calcular o fatorial: ");
        int number = scanner.nextInt();
        System.out.println("Voce escolheu o numero: " + number);
        scanner.close();
        System.out.println("O fatorial de " + number + " é: " + factorial(number));
    }

    /*
    programa que pergunte ao usuário qual o valor pago a ele por hora de trabalho e quantas horas ele trabalhou em um projeto.
    Em seguida, mostre o valor equivalente a ser recebido por ele.  Lembre-se de formatar os números.
     */

    public static void calculateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor pago por hora: ");
        double valorHora = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        scanner.close();
        double salario = valorHora * horasTrabalhadas;
        System.out.println("O salario a ser recebido é: " + salario);
    }

    /*Implemente um programa para calcular e mostrar a área de um trapézio, sabendo que:
	h = altura, b = base menor, B = base maior, Área = (h x (b + B)) / 2 */

    public static void calculateAreaTrapezio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a altura do trapézio: ");
        double altura = scanner.nextDouble();
        System.out.println("Informe a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();
        System.out.println("Informe a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();
        scanner.close();
        double area = (altura * (baseMenor + baseMaior)) / 2;
        System.out.println("A área do trapézio é: " + area);
    }

    /*programa para que o usuário informe a altura entre 2 andares de uma construção e informe a quantidade de degraus que deseja construir.
    Em seguida o sistema deve calcular e mostrar qual a altura de cada um dos degraus que deverão ser construídos para que a escada ligue o primeiro ao segundo andar.
    Note que todos os degraus devem ter a mesma altura.
    A altura entre os andares será fornecida em metros e a altura do degrau deverá ser fornecida em centímetros.
     */

    public static void calculateHeightDegrau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a altura entre os andares em metros: ");
        double alturaAndares = scanner.nextDouble();
        System.out.println("Informe a quantidade de degraus que deseja construir: ");
        double quantidadeDegraus = scanner.nextDouble();
        scanner.close();
        double alturaDegrau = alturaAndares / quantidadeDegraus;
        System.out.println("A altura de cada degrau é: " + alturaDegrau + " metros");
    }

    /*Uma pessoa deseja pregar um quadro em uma parede, utilizando uma escada como apoio.
    Construa um programa para calcular e mostrar a que distância a escada deve estar da parede.
    O usuário deve fornecer o tamanho da escada e a altura em que deseja pregar o quadro.
    Lembre-se, porém, que o tamanho da escada precisa ser maior que a altura que se deseja alcançar.
     */

    public static void calculateDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho da escada: ");
        double tamanhoEscada = scanner.nextDouble();
        System.out.println("Informe a altura em que deseja pregar o quadro: ");
        double alturaQuadro = scanner.nextDouble();
        scanner.close();
        double distancia = Math.sqrt(Math.pow(tamanhoEscada, 2) - Math.pow(alturaQuadro, 2));
        System.out.println("A distancia que a escada deve estar da parede é: " + distancia);
    }

}
