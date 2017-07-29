package day34;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import day34.Junit.FindAFlight;
import day34.Junit.BaseClass;
import day34.Junit.BookAFlight;
import day34.Junit.FlightConfirmation;
import day34.Junit.Login;
import day34.Junit.SelectAFlight;



@RunWith(Suite.class)
@SuiteClasses({BaseClass.class,Login.class,FindAFlight.class,SelectAFlight.class,BookAFlight.class,FlightConfirmation.class})

public class TestRunner {

}
