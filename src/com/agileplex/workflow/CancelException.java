package com.agileplex.workflow;

/**
 * This exception used for all event handler which could be cancel. 
 * 
 * @author	Weiming Yin
 * @date	2008-4-19
 *
 * @LastChanged
 * @LastChangedBy		$LastChangedBy: yinwm $
 * @LastChangedDate 	$LastChangedDate: 2008-04-20 01:54:35 +0800 (日, 20 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 32 $
 */
public class CancelException extends WorkflowException {

    /**
     * Eclipse generated
     */
    private static final long serialVersionUID = -3063805644670997302L;

    public CancelException() {
        super();
    }
    
    public CancelException(String msg) {
        super(msg);
    }
}
