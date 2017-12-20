package br.com.gumga.api.metrics;

public interface Metric {

	public int count(String pwd);
	public int rate(int len, int n);
}
