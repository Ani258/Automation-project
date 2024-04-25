package revision;

import java.util.Scanner;

public class Day1_Calculator {

	public static void main(String[] args) {
		
		Day1_Calculator calculator = new Day1_Calculator();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Firstnumber: ");
		fn=sc.nextDouble();
		System.out.println("Enter Secondnumber: ");
		sn=sc.nextDouble();
		
		System.out.println("Addition= " + calculator.getAdditionResult());
		System.out.println("Subtraction= " + calculator.getSubtractionResult());
		
		System.out.println("Multiplication= " + calculator.getMultiplicationResult());
		System.out.println("Division= " + calculator.getDivisionResult());
		System.out.println("Modulus= " + calculator.getModulusResult());
		System.out.println("Postincrement= " + calculator.getPostIncreamentResult());
		System.out.println("Preincrement= " + calculator.getPreIncreamentResult());
		System.out.println("Postdecrement= " + calculator.getPostDecreamentResult());
		System.out.println("Predecrement= " + calculator.getPreDecreamentResult());
		

	}
	
          static double fn,sn;
          public double getFirstNumber(){
              return fn;
          }
          
          public double getSecondNumber(){
              return sn;
          }
  		
  		public void setFirstNumber(double num1){
  	        this.fn = num1;
  	    }
  	    
  	    public void setSecondNumber(double num2){
  	        this.sn = num2;
  	        
  	    }    
  		
  	      public double getAdditionResult(){
  	        return fn + sn;
  	    }
  	    
  	    public double getSubtractionResult(){
  	        return fn - sn;
  	    }
  	    
  	    public double getMultiplicationResult(){
  	        return fn * sn;
  	    }
  	    
  	  public double getDivisionResult () {

  	          if (sn == 0) {

  	             return this.sn = 0;

  	          } else {

  	              return fn/sn;

  	          }

      }
  	  
  	  public double getModulusResult () {
  		  return fn % sn;
  	  }
  	  
  	  public double getPostIncreamentResult () {
  		  return fn++;
  	  }
  	  
  	  public double getPreIncreamentResult () {
		  return ++fn;
  	  }
  	  
  	  public double getPostDecreamentResult () {
  	       return sn--;
  	  } 
  	  
  	 public double getPreDecreamentResult () {
	       return --sn;
  	 }
}
  	  
