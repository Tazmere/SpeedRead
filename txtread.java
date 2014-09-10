
	import java.io.*;
import java.util.Scanner;
	 
	public class txtread { 
	 
	    public static void main(String[] args) {
            Scanner ui = new Scanner(System.in);
            System.out.println("Enter speed in milliseconds. Keep input in the hundreds range. 1000 is equal to one second. 500 is equal to 500 milliseconds.");
            int speed = ui.nextInt();
            System.out.println("Enter file path. If on mac, click file and click get info and copy the path there with the name of the file after a forward slash. The file should be a .txt file. If on windows, right click file and click properties and copy the path.");
            String path = ui.next();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
	        try {
	 
	            Scanner scn = new Scanner(new FileInputStream (path));
	            scn.useDelimiter("\t");
	            while (scn.hasNextLine()) {
	                String line = scn.nextLine();
	                try {
	        		    Thread.sleep(speed);                 
	        		} catch(InterruptedException ex) {
	        		    Thread.currentThread().interrupt();
	        		}
	                System.out.println(line);
	            }
	             scn.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	 
	    }
	}
