import java.util.Objects;

class strtest {
	int str2;
	
	public strtest(int str2) {
		super();
		this.str2 = str2;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(str2);
	}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			System.out.println(obj);
			strtest other = (strtest) obj;
			boolean result = this.str2 == other.str2;
			System.out.println(result);
			return result;
		}
	
}
public class adasdasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "text1";
//		String str1 = "text1";
//		
//		if(str.equals(str1)) {
//			System.out.println("같다");
//		} else {
//			System.out.println("같지 않다");
//		}
//		
		strtest str = new strtest(10);
		strtest str1 = new strtest(10);
		
	if(str.equals(str1))
		System.out.println("같다");
	else 
		System.out.println("같지않다");
	System.out.println(str.toString());
	System.out.println(str1.toString());
	}
}
