package revision;

public class Day6_Person {
	
	private String name,country;
	private int age;
	 
	public void setDetails(String name,String country,int age) {
		this.name=name;
		this.country=country;
		this.age=age;
	}
    public String getName() {
    	return name;
    }
    public String getCountry() {
    	return country;
    }
    public int getAge() {
    	return age;
    }
	public static void main(String[] args) {
		
         Day6_Person d = new Day6_Person();
         d.setDetails("Anitha","India",23);
         System.out.println("Name:" +d.getName());  
         System.out.println("Country:" +d.getCountry());
         System.out.println("Age:" +d.getAge());
        	 
         }
	}

