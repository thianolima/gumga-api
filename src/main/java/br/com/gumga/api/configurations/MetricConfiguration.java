package br.com.gumga.api.configurations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.additions.LowercaseLettersMetric;
import br.com.gumga.api.metrics.additions.MiddleNumbersOrSymbolsMetric;
import br.com.gumga.api.metrics.additions.NumberOfCharactersMetric;
import br.com.gumga.api.metrics.additions.NumbersMetric;
import br.com.gumga.api.metrics.additions.RequirementsMetric;
import br.com.gumga.api.metrics.additions.SymbolsMetrics;
import br.com.gumga.api.metrics.additions.UppercaseLettersMetric;
import br.com.gumga.api.metrics.deductions.ConsecutiveLowercaseLettersMetric;
import br.com.gumga.api.metrics.deductions.ConsecutiveNumbersMetric;
import br.com.gumga.api.metrics.deductions.ConsecutiveUppercaseLettersMetric;
import br.com.gumga.api.metrics.deductions.LettersOnlyMetric;
import br.com.gumga.api.metrics.deductions.NumbersOnlyMetric;
import br.com.gumga.api.metrics.deductions.RepeatCharactersMetric;
import br.com.gumga.api.metrics.deductions.SequentialLettersMetric;
import br.com.gumga.api.metrics.deductions.SequentialNumbersMetric;
import br.com.gumga.api.metrics.deductions.SequentialSymbolsMetric;

@Configuration
public class MetricConfiguration {

	@Bean
    public List<Metric> metrics() {		
		ArrayList<Metric> metrics = new ArrayList<Metric>();
		
		//Additions
		metrics.add(new LowercaseLettersMetric());
		metrics.add(new MiddleNumbersOrSymbolsMetric());
		metrics.add(new NumberOfCharactersMetric());
		metrics.add(new NumbersMetric());
		metrics.add(new RequirementsMetric());
		metrics.add(new SymbolsMetrics());
		metrics.add(new UppercaseLettersMetric());

		//Deductions
		metrics.add(new ConsecutiveLowercaseLettersMetric());
		metrics.add(new ConsecutiveNumbersMetric());
		metrics.add(new ConsecutiveUppercaseLettersMetric());
		metrics.add(new LettersOnlyMetric());
		metrics.add(new NumbersOnlyMetric());
		metrics.add(new RepeatCharactersMetric());
		metrics.add(new SequentialLettersMetric());
		metrics.add(new SequentialNumbersMetric());
		metrics.add(new SequentialSymbolsMetric());
		
		return metrics;
	}
}
