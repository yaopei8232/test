package com.ibeifeng.scala;

import java.util.Scanner;

/**
 * Created by ibf on 2018/11/29.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("������5λѧԱ�ĳɼ�:");
        for (int i = 0; i < a.length; i++){
            a[i] = input.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) { // ">","<"���Կ�������ͽ���;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
