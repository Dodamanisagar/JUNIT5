package com.sagar.junit5.Suites;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.sagar.junit5")
@ExcludePackages("com.sagar.junit5.Assertion")
public class CreatingSuitesByExcludingPackages {
}
