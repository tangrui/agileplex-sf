package com.agileplex.workflow;

/**
 * WorkflowConfiguration
 *
 * @creator Rui Tang
 * @date 2008-02-26
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-04-20 01:54:35 +0800 (日, 20 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 32 $
 */
public interface WorkflowConfiguration {

    WorkflowManager getWorkflowManager();
    
    WorkflowSessionFactory getSessionFactory();
    
    IdGenerator getIdGenerator();

}
