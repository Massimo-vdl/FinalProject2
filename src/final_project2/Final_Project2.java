package final_project2;
import java.util.Scanner;
import java.io.*; 
/**
 *
 * @author massi
 */
public class Final_Project2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(new File("Classics.txt"));
        String title; 
        String artist; 
    // ADD LINES FOR TASK #3 HERE 
    // Declare an array of Song objects, called cd, // with a size of 6 
    Song[] cd = new Song[6];
    
    for (int i = 0; i < cd.length; i++) { 
        title = input.nextLine();
        artist = input.nextLine();
        
        cd[i] = new Song(artist, title);
        } 
    
    input.close();
    System.out.println("Contents of Classics:"); 
        for(int i = 0; i < cd.length; i++) { 
        // ADD LINES FOR TASK #3 HERE 
            System.out.println(cd[i].toString());
        }    
    }
    
}
