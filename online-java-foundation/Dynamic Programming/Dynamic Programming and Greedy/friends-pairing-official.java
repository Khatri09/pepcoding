import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int noOfWays = friendsPairing(n);
        System.out.println(noOfWays);
    }
    
    public static int friendsPairing(int n){
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2] * (i - 1);
        
        return dp[n];
    }
}