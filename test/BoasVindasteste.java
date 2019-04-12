import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import boasvindas.BoasVindas;
import boasvindas.Wellcome;


public class BoasVindasteste {
    
    @Test
    public void testaBoasVindas(){
        
        BoasVindas bv = new BoasVindas();
        assertEquals("Seja Bem-Vindo Tiago",bv.boasvindas("Tiago"));
        
    }
    @Test
    public void testaBoasVindasEmIngles(){
        
        Wellcome w = new Wellcome();
        assertEquals("Wellcome Tiago",w.wellcome("Tiago"));
        
    }       
}
