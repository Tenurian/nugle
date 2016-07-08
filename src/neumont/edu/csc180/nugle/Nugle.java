package neumont.edu.csc180.nugle;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class Nugle {

	public final String filepath = "C:/Users/tfeue/workspace/Nugle/neumont.edu";

	public static void main(String[] args) { 
		new Nugle();
	}

	public Nugle(){
		
		new WebLinkFinder();
//		prevent errors, Nugle and Link Finder don't have to throw exceptions anymore
//		try {
//			LinkFinder snooper = new LinkFinder();
//			snooper.processPage(new FileInputStream(new File(filepath)));
//			snooper.getLinks().forEachRemaining(System.out::println);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
