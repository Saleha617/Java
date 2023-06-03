public class Student{
    int id=42;
    String name="Zara";
    public void study(){
        System.out.println("Student is studying");
    }
}
public class Main
{
	public static void main(String[] args) {
		Student st=new Student();
		Student s=new Student();
		s.study();
		System.out.println(st.id);
		st.study();
		
	}
}
