package co.edu.unicauca.DesignPatterns.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julia
 */
public class ExternalServiceTest {
    
    public ExternalServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    void testGetCompanyDataReturnsJsonString() {
        ExternalService service = new ExternalService();
        String json = service.getCompanyData();

        assertTrue(json.contains("\"Name\""));
        assertTrue(json.contains("\"Description\""));
    }
    
}
