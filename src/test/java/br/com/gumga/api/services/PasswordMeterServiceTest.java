package br.com.gumga.api.services;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.gumga.api.enums.Complexity;
import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.models.PasswordMeter;

public class PasswordMeterServiceTest {
	private String pwd = "Py5fcvmo@2017"; 	
	private PasswordMeterService pms;

	@Autowired
	List<Metric> metrics;
	
    @Before
    public void setUp() {
    	pms = new PasswordMeterService();
    }
    
    @Test
    public void complexity(){
    	PasswordMeter pm = pms.validate(pwd);        
        assertEquals(Complexity.VERY_STRONG, pm.getComplexity());
    }
    
    @Test
    public void score(){
    	PasswordMeter pm = pms.validate(pwd);        
        assertEquals(100, pm.getScore());
    }
}


