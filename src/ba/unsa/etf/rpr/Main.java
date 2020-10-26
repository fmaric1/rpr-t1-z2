package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner ulaz = new Scanner(System.in);
    int n;
    System.out.println("Unesite neki broj: ");
    n=ulaz.nextInt();
    for(int i = 1; i < n; i++){
        if(i % sumaCifri(i) == 0)
            System.out.println(i);
        }

    }

    public static int sumaCifri(int x){
        int suma = 0;
        while(x != 0){
            suma = suma + x % 10;
            x = x / 10;
        }
        return suma;
    }
}
