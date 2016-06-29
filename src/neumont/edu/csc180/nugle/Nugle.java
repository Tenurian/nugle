package neumont.edu.csc180.nugle;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Nugle {

	public final String filepath = "C:/Users/tfeue/workspace/Nugle/neumont.edu";

	public static void main(String[] args) {
		try{
//			Nugle nuoogle = 
			new Nugle();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public Nugle() throws FileNotFoundException, IOException{
		//for demonstration porpoises
		LinkFinder snooper = new LinkFinder();
		snooper.processPage(new FileInputStream(new File(filepath)));
		snooper.getLinks().forEachRemaining(System.out::println);
		
	}

}
