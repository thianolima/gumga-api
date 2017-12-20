package br.com.gumga.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gumga.api.models.PasswordMeter;
import br.com.gumga.api.services.PasswordMeterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/passwordmeter")
@Api(description="Operations for check level scecurity of password")
public class PasswordMeterController {

	@Autowired
	PasswordMeterService pms;
	
	@CrossOrigin
	@PostMapping("/{pwd}")
	@ApiOperation(value="This endpoint return the level (%), and the complexity, of security your password.")
	public PasswordMeter validate(@PathVariable String pwd){				
		PasswordMeter pm = pms.validate(pwd);
		return pm;
	}
}
