package Addon_class;

import java.util.Scanner;
public class Pattern_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int s = 0; s <i; s++){
                System.out.print(" ");
            }
            for(int j =1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
