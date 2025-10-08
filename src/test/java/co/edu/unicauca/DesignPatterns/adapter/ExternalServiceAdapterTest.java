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
public class ExternalServiceAdapterTest {
    
    public ExternalServiceAdapterTest() {
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
    void testAdapterConvertsJsonToCompanyCorrectly() {
        ExternalService service = new ExternalService();
        ExternalServiceAdapter adapter = new ExternalServiceAdapter(service);

        Company company = adapter.getCompany();

        assertNotNull(company);
        assertEquals("Microsoft Corporation", company.getName());
        assertTrue(company.getDescription().contains("tecnológica multinacional"));
    }

    @Test
    void testAdapterHandlesJsonFields() {
        ExternalService service = new ExternalService();
        ExternalServiceAdapter adapter = new ExternalServiceAdapter(service);

        Company company = adapter.getCompany();
        assertAll("company",
            () -> assertNotNull(company.getName()),
            () -> assertNotNull(company.getDescription())
        );
    }
    
}
