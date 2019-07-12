package main;

import model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st =new Student("lw",18,"ÄÐ","001723");
		System.out.println(st.getName()+" ÐÔ±ð£º"+st.getGender()+st.getAge()+"Ëê£¬Ñ§ºÅ£º"+st.getStudentID());
		
	}

}
