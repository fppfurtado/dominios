package documentos;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import documentos.gestao.Documento;
import documentos.gestao.ElementoDocumento;

public class DocumentoTeste {

    private static Documento documento;

    @BeforeClass
    public static void init() {
        documento = new Documento(LocalDate.now(), new HashSet<>());
    }

    @Test
    public void construtorPadraoTeste() {

        Documento documento = new Documento();

        assertEquals(true, documento instanceof Documento);

    }

    @Test
    public void construtorTeste() {

        Documento documento = new Documento(LocalDate.now(), new HashSet<String>());

        assertEquals(true, documento instanceof Documento);

    }

    @Test
    public void getDataCriacaoTeste() {
        assertEquals(LocalDate.now(), documento.getDataCriacao());
    }

    @Test
    public void getAutoresTeste() {
        assertEquals(true, documento.getAutores() instanceof HashSet);
    }

    @Test
    public void getElementoRaizTeste() {
        assertEquals(true, documento.getElementoRaiz() instanceof ElementoDocumento);
    }
    
}
