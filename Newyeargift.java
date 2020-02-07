package com.epamwork.hometask;
import java.util.*;
public class Newyeargift {

	public static void main(String[] args) {
		int choice,total_weight=0,halwa_weight=180,lindor_weight=90,Munch_weight=60,snickers_weight=100,Dairymilk_weight=40,quantity;
		char addmore;
		boolean flag=true;
		Giftbox object;
		HashMap<String, Integer> mygiftbox = new HashMap<>();
		Scanner scanner_object = new Scanner(System.in);
		System.out.println("Select items in your giftbox : ");
		while(flag) {
		System.out.println("1.Halwa\n2.lindor\n 3.Munch\n 4.snickers\n 5.Dairymilk\n Enter your choice");
		choice=scanner_object.nextInt();
		System.out.println(choice);
		switch(choice) {
		case 1:
		System.out.println("Enter Halwa units : ");
		quantity=scanner_object.nextInt();
		object=new Halwa();
		total_weight += object.calculateweight(halwa_weight,quantity);
		mygiftbox.put("Halwa", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 2:
		System.out.println("Enter lindor units : ");
		quantity=scanner_object.nextInt();
		object=new lindor();
		total_weight += object.calculateweight(lindor_weight,quantity);
		mygiftbox.put("lindor", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 3:
		System.out.println("Enter Munch units : ");
		quantity=scanner_object.nextInt();
		object=new Munch();
		total_weight += object.calculateweight(Munch_weight,quantity);
		mygiftbox.put("Munch", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 4:
		System.out.println("Enter Snickers units : ");
		quantity=scanner_object.nextInt();
		object=new snickers();
		total_weight += object.calculateweight(snickers_weight,quantity);
		mygiftbox.put("snickers", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 5:
		System.out.println("Enter Dairymilk units : ");
		quantity=scanner_object.nextInt();
		object=new Dairymilk();
		total_weight += object.calculateweight(Dairymilk_weight,quantity);
		mygiftbox.put("Rasgulla", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		default : System.out.println("Enter correct choice ");
		}


	}

}
}
