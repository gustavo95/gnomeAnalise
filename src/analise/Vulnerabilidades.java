package analise;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

//gnome
public class Vulnerabilidades {
	private static ArrayList<String> temp;

    public Vulnerabilidades() throws Exception {
    	temp = new ArrayList<>();
    	getCVE("https://www.cvedetails.com/vulnerability-list/vendor_id-283/product_id-14792/Gnome-Gnome.html");
    }
    
    public ArrayList<String> getTemp() {
    	
		return temp;
	}

	private static void getCVE(String url) throws IOException{
        Document doc = Jsoup.connect(url).get();

        Elements cves = doc.getElementsByClass("srrowns");
        
        for (int i = 0; i < cves.size(); i++) {     	
        	temp.add(cves.get(i).getAllElements().get(0).text());
        }
    }
}
