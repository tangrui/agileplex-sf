package com.agileplex.workflow;

import java.util.List;

/**
 * WorkflowAction
 *
 * @author Rui Tang
 * @author Weiming Yin
 * @date 2008-02-17
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-05-16 01:07:59 +0800 (五, 16 五月 2008) $
 * @LastChangedRevision $LastChangedRevision: 62 $
 */
public interface WorkflowAction extends NamedObject {

    WorkflowSchema getSchema();
    
    /**
     * Get from StateGroup
     * @return {@link WorkflowStateGroup}
     */
    WorkflowStateGroup getFromGroup();

    /**
     * When the action is focus on from state, this method will return from state.
     * If the action is focus on from state group, this method will return 
     * the real from state in every event handler.
     * 
     * @return Current action from state
     */
    WorkflowState getFromState();
    
    /**
     * This method will return the real to state in every event handler
     * 
     * @return Current action to state
     */
    WorkflowState getToState();
    
    void setActionValidityChecker(WorkflowActionValidityChecker checker);

    WorkflowActionValidityChecker getActionValidityChecker();

    void addBeforeActionHandler(WorkflowEventHandler handler);

    void removeBeforeActionHandler(WorkflowEventHandler handler);

    List<WorkflowEventHandler> getBeforeActionHandlers();

    void setOnActionHandler(WorkflowEventHandler handler);

    WorkflowEventHandler getOnActionHandler();

    void addAfterActionHandler(WorkflowEventHandler handler);

    void removeAfterActionHandler(WorkflowEventHandler handler);

    List<WorkflowEventHandler> getAfterActionHandlers();

}
