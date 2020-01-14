package hashcode;

public class Person {
	
	public Person(String name, String nik) {
		super();
		this.name = name;
		this.nik = nik;
	}
	private String name;
	private String nik;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nik == null) ? 0 : nik.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nik == null) {
			if (other.nik != null)
				return false;
		} else if (!nik.equals(other.nik))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", nik=" + nik + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNik() {
		return nik;
	}
	public void setNik(String nik) {
		this.nik = nik;
	}

}
