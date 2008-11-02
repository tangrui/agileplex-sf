package com.agileplex.workflow;

import java.util.Set;

/**
 * WorkflowSchema
 *
 * @creator Rui Tang
 * @date 2008-02-13
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-05-09 00:42:17 +0800 (五, 09 五月 2008) $
 * @LastChangedRevision $LastChangedRevision: 60 $
 */
public interface WorkflowSchema extends NamedObject {
    
    final static String TYPE_START = "start";
    final static String TYPE_FINISH = "finish";
    final static String TYPE_NORMAL = "normal";
    
    final static String HANDLER_TYPE_BEFORE_ACTION = "beforeActionHandler";
    final static String HANDLER_TYPE_ON_ACTION = "onActionHandler";
    final static String HANDLER_TYPE_AFTER_ACTION = "afterActionHandler";

    WorkflowState getStartState();

    Set<? extends WorkflowState> getFinishStates();

    WorkflowState getState(String name);

    WorkflowAction getAction(String name);
    
    WorkflowStateGroup getStateGroup(String name);
    
    WorkflowStateGroup createStateGroup(String name);

}
