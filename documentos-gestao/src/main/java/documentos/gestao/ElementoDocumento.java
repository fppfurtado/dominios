package documentos.gestao;

import java.util.Map;

/**
 * <p>A classe representa um elemento genérico que compõe um documento estruturado.</p>
 * <p>Cada elemento do documento pode possuir subelementos, que também podem
 * ter subelementos, formando um estrutura de dados em forma de árvore.</p>
 * 
 * @author Fernando Pedro Pena Furtado
 * @version 1.0
 * @see Documento
 * 
 */
public class ElementoDocumento {

    /**
     * Nome ou identificação do elemento
     */
    private String nome;
    /**
     * Conteúdo do elemento
     */
    private String conteudo;
    /**
     * Conjunto de subelementos do elemento atual, identificados por nome único.
     * Um elemento pode ter ou não elementos-filhos.
     */
    private Map<String, ElementoDocumento> elementosFilhos;

    /**
     * Método construtor da classe. Para criar um elemento é obrigatório informar
     * o nome do elemento.
     * @param nome
     */
    public ElementoDocumento(String nome) {
        this.nome = nome;
    }

    /**
     * Método construtor da classe. Para criar um elemento é obrigatório informar
     * o nome e o conteúdo do elemento.
     * @param nome
     * @param conteudo
     */
    public ElementoDocumento(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    /**
     * Método construtor da classe. Para criar um elemento é obrigatório informar
     * o nome, o conteúdo e os filhos do elemento.
     * @param nome
     * @param conteudo
     * @param elementosFilhos
     */
    public ElementoDocumento(String nome, String conteudo, Map<String, ElementoDocumento> elementosFilhos) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.elementosFilhos = elementosFilhos;
    }

    /**
     * Retorna o nome do elemento
     * @return o nome do elemento
     */
    public String getNome(){
        return this.nome;
    }

    /**
     * Retorna o conteúdo do elemento
     * @return o conteúdo do elemento
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Define o conteúdo do elemento
     * @param conteudo
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * Retorna o conjunto de subelementos do elemento atual
     * @return o conjunto de subelementos ou null caso a colação não possua objetos
     */
    public Map<String, ElementoDocumento> getElementosFilhos() {
        return elementosFilhos;
    }

    /**
     * Verifica se dois elementos são iguais pelo nome
     */
    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == ElementoDocumento.class) {
            ElementoDocumento elemento = (ElementoDocumento) obj;
            if(elemento.getNome().equals(this.nome))
                return true;
        }
        return false;
    }

}