package final_project2;

import java.util.Scanner;

/**
 *
 * @author massi
 */
public class Average {
int data[];
double mean;
Scanner console = new Scanner(System.in);
public Average(){
data = new int[5];    
    for(int i = 0; i < data.length; ++i){
        System.out.println("Enter a score number" + (i + 1)+ ": ");
    data[i] = console.nextInt();
        }
    }
}
