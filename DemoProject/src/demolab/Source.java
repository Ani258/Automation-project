package demolab;

import java.util.TreeMap;

public class Source {
	
	public TreeMap<String,String> data;
	public Source() {
		data = new TreeMap<>();
	}
	
	
	
	
	
	
	
	
	public String putNumber(String name,String number)throws Ill {
		try {
			if(name!="null"&&number!="null") {
				data.put(name,number);
				return "True";
			}
			else {
				throw IllegalArgumentException("Name or Number : Not valid");
			}
		}catch(IllegalArgumentException e) {
			e.getMessage();
		}
	}
	








	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source directory = new Source();
		System.out.println(directory.putNumber("A1","1111"));
		System.out.println(directory.putNumber("A2","2222"));
		System.out.println(directory.putNumber("A3","3333"));
		System.out.println(directory.putNumber("A4","null"));
		System.out.println(directory.print());
		System.out.println(directory.putNumber("A1"));
		System.out.println(directory.putNumber("A2"));
		System.out.println(directory.putNumber("A3"));

	}


}
