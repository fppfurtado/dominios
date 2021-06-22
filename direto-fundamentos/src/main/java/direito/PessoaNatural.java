package direito;

import java.time.LocalDate;

/**
 * <q cite="https://direito.legal/direito-privado/resumo-de-pessoa-natural-e-pessoa-juridica/">
 * Para o ramo do Direito Civil, pessoa natural é o próprio ser humano dotado 
 * de capacidade. É o sujeito provido de direitos e obrigações a partir de seu 
 * nascimento com vida, de acordo com o artigo 2º do Código Civil. Todo ser 
 * humano, dessa forma, recebe a denominação de pessoa natural para ser intitulado 
 * como sujeito de direito. Importante destacar que o termo “pessoa natural” pode 
 * ser substituído pelo termo “pessoa física”.
 * </q>
 * 
 * @author Fernando Pedro Pena Furtado
 * @version 1.0
 * @see PessoaJuridica
 * 
 */

public class PessoaNatural {

    /**
     * Representa o nome completo da pessoa natural.
     */
    private String nome;
    /**
     * Representa a data de nascimento da pessoa natural.
     */
    private LocalDate dataNascimento;
    /**
     * Representa o pai da pessoa natural, também uma pessoa natural.
     */
    private PessoaNatural pai;
    /**
     * Representa a mãe da pessoa natural, também uma pessoa natural.
     */
    private PessoaNatural mae;

    /**
     * Método construtor. Recebe o nome da pessoa natural.
     * @param nome
     */
    public PessoaNatural(String nome) {
        this.nome = nome;
    }

    /**
     * Método construtor. Recebe o nome da pessoa natural.
     * @param nome
     * @param dataNascimento
     * @param pai
     * @param mae
     */
    public PessoaNatural(String nome, LocalDate dataNascimento, PessoaNatural pai, PessoaNatural mae) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.pai = pai;
        this.mae = mae;
    }

    /**
     * Retorna o nome da pessoa natural.
     * @return o nome completo da pessoa natural.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa natural.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a data de nascimento da pessoa natural.
     * @return a data de nascimento da pessoa natural.
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define a data de nascimento da pessoa natural.
     * @param dataNascimento
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Retorna uma referência ao pai da pessoa natural.
     * @return uma referência ao pai da pessoa natural.
     */
    public PessoaNatural getPai() {
        return pai;
    }

    /**
     * Define uma referência de pai para a pessoa natural.
     * @param pai
     */
    public void setPai(PessoaNatural pai) {
        this.pai = pai;
    }

    /**
     * Retorna uma referência à mãe da pessoa natural.
     * @return uma referência à mãe da pessoa natural.
     */
    public PessoaNatural getMae() {
        return mae;
    }

    /**
     * Define uma referência de mãe para a pessoa natural.
     * @param mae
     */
    public void setMae(PessoaNatural mae) {
        this.mae = mae;
    }

}