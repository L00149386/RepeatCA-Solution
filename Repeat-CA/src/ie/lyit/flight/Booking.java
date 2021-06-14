
//Bryan-Kim Flores
//CSDF 3rd Year 
//Software Implementation CA Repeat

package ie.lyit.flight;

import java.util.Scanner;
import java.util.*;



public class Booking {
	
	//instance variables
	private String flightOutbound;
	private String flightInbound;
	private ArrayList <Passenger> passengers;
	private Double totalPrice;
	public int Upcomingcount=1;
	Scanner findPassenger = new Scanner(System.in);
	
	
	//Default Constructor
    public Booking() {
    	flightOutbound=flightInbound="";
    }
    
    //initialize the constructor 
	public Booking(String flightOutbound, String flightInbound, ArrayList <Passenger> passengers, double totalPrice,  int Upcomingcount){
		this.flightOutbound = flightOutbound;
		this.flightInbound = flightInbound;	
		this.passengers = passengers;
		this.totalPrice = totalPrice;
		this.Upcomingcount = Upcomingcount++;
		
		
	}
	
	// Overrides Object toString()
	@Override
	public String toString(){
		return "reservation" + count +  "==> "+flightOutbound + "to" + flightInbound + " " + passengers;
	}
	
	// Overrides Object equals()
	 @Override  
	   public boolean equals(Object obj){
		   	Booking RObject;
		   	if (obj instanceof Booking)
		   		RObject = (Booking)obj;
		   	else
		   		return false;

		   return this.flightOutbound.equals(RObject.flightOutbound) &&
	              this.flightInbound.equals(RObject.flightInbound) &&
			      this.passengers.equals(RObject.passengers) &&							
			      this.totalPrice.equals(RObject.totalPrice);
			     
	 }
		 //Count method 
	  public static void Upcomingcount() {
		  
	  }
	  
		 //Overrides the Boolean (findPassenger method
		  public boolean findPassengers(ArrayList<Passenger> record, Passenger p) {
			  boolean isPresent = false;
			  String search = this.findPassenger.nextLine();
			  
			  for(int i = 0; i <record.size(); i++) {
				  if(p.getName() == record.get(i).getName()) {
					  isPresent = true;
				  }
				  
			  }
			  return isPresent;
		  }
			  		 		  				  
			 //calculating the price 
			 public Double calculatePrice() {
			  totalPrice = (passengers.add(Size (flightOutbound.gettotalPrice() + flightInbound.gettotalPrice())));
			   return totalPrice;
			   }
						
			  // set() and get() methods
			 public void setfligOutbound(String flightOutbound) {
				 this.flightOutbound = flightOutbound;
			 }
			 public String getflightOutbound() {
				 return flightOutbound;
			 }
			 public void setflightInbound(String flightInbound) {
				 this.flightInbound = flightInbound;
			 }
			 public String getflightInbound() {
				 return flightInbound;
			 }
			 public void setPassengers(ArrayList<Passenger> passengers) {
				 this.passengers = passengers;
			 }
			 public ArrayList<Passenger> getpassengers() {
				 return passengers;
			 }
			 public void setcalculatePrice(Double totalPrice) {
				 this.totalPrice = totalPrice;
			 }
			 public Double getTotalPrice() {
				 return totalPrice;
			 }
						  
					  
				  }

			  
			   
			  
			  
	