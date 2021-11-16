import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   String l;
		       System.out.print("Enter list of words seperated by spaces:");
		       l = sc.nextLine();
		       //parsing list of words to array
		       String a[] = l.split("\\s");
		       String s;
		       System.out.print("Enter word to search:");
		       s=sc.next();//reading search word
		       int c=0;//to store the count of the word in list
		       System.out.print("Entered words are:");
		       for(int i=0;i<a.length;i++)
		       {
		       System.out.print(a[i]+" ");
		       if(s.equals(a[i]))
		       c++;//if search word found in list
		      
		       }
		       System.out.println("\nSearch word is :"+s);
		       if(0<c)
		       System.out.println("Yes it is present "+c+" times");
		       else
		       System.out.println("No it is not present");

	}

}
