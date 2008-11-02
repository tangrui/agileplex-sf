package com.agileplex.workflow;

/**
 * WorkflowSession
 *
 * @creator Rui Tang
 * @date 2008-02-18
 *
 * @LastChanged
 * @LastChangedBy $LastChangedBy: yinwm $
 * @LastChangedDate $LastChangedDate: 2008-05-16 01:47:58 +0800 (五, 16 五月 2008) $
 * @LastChangedRevision $LastChangedRevision: 64 $
 */
public interface WorkflowSession {

    void onComplete();

    /**
     * Put argument into session
     * 
     * @param key
     * @param value
     */
    void put(String key, Object value);
    
    /**
     * Get argument from session
     * 
     * @param key
     * @return value
     */
    Object get(String key);
}
