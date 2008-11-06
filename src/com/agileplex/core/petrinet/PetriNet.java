// Copyright 2008, AgilePlex, Inc. All Rights Reserved.
// Confidential and Proprietary Information of AgilePlex, Inc.

/**
 * Petri Net
 *
 * @creator Rui Tang
 * @date 2008-11-05
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: tangrui $
 * @LastChangedDate $LastChangedDate: 2008-07-02 09:34:31 +0800 (三, 02 七月 2008) $
 * @LastChangedRevision $LastChangedRevision: 21 $
 */
package com.agileplex.core.petrinet;

import com.agileplex.core.common.NamedObject;

public interface PetriNet extends NamedObject {

    PetriNetSchema getSchema();

    PetriNetContext createContext();

    void mark(PetriNetContext context, PetriNetPlace place, Object token);
    
    void transit(PetriNetContext context);

}
