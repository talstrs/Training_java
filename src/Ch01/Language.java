package Ch01;

public class Language {

	private String name;
	private int version;
	
	
	//-----------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	
	//------------
	
	public Language(String a, int b) {
//		name = a;
//		version = b;
		setName(a);
		setVersion(b);
	}
	
	public Language() {
	
	}
	
}
