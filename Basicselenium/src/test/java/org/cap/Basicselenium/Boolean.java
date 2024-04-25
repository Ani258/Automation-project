package org.cap.Basicselenium;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
boolean t=true;
boolean f=false,b;
b=(t|((i++)==0));
b=(f|((i+=2)>0));
System.out.println(b);

String x="capgemini";
System.out.println(x.lastIndexOf("i",5));
	}

}
