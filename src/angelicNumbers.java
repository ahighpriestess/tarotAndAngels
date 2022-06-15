
public class angelicNumbers implements angelMessages {
	
	private int angelNumbers;
	private String angelMeaning;
	
	
	angelicNumbers () {
		
	}
	
	angelicNumbers(int angelNumbers, String angelMeaning) {
		
		this.angelNumbers = angelNumbers;
		this.angelMeaning = angelMeaning;
		
		
	}

	public int getAngelNumbers() {
		return angelNumbers;
	}

	public String getAngelMeaning() {
		return angelMeaning;
	}

	public void setAngelNumbers(int angelNumbers) {
		this.angelNumbers = angelNumbers;
	}

	public void setAngelMeaning(String angelMeaning) {
		this.angelMeaning = angelMeaning;
	}
	
	public String toString() {
		
		return "Name of Card: " + angelNumbers + "\n" + "Meaning: " + angelMeaning + "\n";
	
	}
	
	@Override
	public void Angel() {
		
		System.out.println("'" + angelNumbers + "' has been brought to you by Angels. ");

	}

}
