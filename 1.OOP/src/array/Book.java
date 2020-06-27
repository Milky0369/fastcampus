package array;

public class Book {

	private String title;
	private String auth;
	
	public Book() {}
	
	public Book(String title, String auth) {
		this.title = title;
		this.auth = auth;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	public void showBookInfo() {
		System.out.println(title + "," + auth);
	}
	
}
