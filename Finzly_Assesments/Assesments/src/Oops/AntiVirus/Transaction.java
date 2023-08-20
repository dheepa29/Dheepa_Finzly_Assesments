package antivirus;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
	static int productKey = 1000;
	static List<Integer> productKeyList = new ArrayList<>();			//Successful transaction list
	
	public int activate(int money) {
		if(money==1000) {
			productKey++;       							//Product Key generation
			productKeyList.add(productKey);
			System.out.println("Transaction Successfull");
			return productKey;
		}else {
			System.out.println("Transaction is not done - please pay first to activate product key");
			return 0;
		}
	}
	
}
