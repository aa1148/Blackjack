package blackjack;

public class Score {
	private int score;
	
	public Score() {
		this.score = 0;
	}
	
	public Score(int score) {
		this.score = score;
	}
	
	public int getScoreValue() {
		return score;
	}
	
	public void setScoreValue(int score) {
		this.score = score;
	}
	
	public void addOneToScore() {
		this.score++;
	}
	
	public void subtractOneToScore() {
		this.score--;
	}
}
