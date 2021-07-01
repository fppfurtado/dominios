package documentos.gestao;

import java.time.LocalDate;

import direito.IOrganizacao;

/**
 * <q cite="https://www.senacrs.com.br/cursos_rede/operacoes_logisticas_procedimentos_de_conferencia_de_equipamentos_materiais_e_produtos/html/conteudo/4/index.html">
 * É um documento emitido para comprovar 
 * a entrega e/ou o recebimento de determinado documento.
 * </q>
 * 
 * @author Fernando Pedro Pena Furtado
 * @version 1.0
 * @see Documento
 * 
 */

public class Protocolo extends Documento {
    /**
     * Representa a organização expedidora do Protocolo.
     * Pode ser uma referência a uma organização complexa e com personalidade jurídica,
     * ou uma unidade administrativa de uma organização.
     */
    private IOrganizacao origem;
    
    /**
     * Método construtor. Recebe a organização expedidora e o número do protocolo.
     * @param origem organização expedidora do protocolo
     * @param numero número de identificação do protocolo
     */
    public Protocolo(IOrganizacao origem, Integer numero) {
        super();
        this.origem = origem;
        this.elementoRaiz.getElementosFilhos().put("numero", new ElementoDocumento("numero"));
    }

    /**
     * Método construtor. Recebe a organização expedidora, o número e a data
     * do protocolo.
     * @param origem organização expedidora do protocolo
     * @param numero número de identificação do protocolo
     * @param data data de criação/registro do protocolo
     */
    public Protocolo(IOrganizacao origem, Integer numero, LocalDate data) {
        this(origem, numero);
        this.dataCriacao = data;
    }

    /**
     * Retorna a organização expedidora do protocolo.
     * @return a organização expedidora do protocolo
     */
    public IOrganizacao getOrigem() {
        return origem;
    }

    /**
     * Retorna o número de identificação do protocolo.
     * @return o número de identificação do protocolo
     */
    public String getNumero() {
        return elementoRaiz.getConteudo();
    }

    /**
     * Retorna uma string representativa do objeto.
     */
    @Override
    public String toString() {
        return "PROTOCOLO " + this.origem + " " + getNumero() + "/" + dataCriacao.getYear();
    }

}