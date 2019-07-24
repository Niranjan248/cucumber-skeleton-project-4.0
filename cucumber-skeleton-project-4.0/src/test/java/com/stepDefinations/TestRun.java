package com.stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty"},
		monochrome=true,
		features = "C:\\Users\\training_d2.03.07\\Desktop\\cucumber-skeleton-project-4.0\\cucumber-skeleton-project-4.0\\src\\Login.feature"
		
		)
public class TestRun {

}
