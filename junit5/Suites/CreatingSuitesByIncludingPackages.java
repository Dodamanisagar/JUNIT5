package com.sagar.junit5.Suites;

import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.sagar.junit5")
@IncludePackages("com.sagar.junit5.A3")//This will add tests from test classes in com.sagar.junit5.A3 only i.e. AppTest.
public class CreatingSuitesByIncludingPackages {
}
