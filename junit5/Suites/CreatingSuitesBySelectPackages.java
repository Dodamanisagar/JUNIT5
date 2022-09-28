package com.sagar.junit5.Suites;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("sagar")
//@SelectPackages("com.sagar.junit5.A3,")   //this annotation helps to execute different test cases which are present in different packages and we can pass multiple packages within ({"",""})
@SelectPackages({"com.sagar.junit5.A3","com.sagar.junit5.A2"})
public class CreatingSuitesBySelectPackages
{
}
