package WhyHAshCodeISImmuTABLEoBJECT.COM.DK;

import java.util.HashMap;

public class MainClass {
	
	public static void main(String[] args) {
//		System.out.println(" Start Main hi !!");
//
//		HashMap<String, String> map = new HashMap<>();
//		map.put("Deva", "Maurya");
//		System.out.println(map.getClass());
//		System.out.println("The value by key is :" + map.get("Deva"));
//		System.out.println(map);

		HashMap<Student, String> map = new HashMap<>();
		Student student = new Student("Devanand ");
		map.put(student , "India");
		//BY THIS LINE PROPERTY OF KEY NULL OUTPUT BECAUSE HASHMAP KEY IS IMMUTABLE
		
		//student.setName("Japan");
		System.out.println(map.get(student));
		System.out.println("######################");
	
	}
}
