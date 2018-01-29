package WinningLotteryTicket;

import java.util.Scanner;

public class Solution {
    static long winningLotteryTicket(String[] tickets) {
        int i,j,count=0;
        for(i=0;i<tickets.length-1;i++){

            if(validate(tickets[i])){
                count+=(tickets.length-1);
                continue;
            }
            for(j=i+1;j<tickets.length;j++)
                if(validate(tickets[i]+tickets[j]))
                    count++;
        }
        return count;
    }

    private static boolean validate(String combined) {
        int i;
        for(i=0; i<10 && combined.contains(new Integer(i).toString()); i++);
        if (i==10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=100000)
        {
            String[] tickets = new String[n];
            for(int tickets_i = 0; tickets_i < n; tickets_i++){
                tickets[tickets_i] = in.next();
            }
            long result = winningLotteryTicket(tickets);
            System.out.println(result);
            in.close();
        }
    }
}
