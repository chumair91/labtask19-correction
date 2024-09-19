public class Artwork{
	String artName;
	int artYear;
	Artist artist;
	
	Artwork(String name,int year){
		artName=name;
		artYear=year;
		artist=new Artist("thomas");
	}
	Artwork(String name,int year,Artist artist1){
		artName=name;
		artYear=year;
		artist=artist1;
	}

	public void display1(){
		System.out.println("art-name: "+artName);
		System.out.println("art-year: "+artYear);
		artist.display();
	}
	
}