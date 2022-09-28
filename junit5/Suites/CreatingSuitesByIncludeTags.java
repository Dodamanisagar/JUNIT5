package com.sagar.junit5.Suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.sagar.junit5.A3")
//@IncludeTags("DEV")
@IncludeTags({"DEV","PROD"})
public class CreatingSuitesByIncludeTags {
}
