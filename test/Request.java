package test;

class Request {
	
	int req_id;
	int house_id_fk;
	int cust_id_fk;
	boolean is_approved;
		
		
	Request(int req_id, int house_id_fk, int cust_id_fk, boolean is_approved){
		this.req_id  = req_id;
		this.house_id_fk = house_id_fk;
		this.cust_id_fk = cust_id_fk;
		this.is_approved = is_approved;
	}
		
}
