package br.com.gumga.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gumga.api.models.PasswordMeter;
import br.com.gumga.api.services.PasswordMeterService;

@RestController
@RequestMapping("/passwordmeter")
public class PasswordMeterController {

	@Autowired
	PasswordMeterService pms;
	
	@CrossOrigin
	@PostMapping("/{pwd}")
	public PasswordMeter validate(@PathVariable String pwd){				
		PasswordMeter pm = pms.validate(pwd);
		return pm;
	}
}
