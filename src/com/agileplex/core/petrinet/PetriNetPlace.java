// Copyright 2008, AgilePlex, Inc. All Rights Reserved.
// Confidential and Proprietary Information of AgilePlex, Inc.

/**
 * Petri Net Place
 *
 * @creator Rui Tang
 * @date 2008-11-04
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: tangrui $
 * @LastChangedDate $LastChangedDate: 2008-07-02 09:34:31 +0800 (三, 02 七月 2008) $
 * @LastChangedRevision $LastChangedRevision: 21 $
 */
package com.agileplex.core.petrinet;

import java.util.Set;

import com.agileplex.core.common.NamedObject;

public interface PetriNetPlace extends NamedObject {

    Set<? extends PetriNetArc> getIncomingArcs();

    Set<? extends PetriNetTransition> getIncomingTransitions();

    Set<? extends PetriNetArc> getOutgoingArcs();

    Set<? extends PetriNetTransition> getOutgoingTransitions();
    
    boolean isInitial();
    
    boolean isFinal();

}
