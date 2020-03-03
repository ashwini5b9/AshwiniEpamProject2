package epamcom.newyeargift;

public class SweetsAndDryfruits extends Desserts {
	void setWeight(double weight) {
		this.weight = weight;
	}
	double calculateWeight (int numberOfSweets) {
		return numberOfSweets * weight;
	} 

}