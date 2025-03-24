package application;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * <p> Unit tests for the {@link User} class from group 30 Monday project phase 2 </p>
 * 
 * <p> This test class tests that the User class correctly initializes
 * and manages user data including username, password, and role. </p>
 * 
 * @author Matthew Lidstone
 * 
 * @version 1.0
 * 
 */

public class HW3test {

    /**
     * Tests that the {@link User} class constructor correctly initializes
     */
	
	@Test
	public void testConstructor() {
        User user = new User("matt", "password123", "admin");
        assertEquals("matt", user.getUserName());
        assertEquals("password123", user.getPassword());
        assertEquals("admin", user.getRole());
	}
	
    /**
     * Tests that the <code> roleChange </code> method in the {@link User} class correctly changes the role of the user
     */
	
	@Test
	public void testRoleChange() {
		User user = new User("matt", "password123", "admin");
		user.setRole("student");
		assertEquals("student", user.getRole());
	}
	
    /**
     * Tests that the <code> getUserName </code> method in the {@link User} class retrieves the correct username when called
     */
	
	@Test
	public void testGetUserName() {
		User user = new User("matt", "password123", "admin");
				assertEquals("matt", user.getUserName());
	}
	
    /**
     * Tests that the <code> getPassword </code> method in the {@link User} class retrieves the correct password when called
     */
	
	@Test
	public void testGetPassword() {
		User user = new User("matt", "password123", "admin");
		assertEquals("password123", user.getPassword());
	}
	
    /**
     * Tests that the <code> getRole </code> method in the {@link User} class retrieves the correct role when called
     */
	
	@Test
	public void testGetRole() {
		User user = new User("matt", "password123", "admin");
		assertEquals("admin", user.getRole());
	}

}
