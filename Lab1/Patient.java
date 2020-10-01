
public class Patient {

	int id;
	String name;
	int age;
	String disease;
	boolean cure;

	public Patient(int id, String name, int age, String disease, boolean cure) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.disease = disease;
		this.cure = cure;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public boolean isCure() {
		return cure;
	}

	public void setCure(boolean cure) {
		this.cure = cure;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", disease='" + disease + '\'' +
				", cure=" + cure +
				'}';
	}
}
