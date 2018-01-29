package ProgrammingCompetition;

import java.util.Scanner;

public class Solution {

    public static void main(String []args){
        int difference, max = 0;
        String theProgrammer = null;
        Scanner in = new Scanner(System.in);
        int totalNumberOfProgrammers = in.nextInt();
        for(int a0 = 0; a0 < totalNumberOfProgrammers; a0++){
            String nameOfProgrammer = in.next();
            int queSolvedDecember = in.nextInt();
            int queSolvedJanuary = in.nextInt();
            difference = queSolvedJanuary - queSolvedDecember;
            if(max < difference){
                max = difference;
                theProgrammer = nameOfProgrammer;
            }
        }
        in.close();
        System.out.println(theProgrammer + " " + max);
    }
}
