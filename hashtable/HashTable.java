//Allen Hendricks
//Unit 8

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class HashTable
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
    	System.out.println("Welcome to the Customer Database");
        LinearHashTable hashtable = new LinearHashTable();
        insertData(hashtable);
        int choice = 0;
        
        do
        {
            System.out.println("1. Access Record");
            System.out.println("2. Remove Record");
            System.out.println("3. Quit");
            System.out.print("Select a menu option >> ");
            choice = scanner.nextInt();
            if (choice == 1)
            {
                System.out.print("Enter a Recorded Customer id number>> ");
                int id = scanner.nextInt();
                Record obj = (Record)hashtable.getObject(id);
                if (obj == null)
                    System.out.println("Cannot find record " + id);
                else
                    System.out.println("Record ID = " + obj.getId() + " " + obj.getContent());
            }
            else if (choice == 2)
            {
                System.out.print("Enter a Recorded Customer id number: ");
                int id = scanner.nextInt();
                Record obj = (Record)hashtable.deleteObject(id);
                if (obj == null)
                    System.out.println("Cannot find record " + id);
                else
                    System.out.println("Deleted Record ID = " + obj.getId() + " " + obj.getContent());  
            }            
            
        } while (choice != 3);

    }

    private static void insertData(LinearHashTable table) throws IOException
    {
        PrintWriter writer = new PrintWriter("record.txt");
        do
        {
        	System.out.println("Input 0 to exit or ");
            System.out.print("Enter a customer id number: ");
            int id = Integer.parseInt(scanner.nextLine());
            if (id == 0)
                break;
            System.out.print("Enter customer name: ");
            String record = scanner.nextLine();
            
            Record recObj = new Record(id, record);
            if (!table.addObject(recObj))
                System.out.println("Record ID exists.");
            writer.println(id);
            writer.println(record);            
            
            
        } while (true);
        writer.close();   
    }
}
