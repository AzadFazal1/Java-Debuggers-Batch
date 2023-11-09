import java.util.Objects;

public class HashCodeAndEqualsDemo {
	int id;
	String name;
	
	public HashCodeAndEqualsDemo() {
 		// TODO Auto-generated constructor stub
	}
	
	public HashCodeAndEqualsDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeAndEqualsDemo other = (HashCodeAndEqualsDemo) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "HashCodeAndEqualsDemo [id=" + id + ", name=" + name + "]";
	}
	
	
//	public String toString() {
//		return "id : " + id + " name : " + name;
//	}
	
	
}
