
public class tarotCards implements aphroditeMessages, angelMessages {


private String nameOfCard;
private int key;
private String meaning;
private String meaningReversed;

	
	tarotCards() {
	
	}

	tarotCards(String nameOfCard, int key, String meaning, String meaningReversed) {
	
		this.nameOfCard = nameOfCard;
		this.key = key;
		this.meaning = meaning;
		this.meaningReversed = meaningReversed;
	
	}
	
	public String getNameOfCard() {
		return nameOfCard;
	}
	
	public int getKey() {
		return key;
	}
	
	public String getMeaning() {
		return meaning;
	}
	
	public String getMeaningReversed() {
		return meaningReversed;
	}
	
	public void setNameOfCard(String nameOfCard) {
		this.nameOfCard = nameOfCard;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	public void setMeaningReversed(String meaningReversed) {
		this.meaningReversed = meaningReversed;
	}
	
	public String toString() {
		
		return "Name of Card: " + nameOfCard + "\n" + "Meaning: " + meaning + "\n" + "Meaning Reversed: " + meaningReversed + "\n"
				+ "Key: " + key + "\n";
	
	}
	
	
	@Override
	public void Aphrodite() {
		
		System.out.println("'" + nameOfCard + "' has been brought to you by Aphrodite.");

	}
	
	@Override
	public void Angel() {
		
		System.out.println("Aphrodite is now waiting on the angels... ");

	}

	
	


}