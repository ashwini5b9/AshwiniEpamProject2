package epamcom.newyeargift;

public class Patchi  implements Chocolates{
	double weightOfChocolates = 120;
	public double calculateWeight(int numberOfChocolates) {
		return numberOfChocolates * weightOfChocolates;
	}
}