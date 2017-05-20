 package encap;

public class GetCreditCardNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LearnEncap obj = new LearnEncap();
		System.out.println(obj.getCreditCardNum());
		
		obj.setCreditCardNum("9876 5874 1236 5478");
		System.out.println(obj.getCreditCardNum());

	}

}
 