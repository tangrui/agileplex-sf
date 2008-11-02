package com.agileplex.workflow;

/**
 * WorkflowData
 *
 * @creator Rui Tang
 * @date 2008-02-17
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-04-21 22:50:32 +0800 (一, 21 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 44 $
 */
public interface WorkflowData {

    Object getUserData();

    Metadata getMetadata();
    
    interface Metadata {
        
        WorkflowState getState();

        Workflow getWorkflow();
        
    }

}
