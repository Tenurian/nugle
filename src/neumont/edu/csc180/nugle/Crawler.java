package neumont.edu.csc180.nugle;

import java.net.URL;
import java.util.ArrayList;

public class Crawler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Inputs
	 * - A starting URL
	 * - A maximum number of pages to visit (something to stop at)
	 * - Visit action (something to do with the URLs you get)
	 * 
	 * Implement visit action through an interface (VisitAction)
	 * with a method that takes the URL
	 * 
	 * Crawler constructor will take in the inputs
	 * Give it two lists
	 * List toVisit (put the start URL in here)
	 * List beenVisit
	 * Give it a crawl method
	 * crawl(){
	 * while toVisit is not empty...
	 * 	Let URL be next URL in toVisit
	 * 	Add URL to beenVisit
	 * 	visitURL(URL)
	 * }
	 * 
	 * visitURL(URL){
	 * VisitAction.Visit(URL)
	 * Get all links on URL
	 * For each child URL in those links...
	 * 	If toVisit and beenVisit does not contain child URL...
	 * 		Add Child URL to toVisit
	 * }
	 * 
	 * Don't worry about https stuff, just ignore those links
	 */
	private static final int MAX_PAGES = 100;
	private ArrayList<URL> toVisit, visited;
	private URL url;
	
	public Crawler(URL url){
		this.url = url;
	}
	
	public void crawl(){
		while(!toVisit.isEmpty()){
			
		}
	}
}
