import java.util.Scanner;

public class SomarArray {
    public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
      System.out.println("Digite a quantidade de numeros que deseja somar:");
      int size = x.nextInt();
      int result = arrayBuilder(size);
      System.out.println("O resultado da soma de todos os numeros digitados é :" + result);
    };

    public static int addArray(int[] array){
      int sum = 0;
      for(int number:array){
        sum = sum+number;
      }
      return sum;
    }

    public static int arrayBuilder(int x){
      int[] numbers = new int[x];
      for (int i = 0; i < x ; i++){
        Scanner y = new Scanner(System.in);
        System.out.println("Digite um número para ser somado:");
        int newNumber = y.nextInt();
        numbers[i] = newNumber;
      }
      int result = addArray(numbers);
      return result;
    }
  };