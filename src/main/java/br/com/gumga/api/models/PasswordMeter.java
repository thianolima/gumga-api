package br.com.gumga.api.models;

import br.com.gumga.api.enums.Complexity;

public class PasswordMeter {

	private int score;
	private Complexity complexity;
	
	public PasswordMeter(int score, Complexity complexity){
		this.score = score;
		this.complexity = complexity;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public Complexity getComplexity() {
		return complexity;
	}
	
	public void setComplexity(Complexity complexity) {
		this.complexity = complexity;
	}
	
	
	
}
