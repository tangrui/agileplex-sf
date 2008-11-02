package com.agileplex.workflow;

/**
 * Invalid Workflow Schema will cause this exception.
 * 
 * @author	Weiming Yin
 * @date	2008-4-20
 *
 * @LastChanged
 * @LastChangedBy		$LastChangedBy: yinwm $
 * @LastChangedDate 	$LastChangedDate: 2008-04-20 01:54:35 +0800 (日, 20 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 32 $
 */
public class InvalidWorkflowSchemaException extends WorkflowException {
    
    /**
     * Eclipse generated
     */
    private static final long serialVersionUID = 5022561946674348166L;

    public InvalidWorkflowSchemaException(String msg) {
        super(msg);
    }
}
