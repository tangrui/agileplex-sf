package com.agileplex.workflow;

/**
 * WorkflowState
 *
 * @creator Rui Tang
 * @creator Weiming Yin
 * 
 * @date 2008-02-17
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-05-09 00:42:17 +0800 (五, 09 五月 2008) $
 * @LastChangedRevision $LastChangedRevision: 60 $
 */
public interface WorkflowState extends WorkflowStateBase, NamedObject {

    boolean isStart();

    boolean isFinish();

}
