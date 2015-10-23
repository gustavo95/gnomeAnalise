package analise;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

//gnome
public class BugsPatches {
	
	public BugsPatches(){
		
	}
	
	public void getBugs(String url) throws IOException{
		Connection connection = Jsoup.connect(url);
		Document doc = connection.get();

        Elements bugs = doc.getElementsByClass("first-child bz_id_column");
        
        for (int i = 0; i < bugs.size(); i++) {     	
        	System.out.println(bugs.get(i).getAllElements().get(0).text());
        }
	}
}
