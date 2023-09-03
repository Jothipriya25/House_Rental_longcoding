package test;

class Sugg {
	int sugg_id;
	String sugg_location;
	float sugg_rent;
	
	
	Sugg(int sugg_id, String sugg_location, float sugg_rent){
		this.sugg_id  = sugg_id;
		this.sugg_location = sugg_location;
		this.sugg_rent = sugg_rent;
	}
	
	public void showSugg() {
		System.out.println("-----------------");
		System.out.println("Suggestion ID: " + this.sugg_id );
		System.out.println("Suggestion Loaction: " + this.sugg_location );
		System.out.println("Suggestion Rent: " + this.sugg_rent);
		System.out.println("-----------------");

	}
}
