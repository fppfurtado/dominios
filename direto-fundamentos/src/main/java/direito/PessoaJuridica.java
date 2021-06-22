package direito;

import java.util.Set;

/**
 * <q cite="https://aba.jusbrasil.com.br/noticias/176597777/conceito-e-classificacao-das-pessoas-juridicas">
 * Em síntese, pessoa jurídica consiste num conjunto de pessoas ou bens, dotado 
 * de personalidade jurídica própria e constituído na forma da lei. São três os 
 * requisitos para a existência da pessoa jurídica: organização de pessoas ou bens, 
 * liceidade de propósitos ou fins e capacidade jurídica reconhecida por norma.
 * </q>
 * 
 * @author Fernando Pedro Pena Furtado
 * @version 1.0
 * @see IOrganizacao, PessoaNatural
 * 
 */
public abstract class PessoaJuridica implements IOrganizacao {

    /**
     * Representa o conjunto de indivíduos que compõem a organização.
     */
    private Set<PessoaNatural> individuos;

    /**
     * Retorna o conjunto de indivíduos que compõem a organização.
     * @return o conjunto de indivíduos que compõem a organização.
     */
    @Override
    public Set<PessoaNatural> getIndividuos() {
        return this.individuos;
    }
    
}