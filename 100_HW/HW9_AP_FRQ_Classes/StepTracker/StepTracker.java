public class steptracker{
int min;
int active;
int total;
int days;

public StepTracker(int min){
This.min = min;
active = 0;
total = 0;
days = 0;
}
public int activeDays(){
return active;
}
public double averageSteps(){
return((double)total)/(0.0+days);
}
public void addDailySAteps(int Steps){
total = total+steps;
if(Steps >= min){
active ++;
}
days ++;
}
}