/*
 * Challenge Activity I - Bar Chart
 * 
 * In this activity you will implement a text mode bar chart.
 * For example, if you enter a value of 3 the bar chart will
 * contain three #'s ex. ###
 * The implementation is best explained through a sample run.
 * 
 * SAMPLE RUN(S):
 * 
 * Enter value for A : 4
 * Enter value for B : 13
 *  4 : [####]
 * 13 : [#############]
 * 
 * Enter value for A : 15
 * Enter value for B : 1
 * 15 : [###############]
 *  1 : [#]
 */
package barchart;

import java.util.Scanner;

public class BarChartRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for A : ");
        int a = input.nextInt();
        System.out.print("Enter value for B : ");
        int b = input.nextInt();
        
        //TODO: Call drawBarChart for a and b              
    }
    
    /**
     * This method will print a value and its corresponding bar chart
     * Example val =4
     *  4: [####]
     * @param val the value of the bar
     * 
     */
    public static void drawBarChart(int val) {
        // TODO: Write implementation here 
        
    }
}
