package testHibernate.model;


public class Name {
	private String first;
	private String middle;
	private String last;

	public Name() {
	}

	public Name(String first, String last) {
		this.setFirst(first);
		this.setLast(last);
	}

	public Name(String first, String middle, String last) {
		this.setFirst(first);
		this.setMiddle(middle);
		this.setLast(last);
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
}
