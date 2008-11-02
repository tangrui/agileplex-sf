package com.agileplex.workflow;

/**
 * If there's some error in transition, this exception will be thrown.
 * 
 * @author	Weiming Yin
 * @date	2008-4-20
 *
 * @LastChanged
 * @LastChangedBy		$LastChangedBy: yinwm $
 * @LastChangedDate 	$LastChangedDate: 2008-04-20 16:45:35 +0800 (日, 20 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 34 $
 */
public class TransitionException extends WorkflowException {

    /**
     * Eclipse generated
     */
    private static final long serialVersionUID = 8731270931473753244L;
   
    
    public TransitionException(String msg) {
        super(msg);
    }
}
