package documentos.gestao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
     * <p>O atributo <code>estrutura<\code> representa o conjunto de partes de um documento
     * estruturado. As partes são representadas por objetos do tipo <code>ElementoDocumento</code>.
     * Documentos não-estruturados são representados como tendo uma <code>estrutura</code> com
     * apenas um objeto na coleção.</p>
     * 
     * @see ElementoDocumento representa um elemento genérico que faz parte do documento
     */
    protected List<ElementoDocumento> estrutura = new ArrayList<ElementoDocumento>();

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
    }

    /**
     * Adiciona um elemento do tipo <code>ElementoDocumento</code> à estrutura do documento
     * @param nome
     * @param conteudo
     */
    public void adicionarElemento(String nome, String conteudo) {
        this.estrutura.add(new ElementoDocumento(nome, conteudo));
    }

    /**
     * Atualiza o conteúdo de um elemento da estrutura do documento pelo nome
     * @param nome
     * @param conteudoNovo
     * @return verdadeiro se operação for finalizada com sucesso
     */
    public boolean atualizarElementoPorNome(String nome, String conteudoNovo) {
        ElementoDocumento elemento = buscarElementoPorNome(nome);
        if(elemento != null) {
            elemento.setConteudo(conteudoNovo);
            return true;
        }
        return false;
    }

    /**
     * Exclui um elemento da estrutura do documento pelo nome
     * @param nome
     * @return verdadeiro se a operação for finalizada com sucesso
     */
    public boolean excluirElementoPorNome(String nome) {
        return this.estrutura.remove(buscarElementoPorNome(nome));
    }

    /**
     * Busca um elemento da estrutura do documento pelo nome
     * @param nome
     * @return elemento com o nome informado ou null se não for encontrado
     */
    public ElementoDocumento buscarElementoPorNome(String nome) {
        Iterator<ElementoDocumento> iterador = this.estrutura.iterator();
        while(iterador.hasNext()) {
            ElementoDocumento elemento = iterador.next();
            if(elemento.getNome() == nome)
                return elemento;
        }
        return null;
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
     * Retorna o conjunto de elementos do documento
     * @return o conjunto de elementos do documento ou null caso a coleção não possua objetos
     */
    public List<ElementoDocumento> getEstrutura() {
        return estrutura;
    }

}