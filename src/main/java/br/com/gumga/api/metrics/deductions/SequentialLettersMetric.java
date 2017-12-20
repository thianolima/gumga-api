package br.com.gumga.api.metrics.deductions;

import br.com.gumga.api.metrics.Metric;

public class SequentialLettersMetric implements Metric {

	private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public int count(String pwd) {
        int count = 0;
        for (int idx = 0; idx < (LETTERS.length() - 3); idx++) {
            String fwd = LETTERS.substring(idx, idx + 3);
            String rev = new StringBuilder(fwd).reverse().toString();
            
            if ((pwd.toLowerCase().contains(fwd)) || (pwd.toLowerCase().contains(rev))){
                count++;
            }
        }
        return count;
    }

    @Override
    public int rate(int len, int n) {
        return -(n * 3);
    }	
	
}
