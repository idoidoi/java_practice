import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project02_B {
	public static void main(String[] args) {
		String url="https://sum.su.or.kr:8888/bible/today/Ajax/Bible/BosyMatter?qt_ty=QT1";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("년-월-일");
		String bible=br.readLine();
		url=url+"&Base_de="+bible+"&bibleType=1";
		System.out.println("================");
		Document doc=Jsoup.connect(url).post();
		Element bible_text=doc.select(".bible_text").first();
		System.out.println(bible_text.text());
		
		
		Elements body_list=doc.select(".body_list > li");
		for (Element ele : body_list) {
			System.out.println(ele.select(".num").text());
			System.out.println(ele.select(".info").text());
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
