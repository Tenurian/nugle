package neumont.edu.csc180.nugle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;

public class WebLinkFinder {

	private static final int MAX_PAGES = 500;
	private int CURRENT_PAGE = 0;
	private ArrayList<String> visited = new ArrayList<String>(), toVisit = new ArrayList<String>();
	private LinkFinder sherlock = new LinkFinder();
	private static final boolean vocal = false;


	public WebLinkFinder(){

//		crawl("http://shalladay-iis1.student.neumont.edu/");
//		visited.iterator().forEachRemaining(System.out::println);
//		
//		try(java.io.PrintWriter output = new java.io.PrintWriter("output.txt", "UTF-8")) {
//			visited.iterator().forEachRemaining(output::println);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		/* try {

		Kinda worked, would be easier to do this recursively
		//			URL neumont = new URL("http://www.neumont.edu");
					String neumont = "http://www.neumont.edu";
					ArrayList<String> toVisit = new ArrayList<String>(), visited = new ArrayList<String>();
					toVisit.add(neumont);
					
					URL prev = new URL(neumont);
					
					for(int i = 0; i < MAX_PAGES; i++){
						LinkFinder sherlock = new LinkFinder();
						String currStr = toVisit.get(toVisit.size()-1);
						if(visited.contains(currStr)){
							while(visited.contains(currStr)){
								toVisit.remove(toVisit.size()-1);
								currStr = toVisit.get(toVisit.size()-1);
							}
						}
						URL curr = new URL(((currStr.startsWith("http")?"":prev.getProtocol() + "://" + prev.getHost() + "/")) + currStr);
						sherlock.processPage(curr.openStream());
						visited.add(toVisit.get(toVisit.size()-1));
		
						sherlock.getLinks().forEachRemaining(System.out::println);
						System.out.println("-----------------{"+i+"}-----------------");
						sherlock.getLinks().forEachRemaining(b -> {
							if(visited.contains(b)){
								System.out.println("Already visited "+curr.toString());
							}else {
								if(b.contains("neumont")){
									toVisit.add(b);
								} else{
									//prevent scanning the entire web
								}
		//						toVisit.add(b);
							}
						});
					}
				} catch (IOException e) {
					e.printStackTrace();
				} */
	}
//	
//	@SuppressWarnings({ "unchecked" })
//	private void crawl(String link){
//		if(CURRENT_PAGE < MAX_PAGES){
//			if(vocal){
//				System.out.println("("+CURRENT_PAGE + "/"+MAX_PAGES+")");
//			}
//			CURRENT_PAGE++;
//			if(!visited.contains(link)){
//				try {
//					URL current = new URL(link);
//					if(vocal){
//						System.out.println(current.toString());
//					}
//					visited.add(link);
//					toVisit.remove(link);
//					sherlock.processPage(current.openStream());
//					//only add the link if it's not in the visited or toVisit lists.
//					sherlock.getLinks().forEachRemaining(l -> {
//						if(!visited.contains(l) && !toVisit.contains(l) && !l.equalsIgnoreCase("/")){
//							toVisit.add(l);
//						}
//					});
//					if(vocal){
//						/*---------------DEBUGGING LOGS---------------*/
//						System.out.println("----------VISITED:----------");
//						for(String s : visited){
//							System.out.println("\t"+s);
//						}
//						System.out.println("----------TOVISIT:----------");
//						for(String s : toVisit){
//							System.out.println("\t"+s);
//						}
//					}
//
//					ArrayList<String> toVisitClone = (ArrayList<String>) toVisit.clone();
//						for(String newLink : toVisitClone){
//							if(newLink.startsWith("http")){
//								crawl(newLink);
//							} else {
//								crawl(newLink, current);
//							}
//						}	
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			} else {
//				CURRENT_PAGE = MAX_PAGES + 1;
//			}
//		}
//	}
//
//	@SuppressWarnings({ "unchecked" })
//	private void crawl(String link, URL prev){
//		if(CURRENT_PAGE < MAX_PAGES){
//			CURRENT_PAGE++;
//			if(vocal){
//				System.out.println("("+CURRENT_PAGE + "/"+MAX_PAGES+")");
//			}
//			if(!visited.contains(link)){
//				try {
//					URL current = new URL(prev.getProtocol() + "://" + prev.getHost() + ((link.startsWith("/"))?link:"/" + link));
//					if(vocal){
//						System.out.println(current.toString());
//					}
//					visited.add(link);
//					toVisit.remove(link);
//					sherlock.processPage(current.openStream());
//					//only add the link if it's not in the visited or toVisit lists.
//					sherlock.getLinks().forEachRemaining(l -> {
//						if(!visited.contains(l) && !toVisit.contains(l) && !l.equalsIgnoreCase("/")){
//							toVisit.add(l);
//						}
//					});
//					if(vocal){
//						/*---------------DEBUGGING LOGS---------------*/
//						System.out.println("----------VISITED:----------");
//						for(String s : visited){
//							System.out.println("\t"+s);
//						}
//						System.out.println("----------TOVISIT:----------");
//						for(String s : toVisit){
//							System.out.println("\t"+s);
//						}
//					}
//					ArrayList<String> toVisitClone = (ArrayList<String>) toVisit.clone();
//						for(String newLink : toVisitClone){
//							if(newLink.startsWith("http")){
//								crawl(newLink);
//							} else {
//								crawl(newLink, current);
//							}
//						}	
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			} else {
//				CURRENT_PAGE = MAX_PAGES + 1;
//			}
//		}
//	}

}
