package StudentPackage;

public class CreditLimit extends Exception{

	public String toString() {
		return new String ("Cannot register for more than 30 credits");
	}
}
