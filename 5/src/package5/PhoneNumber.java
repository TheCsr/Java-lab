package package5;
import java.util.*;

class PhoneNumber
{	
	
	
public static void main(String args[])
{	
	Scanner s = new Scanner(System.in);
	String[] lot = new String[10];
	int ii = 0;
	
	
HashMap<Integer, Phone> pm = new HashMap<Integer, Phone>();
HashMap<Integer, String> nam = new HashMap<Integer, String>();
	nam.put(1, "Ram");
	nam.put(2, "Sam");
	nam.put(3, "Wong");
	nam.put(4, "john");
	nam.put(5, "Ravi");
	nam.put(6, "Rajesh");
	nam.put(7, "Ramesh");
	nam.put(8, "Private");
	nam.put(9, "Private");
	nam.put(10, "Private");

HashMap<Integer, String> num = new HashMap<Integer, String>();

	num.put(1, "122345");
	num.put(2, "234552");
	num.put(3, "252452");
	num.put(4, "525551");
	num.put(5, "524255");
	num.put(6, "525245");
	num.put(7, "253452");
	num.put(8, "523455");
	num.put(9, "5325275");
	num.put(10, "253565");
	Calendar c = Calendar.getInstance();
	s = new Scanner(System.in);
	int count = 1;
while (true)
{
	System.out.println("Enter the choice\n 1)add 2)Disply 3)Delete 4)exit");
	int ch = Integer.parseInt(s.next());
switch (ch)
{
	case 1:
			if (count <= 10)
					{
						Random rand = new Random();
						int number = rand.nextInt(10);
						String Name = nam.get(number);
						String Number = num.get(number);
						int hour = c.get(Calendar.HOUR);
						int min = c.get(Calendar.MINUTE);
						int sec = c.get(Calendar.SECOND);
						String time = hour + ":" + min + ":" + sec;
						pm.put(count, new Phone(Name, Number, time));
						count++;
					}else
							pm.remove(1);
							break;
	case 2:
			Set<Map.Entry<Integer, Phone>> myset = pm.entrySet();
			for (Map.Entry<Integer, Phone> me : myset)
			{
				System.out.println("----------------------------\n");
				System.out.println(me.toString());
			System.out.println("Enter the choice 1)Display number\n 2)Delete the displayed number and print the next number");
				int cd = Integer.parseInt(s.next());
				switch (cd)
				{
				case 1:
						continue;
				case 2:
					lot[ii] = Integer.toString(me.getKey());
					ii++;
					System.out.println("Deleted!!!");
					continue;
				}
				System.out.println("\n");
			}
			for (int r = 0; r < ii; r++)
			{
				int mm = Integer.parseInt(lot[r]);
				pm.remove(mm);
			}
			ii = 0;

			break;

			
	case 3:
			System.out.println("Enter the Phone number to be delete");
			Scanner s1=new Scanner(System.in);
			String s3=s1.next();
			Set<Map.Entry<Integer, Phone>> myset1 = pm.entrySet();
			for (Map.Entry<Integer, Phone> me1 : myset1)
			{
				Phone p1=me1.getValue();
				String s2=p1.phnumber;
				if(s3.equals(s2))
				{
					int t=me1.getKey();
					pm.remove(t);
					System.out.println("deleted!!");
					break;
			
					}
			}
			break;	
	case 4:
		System.exit(0);
}
}
}
}