package analise;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

//gnome
public class Main {

	public static void main(String[] args) throws Exception {
		//LogsDiffs logs = new LogsDiffs();
		//logs.getLogs();
		//System.out.println(logs.getDiffs());
		//System.out.println(logs.getDiffs().size());
		BugsPatches b = new BugsPatches();
		b.getBugs("https://bugzilla.gnome.org/");
	}

}
