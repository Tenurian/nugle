package neumont.edu.csc180.nugle.tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.junit.Test;
import neumont.edu.csc180.nugle.*;

public class LinkFinderTest {

	public final String resultspath = "C:/Users/tfeue/workspace/Nugle/results", 
						filepath = "C:/Users/tfeue/workspace/Nugle/neumont.edu";
	
	public final boolean printResults = false;

	@Test
	public void test() {
		try {
			LinkFinder snooper = new LinkFinder();
			snooper.processPage(new FileInputStream(new File(filepath)));

			ArrayList<String> results = new ArrayList<String>();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(resultspath))));
			String line;
			while((line = reader.readLine()) != null){
				results.add(line);
			}
			
			Iterator<String> resi = results.iterator(),
					snpr = snooper.getLinks();

//			System.out.println("resi: "+results.size());getClass();
//			
//			System.out.println("snpr: "+snooper.getLinksCount());
//			
			int count = 0;
			if(printResults){
				while(resi.hasNext() && snpr.hasNext()){
					System.out.println("\ncount: "+count+"\nresi: "+resi.next() + "\nsnpr: " + snpr.next() + "\n");
					count++;
				}
			}

			boolean same = true;
			count = 0;
			while(resi.hasNext()){  
				count++;
				if(!resi.next().equals(snpr.next())){
					same = false;
					System.err.println(count);
					break;
				}
			}
			
			assertTrue(same);

			//			assertTrue(results.equals(snooper.getLinks().t));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
