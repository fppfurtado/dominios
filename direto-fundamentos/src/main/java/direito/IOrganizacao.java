package direito;

import java.util.Set;

/**
 * <q cite="https://gestaodesegurancaprivada.com.br/organizacoes-conceitos-tipos/#Definicao-organizacao">
 * Organização é uma associação ou agrupamento de pessoas, 
 * recursos materiais e financeiros, que combinam esforços 
 * individuais e em equipe com a finalidade de realizar propósitos coletivos.
 * </q>
 */
public interface IOrganizacao {
    public Set<PessoaNatural> getIndividuos();
}
