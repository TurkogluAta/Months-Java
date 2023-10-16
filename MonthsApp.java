/*
 * Month.java
 * @author: Ata Turkoglu
 * Date: 28/02/2023
 */

import javax.swing.JOptionPane;
public class MonthsApp{
    public static void main(String args[]){
        //Declare variables
        int monNum, numDay;

        //Declare objects
        Months myMonths;

        //Create objects 
        myMonths = new Months();

        //Input 
        monNum = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a month number (1=Jan and 12=Dec):"));
        myMonths.setMonNum(monNum);

        //Process
        myMonths.compute();

        //Output
        numDay = myMonths.getNumDay();
        JOptionPane.showMessageDialog(null,"This month have "+numDay+" days.");
    }
}