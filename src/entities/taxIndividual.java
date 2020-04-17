package entities;

public class taxIndividual extends taxPayer {
	
	private Double healthExpenditures;
	
	public taxIndividual() {
		super();
	}

	public taxIndividual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double taxValue() {
		int tax = 0;
		int taxhealth = 0;
		
		if (anualIncome < 20000.0) {
			tax = 15;
		}
		else {
			tax = 25;
		}
		
		if (healthExpenditures > 0) {
			taxhealth = 50;
		}
		
		return (anualIncome * tax/100.0) - (healthExpenditures * taxhealth/100.0); 
	}
	
	public String taxesPaid() {
		return getName()
			 + ": $ "
			 + String.format("%.2f", taxValue());
	}	
}
