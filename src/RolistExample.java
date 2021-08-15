import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RolistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> totalList = Arrays.asList(
			new Student("홍길동",10,Student.Sex.MALE),	
			new Student("김수애",6,Student.Sex.FEMALE),	
			new Student("신용권",10,Student.Sex.MALE),	
			new Student("박수미",6,Student.Sex.FEMALE)	
		);
//		Student Student = new Student();
//		totalList.stream().forEach(s -> System.out.println(s.getName()));
//		Stream<Student> totalStream = totalList.stream();
//		Stream<Student> maleStream = totalStream.filter(s -> s.getScore() == Student.score(6));
//		Collector<Student, ?, List<Student>> collector = Collectors.toList();
//		List<Student> maleList = maleStream.collect(collector);
//		maleList.forEach(s -> System.out.println(s.getName()));
//		
		List<Student> maleList = totalList.stream()
		.filter(s->s.getSex() == Student.Sex.MALE)
		.collect(Collectors.toList());
		
//		long a = Arrays.stream(new int[] {1,2,3,4,5})
//		.filter(s -> s%2==0)
//		.count();
//		System.out.println(a);
//		
//		List<Student> scoreList = totalList.stream()
//		.filter(s -> s.getScore()==Student.score(10))
//		.collect(Collectors.toList());
//		scoreList.stream().forEach(s -> System.out.println(s.getName()));
//		
//		String s ="자바";
//		Consumer<String> con = new accept(s -> System.out.println(s+"8"));
//				
		Exinterface<String> con;
		con = () -> {
			System.out.println("이거 맞냐");
		};
		con.method();
	}
	

}
