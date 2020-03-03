package epamcom.newyeargift;

public class Hershey  implements Chocolates{
	double weightOfChocolates = 140;
	public double calculateWeight(int numberOfChocolates) {
		return numberOfChocolates * weightOfChocolates;
	} 

}