import java.io.*;
import java.util.*;

public class buyandsellstock1 {

    public static void main(String[] args) throws Exception {
        // write your code here 
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int prices[]= new int[n];

        for(int i = 0; i < prices.length; i++){
            prices[i] = scn.nextInt();
        }

        int lsf = 0; // least price so far
        int op = 0; // Original price
        int pist = 0; // Price if sold today

        for(int  i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }

            pist = prices[i] - lsf;

            if(pist > op){
                op = pist;
            }
        }
        System.out.println(op);
    }

}