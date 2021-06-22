package direito;

import java.time.LocalDate;

/**
 * <q cite="(GUIMARÃES, 1999, p. 416)">
 * Preceito, regra, modelo, teor, minuta; linha de conduta. 
 * Jurídica: Prescrição legal, preceito obrigatório, cuja característica 
 * é a possibilidade de ter seu cumprimento exigido, se necessário, com o
 *  emprego da força, da coerção, o que se chama coercitividade. [...].
 * </q>
 * 
 * @author Fernando Pedro Pena Furtado
 * @serial 1.0
 * 
 */

public abstract class Norma {
   
    /**
     * Representa a espécie da norma em questão, conforme enumerado por <code>Especie</code>.
     * @see Especie
     */
    protected Especie especie;
    /**
     * Representa a epígrafe (título) da norma, conforme prescrito na Lei Complementar 095/1998.
     */
    protected Epigrafe epigrafe;
    /**
     * Representa a ementa (título) da norma, conforme prescrito na Lei Complementar 095/1998.
     */
    protected String ementa;

    /**
     * Método construtor padrão.
     */
    public Norma() {

    }

    /**
     * Método construtor. Recebe a espécie normativa, o número de identificação e a data de
     * promulgação da norma.
     * @param especie
     * @param numeroIdentificacao
     * @param dataPromulgacao
     */
    public Norma(Especie especie, Integer numeroIdentificacao, LocalDate dataPromulgacao) {

        this.especie = especie;
        this.epigrafe = new Epigrafe(
            numeroIdentificacao, 
            dataPromulgacao
        );

    }

    /**
     * Retorna a espécie normativa, de acordo com <code>Especie</code>.
     * @return a espécie normativa.
     * @see Especie
     */
    public Especie getEspecie() {
        return especie;
    }

    /**
     * Define a espécie normativa, de acordo com <code>Especie</code>.
     * @param especie 
     * @see Especie
     */
    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    /**
     * Retorna o número de identificação da norma.
     * @return o número de identificação da norma.
     */
    public Integer getNumeroIdentificacao() {
        return epigrafe.getNumeroIdentificacao();
    }

    /**
     * Define o número de identificação da norma.
     * @param numeroIdentificacao
     */
    public void setNumeroIdentificacao(Integer numeroIdentificacao) {
        epigrafe.setNumeroIdentificacao(numeroIdentificacao);
    }

    /**
     * Retorna a data de promulgação da norma.
     * @return a data de promulgação da norma.
     */
    public LocalDate getDataPromulgacao() {
        return epigrafe.getDataPromulgacao();
    }

    /**
     * Define a data de promulgação da norma.
     * @param dataPromulgacao
     */
    public void setDataPromulgacao(LocalDate dataPromulgacao) {
        epigrafe.setDataPromulgacao(dataPromulgacao);
    }

    /**
     * Retorna a ementa (resumo) da norma.
     * @return a ementa da norma.
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * Define a ementa (resumo) da norma.
     * @param ementa
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    /**
     * Retorna uma string representativa do objeto.
     */
    @Override
    public String toString() {
        return epigrafe.toString();
    }

    /**
     * Enumerção das principais espécies de normas do ordenmaneto jurídico brasileiro.
     */
    
    enum Especie {

        CONSTITUICAO("CONSTITUIÇÃO"),
        LEI_COMPLEMENTAR("LEI COMPLEMENTAR"),
        LEI_ORDINARIA("LEI ORDINÁRIA"),
        DECRETO("DECRETO"),
        PORTARIA("PORTARIA"),
        RESOLUCAO("RESOLUÇÃO"),
        INSTRUCAO_NORMATIVA("INSTRUÇÃO NORMATIVA");

        /**
         * Título ou denominação da espécie normativa.
         */
        private final String titulo;

        /**
         * Método construtor padrão. Privado.
         * @param titulo
         */
        private Especie(String titulo) {
            this.titulo = titulo;
        }

        /**
        * Retorna uma string representativa do objeto.
        */
        @Override
        public String toString() {
            return titulo;
        }

    }

    /**
     * <q cite="Lei Complementar 95/1998, Art. 4º">
     * A epígrafe, grafada em caracteres maiúsculos, propiciará identificação numérica
     *  singular à lei e será formada pelo título designativo da espécie normativa, 
     * pelo número respectivo e pelo ano de promulgação.
     * </q>
     */

    class Epigrafe {

        /**
         * Título da norma, conforme definido pela espécie normativa.
         */
        private String titulo = especie.toString();
        /**
         * Número de identificação da norma.
         */
        private Integer numeroIdentificacao;
        /**
         * Data da promulgação da norma.
         */
        private LocalDate dataPromulgacao;

        /**
         * Método construtor padrão.
         */
        public Epigrafe() {

        }

        /**
         * Método construtor. Recebe o número de identificação e a data da promulgação da norma.
         * @param titulo
         * @param numeroIdentificacao
         * @param dataPromulgacao
         */
        public Epigrafe(Integer numeroIdentificacao, LocalDate dataPromulgacao) {
            this.numeroIdentificacao = numeroIdentificacao;
            this.dataPromulgacao = dataPromulgacao;
        }

        /**
         * Retorna o título da norma.
         * @return o título da norma.
         */
        public String getTitulo() {
            return titulo;
        }

        /**
         * Retorna o número de identificação da norma.
         * @return o número de identificação da norma.
         */
        public Integer getNumeroIdentificacao() {
            return numeroIdentificacao;
        }

        /**
         * Define o número de identificação da norma.
         * @param numeroIdentificacao
         */
        public void setNumeroIdentificacao(Integer numeroIdentificacao) {
            this.numeroIdentificacao = numeroIdentificacao;
        }

        /**
         * Retorna a data de promulgação da norma.
         * @return a data de promulgação da norma.
         */
        public LocalDate getDataPromulgacao() {
            return dataPromulgacao;
        }

        /**
         * Define a data de promulgação da norma.
         * @param dataPromulgacao
         */
        public void setDataPromulgacao(LocalDate dataPromulgacao) {
            this.dataPromulgacao = dataPromulgacao;
        }

        /**
         * Retorna uma string representativa do objeto.
        */
        @Override
        public String toString() {
            return titulo + " " + numeroIdentificacao + "/" + dataPromulgacao.getYear();
        }

    }

}