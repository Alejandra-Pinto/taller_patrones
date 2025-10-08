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
public class CompanyTest {
    
    public CompanyTest() {
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
    void testConstructorAndGetters() {
        Company company = new Company("Empaques del Cauca", "Empresa de empaques biodegradables");

        assertEquals("Empaques del Cauca", company.getName());
        assertEquals("Empresa de empaques biodegradables", company.getDescription());
    }

    @Test
    void testSetters() {
        Company company = new Company("", "");
        company.setName("TecnoAndes");
        company.setDescription("Empresa desarrolladora de software industrial");

        assertEquals("TecnoAndes", company.getName());
        assertEquals("Empresa desarrolladora de software industrial", company.getDescription());
    }

    @Test
    void testToStringFormat() {
        Company company = new Company("Microsoft", "Compañía tecnológica global");
        String expected = "Empresa: Microsoft\nDescripcion: Compañía tecnológica global";
        assertEquals(expected, company.toString());
    }
    
}
