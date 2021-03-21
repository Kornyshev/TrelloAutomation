package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue={"steps"},
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"})
public class TestNgRunner extends AbstractTestNGCucumberTests {
}