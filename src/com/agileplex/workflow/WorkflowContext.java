package com.agileplex.workflow;

/**
 * WorkflowContext
 *
 * @creator Rui Tang
 * @date 2008-02-17
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-04-20 17:58:33 +0800 (日, 20 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 36 $
 */
public interface WorkflowContext {

    Workflow getWorkflow();

    WorkflowData getWorkflowData();

    WorkflowSession getSession();
    
}
