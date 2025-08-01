
public class Books {
	private int id;
	private string name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public string getName() {
		return name;
	}
	public void setName(string name) {
		this.name = name;
	}
	
	public int compareTo(Books b )
	{
		int diff = this.id - b.id;
		return diff;
	}
	
	
}