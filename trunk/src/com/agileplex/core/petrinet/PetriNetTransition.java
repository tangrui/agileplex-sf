// Copyright 2008, AgilePlex, Inc. All Rights Reserved.
// Confidential and Proprietary Information of AgilePlex, Inc.

/**
 * Petri Net Transition
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

public interface PetriNetTransition extends NamedObject {

    Set<? extends PetriNetArc> getInputArcs();

    Set<? extends PetriNetPlace> getInputStates();

    Set<? extends PetriNetArc> getOutputArcs();

    Set<? extends PetriNetPlace> getOutputStates();

    boolean isEnabled(PetriNetContext context, Object[] tokens);

}
