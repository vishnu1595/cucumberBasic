package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class StringPractice {

	String refData = "";

	public static void main(String args[]) {
		// removeJunk("##&#&@^@^Monday234@$$%%$$# Holiday");
		// reverseString("Manoday");
		//reverseString1("monday");
		//reverseInterger(256784);
		//findMissingNumInArray();
		//findFibbonaci(5);
		//findLargestAndSmallestNumInArray();
		//findDuplicatesfromArray();
		//findDuplicatesStringFromArray();
		//stringManupulation("The rains have started here selenium");
		//swapTwoNumber();
		//swapTwoString();
	}
	
	 public static void swapTwoString() {
		 String x="hello";
		 String y="world";
		 x=x+y;//helloworld
		 y=x.substring(0, x.length()-y.length());
		 x=x.substring(y.length());
		 System.out.println(x +" "+y);
		    
	 }
	
	
	public static void swapTwoNumber() {
		int x=10;
		int y=40;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x +"   "+y);
		x=x^y;  //zor
		y=y^x;
		x=x^y;
		System.out.println(x +"   "+y);
	}
	
	
	
	public static void stringManupulation(String s) {
		String s2 ="   The rains have started here selenium  ";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('s'));//1st occurrence s
		System.out.println((s.indexOf('s',9)));
		System.out.println(s.indexOf('s',s.indexOf('s')+1)); //2nd occurrence s
		System.out.println(s.indexOf('s',s.indexOf('s',s.indexOf('s')+1)+13));//3rd occurring s need to check s
	    System.out.println(s.indexOf("have"));
	    System.out.println(s.indexOf("hello")); //will get -1 means value is not present
	    s2=s2.trim();//The rains have started here selenium
	    System.out.println(s2);
	    System.out.println(s.equalsIgnoreCase(s2));//true
	    System.out.println(s.substring(0,8));//The rain
	    String x="hello";
	    String y="world";
	    int a=10;
	    int b=30;
	    System.out.println(x+y+a+b);//helloworld1030
	    System.out.println(x+y+(a+b));//helloworld40
	    System.out.println(a+b+x+y);//40helloworld
	
	}
	
	public static void findDuplicatesStringFromArray() {
		String [] s = {"ram", "shyam", "Ram", "hello", "shyam"};
		
		Set<String> hashset = new HashSet<>();
		for(String s1 : s) {
	    if(hashset.add(s1)==false){
		System.out.println(s1);
		}
	  }
	}
	
	
	public static void findDuplicatesfromArray() {
		int a[]= {2,3,5,2,9,4,22};
//		for(int i=0;i<a.length;i++)
//		for(int j=i+1; j<a.length;j++) {
//			   if(a[i]==a[j]) {
//			    	System.out.println("duplicate value is : "+a[i]);
//			    }
//		}
		Set<Integer> hashset=new HashSet<>();
		for(Integer num : a) {
			if(hashset.add(num)==false) {
				System.out.println(num);
			}
		}
	   
	}
	
	public static void findLargestAndSmallestNumInArray() {
		int a[]= {2,3,5,2,-29,9,4,22};
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=1; i<a.length;i++) {
			if(largest<a[i]) {
				largest=a[i];
			}
			if(smallest>a[i]) {
				smallest=a[i];
			}
		}System.out.println("largest : "+largest +" and Smallest : "+smallest);
	}
		
	public static void findFibbonaci(int num) {
		
		int n1=0,n2=1,n3=0;
		  System.out.print(n1 +" "+ n2);
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void findMissingNumInArray() {
		int a[] = { 1, 2, 4, 5 };

		int sum = 0, sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		for (int j = 1; j <= 5; j++) {
			sum = sum + j;
		}
		System.out.println(sum - sum1);
	}

	public static void reverseInterger(int num) {
		int rev=0,temp=num;
		while(num!=0) {
			rev=rev*10+num%10;
		     	num=num/10;
		}
		System.out.println(rev);
		System.out.println("by string buffer");
		System.out.println(new StringBuffer(String.valueOf(temp)).reverse());
	}
	
	public static void removeJunk(String data) {
		data = data.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(data);

	}

	public static void reverseString(String data) {
		char[] s = data.toCharArray();
		String revString = "";
		for (int i = 0; i < s.length; i++) {
			revString = s[i] + revString;
		}
		System.out.println(revString);
	}

	public static void reverseString1(String data) {
		String revString = "";
		for (int i = 0; i < data.length(); i++) {
			revString = data.charAt(i) + revString;
		}
		System.out.println(revString);
	}

}
