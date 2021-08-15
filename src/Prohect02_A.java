import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Prohect02_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://sports.news.naver.com/wfootball/index.nhn";
		Document doc=null;
//		try {
//			doc=Jsoup.connect(url).get();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		Elements element = doc.select("div.home_news");
//		String title = element.select("h2").text().substring(0,4);
//		System.out.println("===================================");
//		System.out.println(title);
//		System.out.println("=====================================");
//		for(Element ele : element.select("li")) {
//			System.out.println(ele.text());
//		}
//		System.out.println("=====================================");
		String url2 = "https://www.jobkorea.co.kr/Recruit/GI_Read/34988552?rPageCode=SL";
		try {
			doc=Jsoup.connect(url2).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Elements ele = doc.select(".description");
		System.out.println(ele.text());
	}

	
}
