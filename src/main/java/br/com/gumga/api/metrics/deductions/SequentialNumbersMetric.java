package br.com.gumga.api.metrics.deductions;

import br.com.gumga.api.metrics.Metric;

public class SequentialNumbersMetric implements Metric {

	private static final String NUMBERS = "01234567890";

    @Override
    public int count(String pwd) {
        int count = 0;
        for (int idx = 0; idx < (NUMBERS.length() - 3); idx++) {
            String fwd = NUMBERS.substring(idx, idx + 3);
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
