package documentos.gestao;

import java.util.HashSet;
import java.util.Set;

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
     * Conjunto de subelementos do elemento atual
     */
    private Set<ElementoDocumento> elementos = new HashSet<>();

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
    public Set<ElementoDocumento> getElementos() {
        return elementos;
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