package com.example.lib;

import java.util.Arrays;
import java.util.Scanner;

public class hw8 {

    public static void main(String[] args) {
        int number ;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("input");
        System.out.println("n="+number+"");
        showAppointArea(number);
    }

    public static void showAppointArea(int number) {
        boolean[]primes=FilterNumber(number);
        int num=0;
        if(primes!=null){
            for(int i=1;i<primes.length;i++){
                if(primes[i]){

                    System.out.print(i+" ");
                    if(++num%10==0)
                        System.out.println();
                }
            }
            System.out.println("\n("+num+")");
        }
    }

    private static boolean[] FilterNumber(int num) {

        if(num<=0){
            System.out.println("n>0");
            return null;
        }
        boolean[]isPrime=new boolean[num+1];
        isPrime[1]=false;
        Arrays.fill(isPrime, 2,num+1,true);
        int n=(int)Math.sqrt(num);
        for(int i=1;i<n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=num;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        return isPrime;
    }

}