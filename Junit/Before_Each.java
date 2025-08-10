package Jagadeesh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Before_Each {

	 @Test
	    void greet() {
	        System.out.println("Ramesh");
	    }

	 @Test
	    void greet1() {
	        System.out.println("Suresh");
	    }

	    @Test
	    void greet2() {
	        System.out.println("Raju");
	    }
	    
	    @BeforeEach
	    void greetBeforeAll() {
	        System.out.println("Hello");
	    }
}
