package com.agileplex.workflow;

import java.util.Set;

/**
 * WorkflowStateGroup
 * A group for holding states 
 * 
 * @author	Weiming Yin
 * @date	2008-5-8
 *
 * @LastChanged
 * @LastChangedBy		$LastChangedBy: yinwm $
 * @LastChangedDate 	$LastChangedDate: 2008-05-09 00:42:17 +0800 (五, 09 五月 2008) $
 * @LastChangedRevision $LastChangedRevision: 60 $
 */
public interface WorkflowStateGroup extends WorkflowStateBase {
    
    static final String ALL_STATE_GROUP = "all";
    
    int size();
    
    Set<WorkflowState> getStates();
    
    void addState(WorkflowState state);
    
    void addState(String stateName);
}
