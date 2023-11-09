import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		scn.next();
		String name = scn.next();
		double salary = scn.nextDouble();
		System.out.println("age :" + age + "  name : " + name + "  salary : " + salary);
		scn.close();
	}

}
