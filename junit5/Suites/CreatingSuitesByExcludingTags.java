package com.sagar.junit5.Suites;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.sagar.junit5.A3")
@ExcludeTags({"DEV","PROD"})
public class CreatingSuitesByExcludingTags {
}
