package WhyHAshCodeISImmuTABLEoBJECT.COM.DK;

import java.util.HashMap;

///mutable class
public class MainFacStuent {
	
	public static void main(String[] args) {

		FaceStudent stmutableclass = new FaceStudent("Amit");
		Student studentobjImmu= stmutableclass;
		//Student student= new Student("Devanand");
		HashMap<Student ,String>map=new HashMap<>();
		map.put(studentobjImmu ,"India is great");
		stmutableclass.setFacstudentName("rajan change");
		System.out.println(map.get(studentobjImmu));
		System.out.println("********************************");
	}
}
