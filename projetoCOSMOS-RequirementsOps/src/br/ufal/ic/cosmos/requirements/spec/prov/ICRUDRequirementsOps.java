package br.ufal.ic.cosmos.requirements.spec.prov;

import br.ufal.ic.cosmos.requirements.spec.dt.RequirementsDT;

public interface ICRUDRequirementsOps {
	public RequirementsDT adicionarRequisito(RequirementsDT requirement);
	public RequirementsDT alterarRequisito(int id, RequirementsDT requirement);
	public void excluirRequisito(int id);
	
}
