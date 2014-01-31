/*	Author: Luis Luna
	

*/
   import java.util.*;
	
   public class personDriver
   {
      
      public static void printList(Person[] list)
      {
         for(int i=0;i< list.length; i++)
         {
            System.out.println(list[i]);
         }
      	
      }//END printList
   		
      public static void sort(Person[] list)
      {
         int n = list.length;
      	
         for(int i=0; i<n; i++)
         {
            for(int j =0 ; j<n-1; j++)
            {
               if(list[j].compareTo(list[j+1]) >0)
               {
                  Person temp = list[j];
                  list[j] = list[j+1];
                  list[j+1] = temp;
               }
            }
         }
      }//END sort
   	
      public static void find(Person[] list, String name)
      {
         boolean find = false;
         for(int i=0; i<list.length; i++)
         {
            if(name.equalsIgnoreCase(list[i].getLastName())||name.equalsIgnoreCase(list[i].getFirstName()))
            {
               System.out.println("The name "+ name+" was found in the list: " +list[i]);
               find = true;
               	break;
            		
            }
	}
				
	 if(find== false)
		System.out.println("The name " + " was not found in the list of people. Try Again");
      }//END find
   
   
      public static void main(String[] args)
      {
         String name;
         Person[] person = new Person[10];
      	
         person[0] = new Person("Orange", "Ball", "exampple1@gmail.com");
         person[1] = new Person("Luis", "Luna", "example2@gmail.com");
         person[2] = new Person("Apple", "Cat", "example3@gmail.com");
         person[3] = new Person("Pear", "Dog", "example4@gmail.com");
         person[4] = new Person("Mango", "Fruit", "example5@gmail.com");
         person[5] = new Person("Zebra", "Fred", "example6@gmail.com");
         person[6] = new Person("Yoyo", "Kite", "example7@gmail.com");
         person[7] = new Person("Lady", "Gaga", "example8@gmail.com");
         person[8] = new Person("Beyonce", "Knowles", "example9@gmail.com");
         person[9] = new Person("Rice", "Beans", "example10@gmail.com");
	 
      	
       
         System.out.println("List of people");
  	 System.out.println("--------------");
         printList(person);
			
         sort(person);
			System.out.println();
         System.out.println("List of people when sorted");
         printList(person);
      	
         System.out.println();
      	//Input name that user would like to look for
         Scanner input = new Scanner(System.in);
         System.out.println("Input name or last name to search for: " );
         name = input.next();
         find(person, name);
      }
   	
   }
