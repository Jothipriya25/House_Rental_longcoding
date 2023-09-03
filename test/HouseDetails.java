package test;

class HouseDetails {
	
	int house_id;
	String house_location;
	int sq_ft;
	String housetype;
	float house_rent;
	int owner_id;
	int sugg_id;
	
	HouseDetails(int house_id, String house_location, int sq_ft, String housetype, float house_rent,int owner_id, int 	sugg_id){
		this.house_id = house_id;
		this.house_location = house_location;
		this.sq_ft = sq_ft;
		this.housetype = housetype;
		this.house_rent = house_rent;		
		this.owner_id = owner_id;
		this.sugg_id = sugg_id;
	}
	
	public void showHouses() {
		System.out.println("-----------------");
		System.out.println("House ID: " + this.house_id );
		System.out.println("House Loaction: " + this.house_location );
		System.out.println("House Sq_ft: " + this.sq_ft);
		System.out.println("House Type: " + this.housetype);
		System.out.println("House Rent: " + this.house_rent);
		System.out.println("-----------------");

	}

}
