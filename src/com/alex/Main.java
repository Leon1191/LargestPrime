package com.alex;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {return -1;}
int ansver = -1;
        for (int i = 2; i <= number; i++) {
            if (number % i != 0) {continue;}

boolean prime = true;


            for (int j = 2; j < i; j++){
              if (i % j == 0)  {prime = false;
              break;}

            }

            if (prime) { ansver = i;

            }

        }
        return ansver;


    }
}
