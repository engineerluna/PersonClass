/*	Luis Luna

*/

import java.io.*;
import java.util.*;


public class Person
	{
		private String lastName;
		private String firstName;
		private String emailAddress;
		
		
		public Person(String fn, String ln, String em)
			{
				lastName = ln;
				firstName = fn;
				emailAddress = em;
			}
		public String toString()
			{
				String x = lastName + ", " + firstName + " E-mail: " + emailAddress;
				return x;
			}
		public int compareTo(Person p)
			{
			    
				if(lastName.compareToIgnoreCase(p.lastName)==0)
					return( firstName.compareToIgnoreCase(p.lastName));
				else
					return (lastName.compareToIgnoreCase(p.lastName));
			}
		
		public void setEmailAddress(String addr)
			{
				emailAddress = addr;
			}
		public String getLastName()
			{
				return lastName;
			}
		public String getFirstName()
			{
				return firstName;
			}
		
		
		
}
