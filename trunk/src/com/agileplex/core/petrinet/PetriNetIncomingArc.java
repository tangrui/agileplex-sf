package com.agileplex.core.petrinet;

public interface PetriNetIncomingArc extends PetriNetArc {

	Object produce(PetriNetBindingResult bindingResult);
	
}
