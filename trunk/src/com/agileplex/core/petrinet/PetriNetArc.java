// Copyright 2008, AgilePlex, Inc. All Rights Reserved.
// Confidential and Proprietary Information of AgilePlex, Inc.

/**
 * Petri Net Arc
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

import com.agileplex.core.common.NamedObject;

public interface PetriNetArc extends NamedObject {
    
    PetriNetBindingResult bind(Object token);

    PetriNetBindingResult bind(PetriNetBindingResult bindingResult, Object token);

    PetriNetBindingResult consume(Object token);

    PetriNetBindingResult consume(PetriNetBindingResult bindingResult, Object token);

    Object produce(PetriNetBindingResult bindingResult);

}
