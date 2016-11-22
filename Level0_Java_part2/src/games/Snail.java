package games;

import java.util.Scanner;
import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * Created by olenka on 20.11.2016.
 */


public class Snail {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        String size=in.nextLine();
        try {
            calculateSnail(Integer.parseInt(size));
        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }


    public static void calculateSnail(int size){
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter the number of elements:");
//        int n= parseInt(br.readLine());
        try {
            int A[][]=new int[size][size];
            int k=size*size, c1=0, c2=size-1, r1=0, r2=size-1;

            while(k>=1) {
                if (size % 2 == 1){
                    for (int i = c2; i >= c1; i--) {
                        A[r1][i] = k--;
                    }
                    for (int j = r1 + 1; j <= r2; j++) {
                        A[j][c1] = k--;
                    }
                    for (int i = c1 + 1; i <= c2; i++) {
                        A[r2][i] = k--;
                    }
                    for (int j = r2 - 1; j >= r1 + 1; j--) {
                        A[j][c2] = k--;
                    }
                } else {
                    for (int i = c1; i <= c2; i++) {
                        A[r2][i] = k--;
                    }
                    for (int j = r2-1; j >= r1; j--) {
                        A[j][c2] = k--;
                    }
                    for (int i = c2-1; i >= c1; i--) {
                        A[r1][i] = k--;
                    }
                    for (int j = r1 + 1; j <= r2 - 1; j++) {
                        A[j][c1] = k--;
                    }
                }

                c1++;
                c2--;
                r1++;
                r2--;
            }
            /* Printing the Circular matrix */
            System.out.println("The Circular Matrix is:");
            for(int i=0;i<size;i++) {
                for(int j=0;j<size;j++)
                {
                    System.out.print(A[i][j]+ "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные");
        }
        }

}

