public class Artist{
	String tname;
	
	Artist(String name){
		tname=name;
	}
	public void setName(String name1){
		tname=name1;
	}
	public String getName(){
		return tname;
	}
	
	public void display(){
		System.out.println("artist name: "+tname);
	}
}