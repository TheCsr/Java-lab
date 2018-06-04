package package1;
public class MainClass {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new NumberThread();
		Thread t2 = new VowelThread();
		t2.start();
		/*try {
			t2.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t1.start();
	}

}