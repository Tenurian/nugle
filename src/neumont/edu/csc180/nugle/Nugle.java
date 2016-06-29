package neumont.edu.csc180.nugle;

import java.io.*;//replace this with specific imports later
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	class LinkFinder{
		private Collection<String> links;
		
		public LinkFinder(){
			links = new ArrayList<String>();
		}

		public void processPage(InputStream in) throws IOException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	        String line;
	        while ((line = reader.readLine()) != null) {
	        	Pattern p = Pattern.compile("<\\s*[aA]\\s+[hH][rR][eE][fF]\\s*=\\s*\"([^\"]+)\"\\s*>");
	        	Matcher m = p.matcher(line);
	        	if(m.find()){
	        		links.add(m.group(1));
	        	}
	        }
	        reader.close();
		}

		public Iterator<String> getLinks() {
			return links.iterator();
		}
	}

}
