package final_project2;

import java.util.Scanner;

/**
 *
 * @author massi
 */
public class Average {
int data[];
double mean;
int i;
Scanner console = new Scanner(System.in);
public Average(){
data = new int[5];    
    for(int i = 0; i < data.length; ++i){
        System.out.println("Enter a score number" + (i + 1)+ ": ");
    data[i] = console.nextInt();
        }
    calcMean();
    selectionSort();
    }
public void calcMean(){
    int total = 0;
    for(int score : data){
        total += score;
        }
    mean = total/data.length;
    }
@Override 
public String toString(){
    return "            ";
    }
public void selectionSort(){
     int max = i;
    for(int i = 0; i  < data.length - 1; i++ ){
        } //j is a placeholder for the biggest value in the score
    for(int j = i + 1; j < data.length; j++){
        if (data[j] > data[max]){
            max = j;
            }
        }
        int temp = data[max];
        data[max] = data[i];
        data[i] = temp;
     }
}

