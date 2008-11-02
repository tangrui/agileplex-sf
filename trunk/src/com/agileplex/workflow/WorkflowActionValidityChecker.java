package com.agileplex.workflow;

/**
 * WorkflowActionValidityChecker
 *
 * @creator Rui Tang
 * @date 2008-02-17
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: tangrui $
 * @LastChangedDate $LastChangedDate: 2008-02-18 19:39:01 +0800 (一, 18 二月 2008) $
 * @LastChangedRevision $LastChangedRevision: 2 $
 */
public interface WorkflowActionValidityChecker {

    boolean check(WorkflowContext context, WorkflowAction action);

}
