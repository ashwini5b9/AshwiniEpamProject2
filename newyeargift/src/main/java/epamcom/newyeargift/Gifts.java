package epamcom.newyeargift;

import java.util.*;

public class Gifts {
		static Scanner sc = new Scanner(System.in);
		static Map<String, Integer> mp = new HashMap<String, Integer>(){{ 
			put("FerreroRocher", 0); put("Hershey", 0); put("Patchi", 0); put("Badam", 0); put("Pista", 0); put("halwa", 0);
		}};
		public static void main(String args[]) {
			SweetsAndDryfruits halwa = new SweetsAndDryfruits();
			halwa.setWeight(150);
			SweetsAndDryfruits Pista = new SweetsAndDryfruits();
			Pista.setWeight(140);
			SweetsAndDryfruits Badam = new SweetsAndDryfruits();
			Badam.setWeight(25);
			FerreroRocher fr = new FerreroRocher();
			Hershey g = new Hershey();
			Patchi c = new Patchi();
			
			char m = 'y';
			System.out.println("1. FerreroRocher\n2. Hershey\n3. Patchi\n4. halwa\n5. Pista\n6. Badam");
			while (m == 'y') {
				System.out.println("Select gifts to calculate weight and number of items that you want to add to cart : ");
		        int n = sc.nextInt();
		        switch(n) {
			        case 1: mp.put("FerreroRocher", mp.get("FerreroRocher")+1);
			        	break;
			        case 2: mp.put("Hershey", mp.get("Hershey")+1);
			        	break;
			        case 3: mp.put("Patchi", mp.get("Patchi")+1);
			        	break;
			        case 4: mp.put("halwa", mp.get("halwa")+1); 
			        	break;
			        case 5: mp.put("Pista", mp.get("Pista")+1);
			        	break;
			        case 6: mp.put("Badam", mp.get("Badam")+1);
			         	break;
		        }
		        System.out.println("Are there more sweets or chocolates or dry fruits? (y/n) : ");
		        m = sc.next().charAt(0);
			}
			double totalWeight = fr.calculateWeight(mp.get("FerreroRocher")) + g.calculateWeight(mp.get("Hershey")) + c.calculateWeight(mp.get("Patchi"));
			totalWeight += Badam.calculateWeight(mp.get("Badam")) + Pista.calculateWeight(mp.get("Pista")) + halwa.calculateWeight(mp.get("halwa"));
			System.out.println("Total gift weight added to cart: " + totalWeight + " grams");
			int quantity = 0;
			System.out.println("Number of individual items in the cart : ");
			for (String candy : mp.keySet()) {
				System.out.println(candy + " : " + mp.get(candy));
				quantity += mp.get(candy);
			}
			System.out.println("Total number of items in the cart : " + quantity);
		}
}
	