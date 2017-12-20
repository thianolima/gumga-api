package br.com.gumga.api.metrics.auditions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.additions.UppercaseLettersMetric;

public class UppercaseLettersMetricTest {

	private Metric metric;
	private String pwd = "}@bBacCa!E) "; 
	
    @Before
    public void setUp() {
        metric = new UppercaseLettersMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(3, n);
    }

    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int len = pwd.length();
        int r   = metric.rate(len, n);
        
        assertEquals(18, r);
    }

}
