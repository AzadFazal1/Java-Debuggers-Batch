
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Learning");
		sb.append("Java");
		sb.append(12);
		sb.append(23.09);
		sb.append(false);
		sb.insert(7, "azad");
		sb.delete(16, 20);
		sb.deleteCharAt(16);
		sb.reverse();
		
		
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("BinaryLgic").reverse().insert(2,"xyz").delete(3,5);
		System.out.println(sb1);
	}

}
