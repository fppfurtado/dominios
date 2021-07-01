package documentos.gestao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * <q cite=http://portaldeperiodicos.eci.ufmg.br/index.php/pci/article/view/2891/1788>
 * O documento pode ser definido como um objeto que suporta a informação, que 
 * serve para comunicar e que é durável (a comunicação pode, assim, ser repetida).
 * </q>
 * 
 * @author Fernando Pedro Pena Furtado
 * @version 1.0
 * @see ElementoDocumento
 * 
 */

public class Documento {
    /**
     * Data da criação do documento. Valor padrão é a data atual.
     */
    protected LocalDate dataCriacao = LocalDate.now();
    /**
     * Autor(es) do documento
     */
    protected Set<String> autores = new HashSet<>();

    /**
     * <p>Um documento estruturado é um documento composto de partes pré-estabelecidas,
     * onde a informação é disposta de modo pré-definido, de acordo com cada seção 
     * do documeto.</p>
     * <p>O atributo <code>elementoRaiz<\code> representa o conjunto de partes de um documento
     * estruturado, que será disposta em uma estrutura do tipo 'arvore n-aria'. As partes são 
     * representadas por objetos do tipo <code>ElementoDocumento</code>.
     * 
     * @see ElementoDocumento
     */
    protected ElementoDocumento elementoRaiz;

    /**
     * Método construtor padrão.
     */
    public Documento() {

    }

    /**
     * Método construtor. Recebe a data de criação e a lista dos autores do documento.
     * @param dataCriacao
     * @param autores
     */
    public Documento(LocalDate dataCriacao, Set<String> autores) {
        this.dataCriacao = dataCriacao;
        this.autores = autores;
        this.elementoRaiz = new ElementoDocumento("raiz", null);
    }

    /**
     * Retorna a data de criação do documento
     * @return a data de criação do objeto ou null caso não tenha sido inicializada
     */
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Retorna o(s) autor(es) do documento
     * @return o(s) autor(es) do documento ou null caso não a coleção não possua objetos
     */
    public Set<String> getAutores() {
        return autores;
    }

    /**
     * Retorna o elemento-raiz da árvore de elementos do Documento
     * @return o elemento-raiz da árvore de elementos do Documento
     */
    public ElementoDocumento getElementoRaiz() {
        return elementoRaiz;
    }

}