package br.com.gumga.api.metrics.additions;

import br.com.gumga.api.metrics.Metric;

public class NumberOfCharactersMetric implements Metric{

	@Override
	public int count(String pwd) {
		return pwd.length();
	}

	@Override
	public int rate(int len, int n) {
		return +(n*4);
	}

	
}
