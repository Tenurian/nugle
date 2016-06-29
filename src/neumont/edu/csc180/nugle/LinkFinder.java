package neumont.edu.csc180.nugle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkFinder{
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
//        		if(!links.contains(m.group(1))){
	        		links.add(m.group(1));	
//        		}
        	}
        }
        reader.close();
	}

	public Iterator<String> getLinks() {
		return links.iterator();
	}
}

