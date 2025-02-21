import java.math.BigInteger;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int ano = 2025;
        System.out.println("Hello world!");
        System.out.println("Hello " + ano + "!");
        calendarius();
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

    //Uso do calendário

    public static void calendarius() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        System.out.println("Hoje é dia: " + dia);
    }

    /*Construir um programa que apresente uma mensagem para o usuário informando se ele pode votar, dependendo da idade que tem.  Considerar que
    a) Até 15 anos não vota
    b) Entre 16 e 17 é opcional
    c) Entre 18 e 70 é obrigatório
    d) Acima de 70 é opcional
    */

    public static void votar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        if (idade <= 15) {
            System.out.println("Você não pode votar");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("Você pode votar, mas é opcional");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Você é obrigado a votar");
        } else {
            System.out.println("Você pode votar, mas é opcional");
        }
    }

    /*Construir um programa que determine a data cronologicamente maior (posterior) entre duas datas informadas pelo usuário.  Cada data deve ser composta por dia mes e ano.
     */

    public static void maiorData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o dia da primeira data: ");
        int dia1 = scanner.nextInt();
        System.out.println("Informe o mês da primeira data: ");
        int mes1 = scanner.nextInt();
        System.out.println("Informe o ano da primeira data: ");
        int ano1 = scanner.nextInt();
        System.out.println("Informe o dia da segunda data: ");
        int dia2 = scanner.nextInt();
        System.out.println("Informe o mês da segunda data: ");
        int mes2 = scanner.nextInt();
        System.out.println("Informe o ano da segunda data: ");
        int ano2 = scanner.nextInt();
        scanner.close();
        if (ano1 > ano2) {
            System.out.println("A primeira data é maior");
        } else if (ano1 < ano2) {
            System.out.println("A segunda data é maior");
        } else {
            if (mes1 > mes2) {
                System.out.println("A primeira data é maior");
            } else if (mes1 < mes2) {
                System.out.println("A segunda data é maior");
            } else {
                if (dia1 > dia2) {
                    System.out.println("A primeira data é maior");
                } else if (dia1 < dia2) {
                    System.out.println("A segunda data é maior");
                } else {
                    System.out.println("As datas são iguais");
                }
            }
        }

        /*Construir um programa que obtenha a data do sistema e mostra essa informação com o nome do mês por extenso, usando switch.
        Utilizar o exemplo abaixo, que utiliza a classe Calendar, como base e faz a captura do dia do mês:
         */

        Calendar calendario = Calendar.getInstance();
        int mes = calendario.get(Calendar.MONTH);
        switch (mes) {
            case 0:
                System.out.println("Janeiro");
                break;
            case 1:
                System.out.println("Fevereiro");
                break;
            case 2:
                System.out.println("Março");
                break;
            case 3:
                System.out.println("Abril");
                break;
            case 4:
                System.out.println("Maio");
                break;
            case 5:
                System.out.println("Junho");
                break;
            case 6:
                System.out.println("Julho");
                break;
            case 7:
                System.out.println("Agosto");
                break;
            case 8:
                System.out.println("Setembro");
                break;
            case 9:
                System.out.println("Outubro");
                break;
            case 10:
                System.out.println("Novembro");
                break;
            case 11:
                System.out.println("Dezembro");
                break;
        }



}
}


