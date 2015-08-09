import java.util.Scanner;

class clubmember {

    public static void main(String[] args) {
    	
    	int id;
         String fname, lname;
         Scanner input = new Scanner(System.in);

         System.out.println("Enter ID>");
         id = input.nextInt();

         System.out.println("Enter first name >");
         fname = input.next();

         System.out.println("Enter last name >");
         lname = input.next();
    	
    	
    	
    	 BinaryTreeTest foo = new BinaryTreeTest(); 
    	 

    	   Person per1 = new Person(id, fname, lname);
    	   BinaryTreeTest.Node nod1 = new BinaryTreeTest.Node(per1);

    	   Person per2 = new Person(734, "Smith", "Rick");
    	   Person per3 = new Person(324, "Gates", "Jill");

    	   foo.insert(nod1, per2);
    	   foo.insert(nod1, per3);
  
    	   foo.printInOrder(nod1);


    }
}