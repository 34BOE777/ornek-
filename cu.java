package com.company;

import java.util.Scanner;
/* Dizinin ilk n adet elemanını dizinin sonuna atayan ve baştaki elemanları sıfırlayan kod */
public class Main {

    public static void main(String[] args) {
	int a[]={4,8,3,1,18,9,21,20,5,17};
    Scanner s =new Scanner(System.in);

    int n=s.nextInt();
    for(int i=0;i<n;i++){
       a[a.length-1-i]=a[n-1-i];

    }
    for(int i=0;i<a.length-n;i++){
        a[i]=0;
    }
    for(int x:a){
        System.out.println(x);
    }
    }
}
