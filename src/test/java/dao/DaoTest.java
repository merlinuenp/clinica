package dao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import modelo.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author User
 */
public class DaoTest {
    
    public DaoTest() {
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
    public void testInserirUsuario() {
        Dao<Usuario> dao = new Dao(Usuario.class);
        Usuario u = new Usuario("Astolfo", "Rua das Antas, 1 - Bandeirantes-PR", 
                "(43) 9988-7755", 
                new GregorianCalendar(2004, Calendar.FEBRUARY, 11).getTime(), 
                "astolfo", "123"); 
        dao.inserir(u);     
    }
    
    
    @Test
    public void testListarUsuarios(){
        Dao<Usuario> dao = new Dao(Usuario.class);
        List<Usuario> lista = dao.listarTodos(); 
        for(Usuario u : lista){
            System.out.println(u);
        }
    }
}
