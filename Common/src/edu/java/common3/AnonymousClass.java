package edu.java.common3;

//initiate a anonymous inner class will create a instance of this class and this class will be expired.
//anonymous class must extends a super class or an interface, but only one class or one interface
//anonymous class can not be a abstract class and does not have constructor
//anonymous class use init block to accomplish all the parameters and so on
//anonymous class wants to use local parameter, that parameter must have a 'final' keyword.

public class AnonymousClass {
	public void test(Product p){
		System.out.println(p.getName());
	}
	public static void main(){
		AnonymousClass ac = new AnonymousClass();
		ac.test(new Product(){
			{
				System.out.println("this is an init block");
			}
			public double getPrice(){
				return 0;
			}
			public String getName(){
				return "haha";
			}
		});
	}
}

interface Product{
	public double getPrice();
	public String getName();
}

