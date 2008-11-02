package com.agileplex.workflow;

/**
 * WorkflowEventArgs
 *
 * @creator Rui Tang
 * @date 2008-02-17
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-05-19 15:10:16 +0800 (一, 19 五月 2008) $
 * @LastChangedRevision $LastChangedRevision: 66 $
 */
public interface WorkflowEventArgs {
    
    WorkflowAction getAction();
    
    Object getAdditionalData();

}
