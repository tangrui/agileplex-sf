package com.agileplex.workflow;

/**
 * WorkflowManager
 *
 * @creator Rui Tang
 * @date 2008-02-17
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-03-17 21:47:14 +0800 (一, 17 三月 2008) $
 * @LastChangedRevision $LastChangedRevision: 12 $
 */
public interface WorkflowManager {

    //Workflow createWorkflow(WorkflowSchema schema, String name);

    Workflow getWorkflow(String name);

    //Workflow getWorkflowOnNullCreate(WorkflowSchema schema, String name);

    //Workflow removeWorkflow(String name);

}
