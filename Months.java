/*
 * Month.java
 * @author: Ata Turkoglu
 * Date: 28/02/2023
 */

public class Months{
    //Declare data members
    private int monNum;
    private int numDay;

    //Constructor
    public Months(){
        monNum = 0;
        numDay = 0;
    }

    //Setters - One for every input
    public void setMonNum(int monNum){
        this.monNum = monNum;
    }

    //Compute method(s)
    public void compute(){
        if(monNum==1 || monNum==3 || monNum==5 || monNum==7 || monNum==8 || monNum==10 || monNum==12){
            numDay=31;
        }
        else if(monNum==4 || monNum==6 || monNum==9 || monNum==11){
            numDay=30;
        }
        else if(monNum==2){
            numDay=28;
        }
        else{
            numDay=0;
        }
    }

    //Getter - One for every output
    public int getNumDay(){
        return numDay;
    }
}