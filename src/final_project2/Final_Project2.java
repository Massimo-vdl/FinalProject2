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
    public static void main(String[] args)throws IOException{
        File Classics = new File("C:\\Users\\massi\\OneDrive\\Desktop\\Classics.txt");
        Scanner input = new Scanner(Classics);
        String title; 
        String artist; 
    // Declare an array of Song objects, called cd, // with a size of 6 
    Song[] cd = new Song[6];
    
    for (int i = 0; i < cd.length; i++) { 
        title = input.nextLine();
        artist = input.nextLine();
        
        cd[i] = new Song(title, artist);
        } 
    
    input.close();
    System.out.println("Contents of Classics:"); 
        for(int i = 0; i < cd.length; i++) { 
        //printing the contents of our cd object
            System.out.println(cd[i].toString());
        }    
    }
    
}
