package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
	        for (int j = 1; j <= 5; j++)
                System.out.print(j);
            System.out.println("");
        }
	    for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print(i + j);
            System.out.println("");
        }
	    String[] a = {"dog", "cat", "rat"};
	    String[] b = {"rat", "lion", "zebra"};
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    flag = true;

            }
        }
        int[] nums = {1, 3, 5, 2, 4, 6};
        System.out.println(flag);
        for(int k=0; k < nums.length; k++){
           for(int l = 0; l < nums.length; l++){
                if (k != l)
                    System.out.println(10 * nums[k] + nums[l]);
           }
        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6-i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6; j++){
                if(j<=i)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
        System.out.println(uniques(nums));
        int[] alpha = {4, 4, 6, 11, -2, 3};
        int[] beta = {5, 11, 11, -3, 3, 5};
        System.out.print("a: ");
        for (int i : alpha)
            System.out.print(i + " ");
        System.out.println("");
        System.out.print("b: ");
        for (int i : beta)
            System.out.print(i + " ");
        System.out.println("");
        System.out.print("sym diff:: ");
        boolean unique = true;
        for(int i = 0; i < alpha.length; i++){
            unique = true;
            for(int j = 0; j < beta.length; j++){
                if (alpha[i] == beta[j])
                    unique = false;
            }
            if(unique)
                System.out.print(alpha[i] + " ");
        }
        for(int i = 0; i < beta.length; i++){
            unique = true;
            for(int j = 0; j < alpha.length; j++){
                if (beta[i] == alpha[j])
                    unique = false;
            }
            if(unique)
                System.out.print(beta[i] + " ");
        }
    }
    static boolean uniques (int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++){
                if (numbers[i] == numbers[j])
                    return true;
            }
        }
        return false;
    }

}