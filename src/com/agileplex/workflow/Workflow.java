package com.agileplex.workflow;

/**
 * Workflow
 *
 * @creator Rui Tang
 * @date 2008-02-16
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-04-21 22:50:32 +0800 (一, 21 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 44 $
 */
public interface Workflow extends NamedObject {

    WorkflowSchema getSchema();

    WorkflowManager getManager();

    WorkflowContext bindData(Object data, String state);
    
    WorkflowContext bindData(Object data, WorkflowState state);
    
    void doAction(WorkflowContext context);

    void doAction(WorkflowContext context, WorkflowAction action);
    
    void doAction(WorkflowContext context, Object additionalData);

    void doAction(WorkflowContext context, WorkflowAction action, Object additionalData);
    
    void doAction(WorkflowContext context, WorkflowSession session);

    void doAction(WorkflowContext context, WorkflowAction action, WorkflowSession session);
    
    void doAction(WorkflowContext context, Object additionalData, WorkflowSession session);

    void doAction(WorkflowContext context, WorkflowAction action, Object additionalData, WorkflowSession session);

}
