package com.agileplex.workflow;

/**
 * Workflow related root exception
 * 
 * @author	Weiming Yin
 * @date	2008-4-19
 *
 * @LastChanged
 * @LastChangedBy		$LastChangedBy: yinwm $
 * @LastChangedDate 	$LastChangedDate: 2008-04-20 01:54:35 +0800 (日, 20 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 32 $
 */
public class WorkflowException extends RuntimeException {
    
    /**
     * Eclipse generated
     */
    private static final long serialVersionUID = -1406881499894623230L;

    public WorkflowException() {
        super();
    }
    
    public WorkflowException(String msg) {
        super(msg);
    }
    
    public WorkflowException(Throwable t) {
        super(t);
    }
}
