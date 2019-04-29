/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.business;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dbmas
 */
public class YCGSMemberTest {
    
    public YCGSMemberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFullName method, of class Member.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Member instance = new Member();
        String expResult = "grace Seo";
        instance.setFullName(expResult);
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFullName method, of class Member.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "grace seo";
        Member instance = new Member();
        instance.setFullName(fullName);
    }

    /**
     * Test of getEmailAddress method, of class Member.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Member instance = new Member();
        String expResult = "gseo@conestogac.on.ca";
        instance.setEmailAddress(expResult);
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmailAddress method, of class Member.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "gseo@conestogac.on.ca";
        Member instance = new Member();
        instance.setEmailAddress(emailAddress);
    }
    /**
     * Test of getPhoneNumber method, of class Member.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Member instance = new Member();
        String expResult = "222-222-1234";
        instance.setPhoneNumber(expResult);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber method, of class Member.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "222-222-1234";
        Member instance = new Member();
        instance.setPhoneNumber(phoneNumber);
    }

    /**
     * Test of getProgramName method, of class Member.
     */
    @Test
    public void testGetProgramName() {
        System.out.println("getProgramName");
        Member instance = new Member();
        String expResult = "CPA";
        instance.setProgramName(expResult);
        String result = instance.getProgramName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProgramName method, of class Member.
     */
    @Test
    public void testSetProgramName() {
        System.out.println("setProgramName");
        String programName = "CPA";
        Member instance = new Member();
        instance.setProgramName(programName);
    }

    /**
     * Test of getYearLevel method, of class Member.
     */
    @Test
    public void testGetYearLevel() {
        System.out.println("getYearLevel");
        Member instance = new Member();
        int expResult = 1;
        instance.setYearLevel(expResult);
        int result = instance.getYearLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYearLevel method, of class Member.
     */
    @Test
    public void testSetYearLevel() {
        System.out.println("setYearLevel");
        int yearLevel = 1;
        Member instance = new Member();
        instance.setYearLevel(yearLevel);
    }

    /**
     * Test of isValid method, of class Member.
     */
    @Test
        public void testValidPositive(){
         System.out.println("is Valid");
        Member instance = new Member("grace","gseo@gmail.com");
        boolean expResult = true;
        boolean result = instance.isValid();
        assertEquals(expResult, result);    
        }
       
        @Test
        public void testValidNegative(){
         System.out.println("is Invalid");
        Member instance = new Member("","");
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);    
        }
}
