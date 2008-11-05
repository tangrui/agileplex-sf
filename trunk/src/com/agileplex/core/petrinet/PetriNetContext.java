// Copyright 2008, AgilePlex, Inc. All Rights Reserved.
// Confidential and Proprietary Information of AgilePlex, Inc.

/**
 * Petri Net Context
 *
 * @creator Rui Tang
 * @date 2008-11-06
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: tangrui $
 * @LastChangedDate $LastChangedDate: 2008-07-02 09:34:31 +0800 (三, 02 七月 2008) $
 * @LastChangedRevision $LastChangedRevision: 21 $
 */
package com.agileplex.core.petrinet;

import java.util.Set;

public interface PetriNetContext {

    PetriNet getPetriNet();

    void addToken(PetriNetPlace place, Object token);
    
    Object removeToken(PetriNetPlace place, Object token);

    Set<Object> getTokens(PetriNetPlace place);

    PetriNetPlace getPlace(Object token);

}
