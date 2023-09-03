package test;

import java.util.*;


class user{
	int user_id;
	String name;
	String email;
	String password;
	String mobile;
	String aadhar;
	String usertype;
	
	user(int user_id,String name,String email, String password, String mobile, String aadhar, String usertype){
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.aadhar = aadhar;
		this.usertype = usertype;
		
	}	


		public void display() {
			System.out.println(this.name + " - "+ this.usertype);
	
		}
		
		public String validation() {
			return (this.email + this.password);
		}

}

class Rental{
	Scanner in = new Scanner(System.in);
	List<user> UserList = new ArrayList();
	List<Sugg> SuggList = new ArrayList();
	List<HouseDetails> HouseList = new ArrayList();
	List<Request> ReqList = new ArrayList();
	List<Order> OrderList = new ArrayList();
	List<user> LoginList = new ArrayList();

	
	void hardCode() {
		
        // User list
		
    	user User1 = new user(1,"jo","jo@gmail.com","jo@123","5465856425","154874651326","customer");
    	user User2 = new user(2,"sri","sri@gmail.com","sri@123","2548895422","255986589659","owner");
    	user User3 = new user(3,"moo","moo@gmail.com","moo@123","5698564589","569845632578","admin");
    	user User4 = new user(4,"priya","priya@gmail.com","priya@123","2645893547","984635178954","customer");
    	
        this.UserList.add(User1);
        this.UserList.add(User2);
        this.UserList.add(User3);
        this.UserList.add(User4);
        
        // Suggestion List
        
        Sugg sugg1 = new Sugg(1,"Chennai",10000);
        Sugg sugg2 = new Sugg(2,"Erode",15000);
        Sugg sugg3 = new Sugg(3,"Madurai",25000);
        
        this.SuggList.add(sugg1);
        this.SuggList.add(sugg2);
        this.SuggList.add(sugg3);
        
        // House Details
        
        HouseDetails house1 = new HouseDetails(1,"Chennai",800,"1 BHK",10000,2,1);
        HouseDetails house2 = new HouseDetails(2,"Erode",600,"2 BHK",15000,2,2);
        HouseDetails house3 = new HouseDetails(3,"Madurai",1200,"3 BHK",25000,2,3);
        
        this.HouseList.add(house1);
        this.HouseList.add(house2);
        this.HouseList.add(house3);
        
        // Request List
        
        Request req1 = new Request(1,1,1,true);
        Request req2 = new Request(2,2,1,false);
        Request req3 = new Request(3,3,4,true);
        
        this.ReqList.add(req1);
        this.ReqList.add(req2);
        this.ReqList.add(req3);

        // Order List
        
        Order order1 = new Order(1,"2023-09-03",1);
        Order order2 = new Order(2,"2023-09-05",3);
        
        this.OrderList.add(order1);
        this.OrderList.add(order2);
	}
	
	public user UserValidation(String Email, String Password) {
		for(user i : UserList) {
			if (i.email == Email && i.password == Password) {
	    		 LoginList.add(i);
			}
				return i;
			}
		
		return null;
	}
	
	public void customer(user val) {
		boolean StayInCustomer = true;
		        while(StayInCustomer) {
		            
		        	System.out.println("\n------------------");
		            String Name = val.name;
		            System.out.println("Welcome "+ Name);
		            System.out.println("Customer Menu");
		            
		            System.out.println("1. Select House from Suggestions");
		            System.out.println("2. order");
		            System.out.println("3. History");
		            System.out.println("4. Logout");
		            
		            System.out.println("Enter ur choice: ");
		    	     int choice = in.nextInt(); 
		            
		            if(choice == 1)
		                this.listOfSugg();
		            else if (choice == 2)
		                this.orderingHouse();
//		            else if(choice == 3)
//		                this.history();
		            else if (choice == 4){
		                StayInCustomer = false;
		                System.out.println("Successfully Logout...");
		            }
		        }
			}
	
	 public HouseDetails listOfHouses() {
		 for (HouseDetails i : HouseList) {
			 i.showHouses();
		 }
		return null;
		
		
	 }
	 
	 public Sugg listOfSugg() {
		 for (Sugg i : SuggList) {
			 i.showSugg();
			 
		 }
				System.out.println("Enter ur choice: ");
				int choice = in.nextInt();
				System.out.println("------------------ ");
				
				for (HouseDetails j : HouseList) {
					if(j.sugg_id == choice) {
						System.out.println("House ID: " + j.house_id );
						System.out.println("House Location: " + j.house_location );
						System.out.println("House Sq_ft: " + j.sq_ft);
						System.out.println("House Type: " + j.housetype);
						System.out.println("House Rent: " + j.house_rent);
						System.out.println("-----------------");
					}
				}
		return null;
	 }
	 
	 public Order orderingHouse() {
		 
		 System.out.println("Enter the house ID to Order: ");
		 int order_choice = in.nextInt();
	
		 for (Request i : ReqList) {
			 for (user j : LoginList) {

			 if((order_choice == i.house_id_fk) && (i.is_approved == false)){
					 System.out.println(j.name + " Your Request has been Cancelled..");
				 }
			 
			else if ((order_choice == i.house_id_fk) && (i.is_approved == true)){
				 System.out.println(j.name + " Your Request has been Approved..");
				}
			 }
		 }
			 		 
		return null;
	 }
	 
} 

public class RentApp {
	    public static void main(String args[]){  
	    		    	
	    	Scanner in = new Scanner(System.in);
	    	Rental App = new Rental();
	    	App.hardCode();
	    	
	    	boolean flag = true;
	    	while(flag) {
	    		System.out.println("-----------------");
	    		System.out.println("1. Login");
	    		System.out.println("2. Signup");
	    	     
	    	     System.out.println("Enter ur choice: ");
	    	     int choice = in.nextInt(); 
	    	     
	    	     if (choice == 1) {
	    	    	 boolean bool = true;
	    	    	 while(bool) {
	    	    		 String Email = "jo@gmail.com";
	    	    		 String Password = "jo@123";
	    	    		 
	    	    		 user val = App.UserValidation(Email,Password);	    	    		 
	    	    		 if(val != null) {
	    	    			 System.out.println("Login Successfully");
	    	    			 if(val.usertype == "customer") {
	    	    				 App.customer(val);
	    	    				 bool = false;
	    	    				 flag = false;
	    	    			 }
//	    	    			 else if(val.usertype == "admin") {
//	    	    				 App.admin(val);
//	    	    				 bool = false;
//	    	    				 flag = false;
//	    	    			 }
	    	    		 }
    	    			 else {
    	    				 System.out.println("Invalid email or password");
    	    				 System.out.println();
    	    				 System.out.println("Re-Enter Email Password ");
    	    				 System.out.println();
    	    			 }

	    	    		 
	    	    	 }
	    	     }
	    	     else if(choice == 2){
	    	    	 
	    	     }
	    	    	 
	    	}

	    }  

}

