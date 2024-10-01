import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        //armazenar6num(); //exercicio1 vetores -
        //lerInt(); //exercicio2 vetores -
        //realQuadVet(); //exercicio3 vetores -
        //soma2Vetor(); //exercicio4 vetores -
        //vetorPar(); //exercicio5 vetores -
        //vetorMaiorMenor(); //exercicio6 vetores -
        //exercicio7();

    }

    public static void armazenar6num(){
        int[] a = new int[6];

        a[0] = 1;
        a[1] = 0;
        a[2] = 5;
        a[3] = -2;
        a[4] = -5;
        a[5] = 7;

        int soma = a[0] + a[1] + a[5];
        System.out.printf("A soma dos valores do vetor nas posições 0,1 e 2 é: %d\n",soma);

        a[4] = 100;

        for (int i = 0; i < a.length; i++){
            int cont = a[i];
            System.out.printf("Primeiro valor do vetor 'a' na posição '%d' é: %d \n",i , cont);
        }

    }

    public static void lerInt(){
        int[] vetor = new int[6];

        for (int i = 0 ; i < vetor.length ; i++){
        System.out.printf("Insira o %dº valor: \n",i +1);
        vetor[i] = ler.nextInt();

        }
        System.out.print("Os valores lidos foram: \n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d, \n", vetor[i]);

        }

    }

    public static void realQuadVet(){
        double vetor1[] = new double[10];
        double vetor2[] = new double[10];

        for (int i = 0 ; i < vetor1.length ; i++){
            System.out.printf("Insira o %dº número real: \n", i +1);
            vetor1[i] = ler.nextDouble();
        }

        System.out.println("Os números reais armazenados no 1º vetor são: ");

        for (int i = 0 ; i < vetor1.length ; i++){
            System.out.printf("%.2f; ",vetor1[i]);
        }

        System.out.println("\n\nO quadrado desses valores armazenados no 2º vetor são: ");

        for (int i = 0 ; i < vetor1.length ; i++){
            vetor2[i] = vetor1[i] * vetor1[i];
            System.out.printf("%.2f; ",vetor2[i]);

        }

    }

    public static void soma2Vetor(){
        int vetor[] = new int[8];
        boolean continuar = true;
        String resposta = "";
        int x = 0, y = 0;

        for (int i = 0; i < vetor.length ; i++){
            System.out.printf("Insira o %dº valor: \n", i + 1);
            vetor[i] = ler.nextInt();
        }

        while (continuar) {
            System.out.println("Informe a primeira posição do array para fazer a busca (de 0 a 7!)");
            x = ler.nextInt();
            ler.nextLine();


            System.out.println("Informe a segunda posição do array para fazer a busca (de 0 a 7!)");
            y = ler.nextInt();
            ler.nextLine();

            if (x >= 0 && x < vetor.length && y >=0 && y < vetor.length) {
                System.out.print("A soma dos valores encontrados nos vetores é: " +(vetor[x] + vetor[y]));
                break;

            } else System.out.println("Você digitou algum número fora do intervalo entre 0 e 7! Deseja começar novamente? (s/n) ");
            resposta = ler.nextLine().toLowerCase();
            if (!resposta.equals("s")){
                 continuar = false;
            }

        }

    }

    public static void vetorPar(){
        int[] vetor = new int[10];
        int contPares = 0;
        int qtd = 0;

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.printf("Insira o %dº de 10 valores inteiros: ",i +1);
            vetor[i] = ler.nextInt();

        }

        System.out.println("Os números pares são: ");
        for (int i = 0 ; i < vetor.length ; i++){
            if (vetor[i] % 2 == 0){
                contPares = vetor[i];
                qtd = qtd + 1;

                System.out.printf("%d, ",contPares);

            }
        }
        System.out.printf("\nAo todo temos %d números pares dentro do vetor!", qtd);

    }

    public static void vetorMaiorMenor(){
        int vetor[] = new int[10];
        int menor = 0, maior = 0;

        for (int i = 0 ; i < vetor.length ; i++){

            System.out.printf("Informe o %dº de 10 valores ", i + 1);
            vetor[i] = ler.nextInt();
        }

        menor = vetor[0];

        for (int i = 1 ; i < vetor.length ; i++){


            if (vetor[i] < menor){
                menor = vetor[i];
            }
            if (vetor[i] > maior){
                maior = vetor[i];

            }
        }

        System.out.printf("O menor valor é: %d, e o maior é %d", menor, maior);

    }

    public static void exercicio7(){

        int vetor[] = new int[10];
        int cont = 0;
        int maior = 0;

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.printf("Insira o %dº de 10 valores inteiros: \n",i + 1);
            vetor[i] = ler.nextInt();
        }

        System.out.println("Os valores guardados no vetor são: ");

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.printf("%d, ",vetor[i]);

            if (vetor[i] > maior){
                maior = vetor[i];
                cont = i;
            }

        }
        System.out.printf("\nO maior valor armazenado é '%d', ele se encontra na %dª posição do vetor e foi o %dº valor armazenado!\n" +
                "Isso ocorre porque o vetor inicia da posição 0.",maior , cont, cont - 1);
    }




}