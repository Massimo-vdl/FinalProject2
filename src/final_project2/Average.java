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

    public Average() {
        data = new int[5];
        for (int i = 0; i < data.length; ++i) {
            System.out.println("Enter a score number " + (i + 1) + ": ");
            data[i] = console.nextInt();
        }
        calcMean();
        selectionSort();
    }

    public void calcMean() {
        int total = 0;
        for (int score : data) {
            total += score;
        }
        mean = total / data.length;
    }

    @Override
    public String toString() {
        String result = "Scores in decending order:\n";
            for(int score : data){
                result += score + "\n";
                }
            result += "Mean: "+mean;
        return result;
    }

    public void selectionSort() {
        int max = i;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] < data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}
