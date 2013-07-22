/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.igo.fund;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author igo
 */
@Named(value = "fileOperationsBean")
@SessionScoped
public class FileOperationsBean implements Serializable {
    private static final long serialVersionUID = -1854215320203043566L;

    /**
     * Creates a new instance of FileOperationsBean
     */
    public FileOperationsBean() {
    }
}
