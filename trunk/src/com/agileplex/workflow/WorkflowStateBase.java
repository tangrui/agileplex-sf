package com.agileplex.workflow;

import java.util.Set;

/**
 * Base interface for 
 * 
 * @author	Weiming Yin
 * @date	2008-5-8
 *
 * @LastChanged
 * @LastChangedBy		$LastChangedBy: yinwm $
 * @LastChangedDate 	$LastChangedDate: 2008-05-09 00:42:17 +0800 (五, 09 五月 2008) $
 * @LastChangedRevision $LastChangedRevision: 60 $
 */
public interface WorkflowStateBase {

    WorkflowSchema getSchema();

    Set<WorkflowAction> getInputActions();

    Set<WorkflowAction> getOutputActions();

    WorkflowActionChooser getActionChooser();

}
