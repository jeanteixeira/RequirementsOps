package br.ufal.ic.cosmos.requirements.impl;

import br.ufal.ic.cosmos.requirements.spec.dt.RequirementsDT;
import br.ufal.ic.cosmos.requirements.spec.prov.ICRUDRequirementsOps;
import br.ufal.ic.cosmos.requirements.spec.prov.IManager;
import br.ufal.ic.cosmos.requirements.spec.req.IRequirementsBusinessReq;

class FacadeRequirementsOps implements ICRUDRequirementsOps {
	private IManager manager;
	private IRequirementsBusinessReq varReq;
	
	public FacadeRequirementsOps(IManager manager) {
		this.manager = manager;
	}

	@Override
	public RequirementsDT adicionarRequisito(RequirementsDT requirement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequirementsDT alterarRequisito(int id, RequirementsDT requirement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluirRequisito(int id) {
		// TODO Auto-generated method stub
		
	}
}
