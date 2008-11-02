package com.agileplex.workflow;

/**
 * If no action specificed and no predefined chooser
 * This exception will be caused.
 * 
 * @author	Weiming Yin
 * @date	2008-4-20
 *
 * @LastChanged
 * @LastChangedBy		$LastChangedBy: yinwm $
 * @LastChangedDate 	$LastChangedDate: 2008-04-20 01:54:35 +0800 (日, 20 四月 2008) $
 * @LastChangedRevision $LastChangedRevision: 32 $
 */
public class NoActionChooserException extends WorkflowException {
    
    /**
     * Eclipse generated
     */
    private static final long serialVersionUID = -370393154262505586L;

    public NoActionChooserException(String msg) {
        super(msg);
    }
}
