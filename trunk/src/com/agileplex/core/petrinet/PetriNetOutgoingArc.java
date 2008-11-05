package com.agileplex.core.petrinet;

public interface PetriNetOutgoingArc extends PetriNetArc {

	PetriNetBindingResult bind(Object token);

    PetriNetBindingResult bind(PetriNetBindingResult bindingResult, Object token);

    PetriNetBindingResult consume(Object token);
    
    PetriNetBindingResult consume(PetriNetBindingResult bindingResult, Object token);
    
}
