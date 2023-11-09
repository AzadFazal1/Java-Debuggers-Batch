
public class Runner {

	public static void main(String[] args) {
		HashCodeAndEqualsDemo obj1 = new HashCodeAndEqualsDemo(1, "BLIT");
		HashCodeAndEqualsDemo obj2 = new HashCodeAndEqualsDemo(2, "EXTEND");
		HashCodeAndEqualsDemo obj3 = obj2;
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj2);
		System.out.println(obj3.equals(obj2));
		System.out.println(obj1);
	
	}

}
