package com.agileplex.workflow;

/**
 * WorkflowEventHandler
 *
 * @creator Rui Tang
 * @date 2008-02-17
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-02-20 15:45:37 +0800 (三, 20 二月 2008) $
 * @LastChangedRevision $LastChangedRevision: 9 $
 */
public interface WorkflowEventHandler {

    void handle(WorkflowContext context, WorkflowEventArgs args);

}
