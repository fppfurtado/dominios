package direito.fundamentos;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;

import direito.PessoaNatural;

public class PessoaNaturalTeste {

    private static PessoaNatural pessoaNatural;

    @BeforeClass
    public static void init() {
        pessoaNatural = new PessoaNatural(
            "nome",
            LocalDate.now(),
            new PessoaNatural("pai"),
            new PessoaNatural("mae")
        );
    }
    
    @Test
    public void construtorTeste() {
       assertEquals(true, pessoaNatural instanceof PessoaNatural);
    }

    @Test
    public void nomeTeste() {
        assertEquals("nome", pessoaNatural.getNome());
    }

    @Test
    public void dataNascimentoTeste() {
        assertEquals(LocalDate.now(), pessoaNatural.getDataNascimento());
    }

    @Test
    public void paiTeste() {
        assertEquals("pai", pessoaNatural.getPai().getNome());
    }

    @Test
    public void maeTeste() {
        assertEquals("mae", pessoaNatural.getMae().getNome());
    }

}