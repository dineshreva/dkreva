package sample.course;

public class Courses {
	private int id;
	private String name;
	private String subject;
	public Courses(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
}
