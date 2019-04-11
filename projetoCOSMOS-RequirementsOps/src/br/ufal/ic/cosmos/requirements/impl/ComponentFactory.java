package br.ufal.ic.cosmos.requirements.impl;

import br.ufal.ic.cosmos.requirements.spec.prov.IManager;

public class ComponentFactory {
	private static IManager manager = null;
	
	private ComponentFactory() {
	}
	
	public static IManager createInstance(){
		if(manager == null)
			manager = new Manager();
		return manager;
	}
}
