
public class TestMain {

	public static void main(String[] args) {
		// Part A Begins Here:

		Professor Eric = new Professor("Eric",1000);
		Student Minzah = new Student(Eric,"Minzah",20);
		Student Amanda = new Student(Eric,"Amanda",90);
		Student Spencer = new Student(Eric,"Spencer",80);
		Student Allan = new Student(Eric,"Allan",400);


		Exam Exam1 = Eric.makeExam(1);
		Exam Exam2 = Eric.makeExam(2);
		Exam Exam3 = Eric.makeExam(3);
		Exam Final = Eric.makeExam(4);


		// Part B Begins Here:


		Minzah.take(Exam1);
		Amanda.take(Exam1);
		Spencer.take(Exam1);
		Allan.take(Exam1);

		Minzah.take(Exam2);
		Amanda.take(Exam2);
		Spencer.take(Exam2);
		Allan.take(Exam2);

		Minzah.take(Exam3);
		Amanda.take(Exam3);
		Spencer.take(Exam3);
		Allan.take(Exam3);

		Minzah.take(Final);
		Amanda.take(Final);
		Spencer.take(Final);
		Allan.take(Final);

		// Part C Begins Here:

		Eric.grade(Minzah);
		Eric.grade(Amanda);
		Eric.grade(Spencer);
		Eric.grade(Allan);



		System.out.println(Minzah);
		System.out.println(Amanda);
		System.out.println(Spencer);
		System.out.println(Allan);





	}
}