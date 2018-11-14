
public class Student {
	
	private int id;
	private String name;
	private Student next; //pointer that points to the next object
	
	public Student (String name, int id){
		this.setId(id);
		this.name = name;
		setNext(null);
	}
	@Override
	public String toString(){
		return "Name: " + name + " ID number: " + getId();
	}
	public Student getNext() {
		return next;
	}
	public void setNext(Student next) {
		this.next = next;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
