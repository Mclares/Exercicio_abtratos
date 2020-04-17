package entities;

public class taxCompany extends taxPayer {
	
	private Integer numberEmployees;
	
	public taxCompany() {
		super();
	}

	public taxCompany(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	public Double taxValue() {
		int tax = 0;
		if (numberEmployees > 10) {
			tax = 14;
		}
		else {
			tax = 16;
		}
		
		return anualIncome * tax/100;
	}
	
	public String taxesPaid() {
		return getName()
			 + ": $ "
			 + String.format("%.2f", taxValue());
	}
}
