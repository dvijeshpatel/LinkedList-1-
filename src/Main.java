import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
	LinkedList l = new LinkedList();
	Scanner s = new Scanner(System.in);
	System.out.println("Choices:");
	System.out.println("(1)Add");
	System.out.println("(2)Search");
	System.out.println("(3)Delete");
	System.out.println("(4)Print");
	System.out.println("(5)Exit");
	System.out.println("Enter index for choice");
	int choice = s.nextInt();
	while(choice!=5)
	{
	switch(choice)
	{
	case 1:
	{
		System.out.println("Enter element you want to add");
		l.addElement(s.nextInt());
		break;
	}
	case 2:
	{
		System.out.println("Enter element you want to search");
		l.searchElement(s.nextInt());
		break;
	}
	case 3:
	{
		System.out.println("Enter element you want to delete");
		l.deleteElement(s.nextInt());
		break;
	}
	case 4:
	{
		l.printElements();
	}
	default:
	{
		break;
	}
	
	}
	System.out.println("Choices:");
	System.out.println("(1)Add");
	System.out.println("(2)Search");
	System.out.println("(3)Delete");
	System.out.println("(4)Print");
	System.out.println("(5)Exit");
	System.out.println("Enter index for choice");
	System.out.println("Enter choice index");
	choice = s.nextInt();
	}
	
}
}