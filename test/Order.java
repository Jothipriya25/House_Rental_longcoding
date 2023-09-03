package test;

class Order {
	int order_id;
	String order_date;
	int req_id_fk;
		
		
	Order (int order_id, String order_date, int req_id_fk){
		this.order_id  = order_id;
		this.order_date = order_date;
		this.req_id_fk = req_id_fk;
		}
		
}
