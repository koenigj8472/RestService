package testHibernate.model;

public class User {
	private Integer id;
	private String userName;
	private Name name;
	
	public User(){
	}
	
	public User(String userName){
		this.setUsername(userName);
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
}