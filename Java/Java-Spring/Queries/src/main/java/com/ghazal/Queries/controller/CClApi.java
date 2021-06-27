package com.ghazal.Queries.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghazal.Queries.CCLService.CCLService;
import com.ghazal.Queries.models.Country;

@RestController
public class CClApi {
	private final CCLService CS;
	public CClApi(CCLService CS) {
		this.CS=CS;
	}
@RequestMapping("/test")
public List<Country> test() {
	return CS.joinCountriesAndLanguagesWhereLanguage();
}
@RequestMapping("/countcountries")
public List<Object[]> test2(){
	return CS.countcountries();
}
@RequestMapping("/mexicopop")
public List<Object[]> test3(){
	return CS.mexicopop();
}
@RequestMapping("/precentage")
public List<Object[]> test4(){
	return CS.precentage();
}

@RequestMapping("/surface")
public List<Object[]> test5(){
	return CS.surface();
}

@RequestMapping("/lifecapital")
public List<Object[]> test6(){
	return CS.lifecapital();
}
@RequestMapping("/pop")
public List<Object[]> test7(){
	return CS.pop();
}
@RequestMapping("/region")
public List<Object[]> test8(){
	return CS.region();
}
}