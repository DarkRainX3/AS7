/**
 * This class contains the data attributes that describe a student object and contains setters and getters for the attributes.
 * @author Waley
 *
 */
public class Student {
	
	private int id;
	private String name;
	private Student next; //pointer that points to the next object
	
	/**
	 * Constrcutor for student with a name and id number
	 * @param name Desired student name
	 * @param id Desired student id
	 */
	public Student (String name, int id){
		this.setId(id);
		this.name = name;
		setNext(null);
	}
	/**
	 * This method returns the student's information in a string
	 */
	@Override
	public String toString(){
		return "Name: " + name + " ID number: " + getId();
	}
	/**
	 * this method returns the next student in the linked list
	 * @return next student in linked list
	 */
	public Student getNext() {
		return next;
	}
	/**
	 * this methods sets the next student in the linked list
	 * @param next the next student object in the linked list
	 */
	public void setNext(Student next) {
		this.next = next;
	}
	/**
	 * This method gets the name of the student
	 * @return name of student
	 */
	public String getName() {
		return name;
	}
	/**
	 * this method sets the name of the student
	 * @param name the desired student name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This method gets the student id number
	 * @return the student's id
	 */
	public int getId() {
		return id;
	}
	/**
	 * This method sets the student id number
	 * @param id desired student id number
	 */
	public void setId(int id) {
		this.id = id;
	}
}
