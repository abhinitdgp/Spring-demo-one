package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private String email;
	private String teamName;
	public CricketCoach() {
		System.out.println("Inside cricket coach constructor");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}
	
	
	public String getEmail() {
		return email;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setEmail(String email) {
		System.out.println("Inside setter method of email");
		this.email = email;
	}


	public void setTeamName(String teamName) {
		System.out.println("Inside setter method of team");
		this.teamName = teamName;
	}


	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice is very important";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


}
