package blackjack;

public class Card {
	private int value;
	private boolean state; // true = face up, false = face down
	
	public Card(int value, boolean state) {
		this.value = value;
		this.state = state;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean getState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
}
