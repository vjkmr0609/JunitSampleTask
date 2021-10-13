package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


//@RunWith(Suite.class)
//@Suite.SuiteClasses({JunitSamp.class,Amazon.class})
public class RunClass {
	public static void main(String[] args) {
		 
		Result print = JUnitCore.runClasses(JunitSamp.class,Amazon.class);
		
		 List<Failure> failures = print.getFailures();
		 for (Failure x : failures) {
			 System.out.println(x);
			
		}
		System.out.println("To print Faliure count: "+print.getFailureCount());
		System.out.println("To print Ignore count: "+print.getIgnoreCount());
		System.out.println("To print Run Time: "+print.getRunTime());
		System.out.println("To print Run Count: "+print.getRunCount());
	}
	

}
