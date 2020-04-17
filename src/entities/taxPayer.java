package entities;

public abstract class taxPayer {
	
	private String name;
	protected Double anualIncome;
	
	public taxPayer() {
	}

	public taxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double taxValue();
	
	public String taxesPaid() {
		return name
			 + ": $ "
			 + String.format("%.2f", anualIncome);
	}
}
