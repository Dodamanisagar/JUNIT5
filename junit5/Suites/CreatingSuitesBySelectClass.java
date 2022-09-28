package com.sagar.junit5.Suites;

import com.sagar.junit5.A2.Junit;
import com.sagar.junit5.A3.AppTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("sagar")
//@SelectClasses(AppTest.class)   //this annotation helps to execute different test cases which are present in different classes and we can pass multiple classes within ({"",""})
@SelectClasses(  {Junit.class,AppTest.class} )
public class CreatingSuitesBySelectClass {
}
