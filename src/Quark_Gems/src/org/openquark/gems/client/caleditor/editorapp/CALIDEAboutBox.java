/*
 * Copyright (c) 2007 BUSINESS OBJECTS SOFTWARE LIMITED
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *  
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *  
 *     * Neither the name of Business Objects nor the names of its contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *  
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */


/*
 * CALIDEAboutBox.java
 * Creation date: ?
 * By: ?
 */
package org.openquark.gems.client.caleditor.editorapp;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * This type was generated by a SmartGuide.
 */
public class CALIDEAboutBox extends JDialog {

    private static final long serialVersionUID = 4338477612467187967L;

    private JLabel ivjAppName = null;
    private JPanel ivjButtonPane = null;
    private JLabel ivjCopyright = null;
    private final IvjEventHandler ivjEventHandler = new IvjEventHandler();
    private JLabel ivjIconLabel = null;
    private JPanel ivjIconPane = null;
    private JPanel ivjJDialogContentPane = null;
    private JButton ivjOkButton = null;
    private JLabel ivjSpacer = null;
    private JPanel ivjTextPane = null;
    private JLabel ivjUserName = null;
    private JLabel ivjVersion = null;

    class IvjEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == CALIDEAboutBox.this.getOkButton()) {
                connEtoM1();
            }
        }
    }
    /**
     * CALIDEAboutBox constructor comment.
     */
    public CALIDEAboutBox() {
        super();
        initialize();
    }
    /**
     * CALIDEAboutBox constructor comment.
     * @param owner Dialog
     */
    public CALIDEAboutBox(Dialog owner) {
        super(owner);
    }
    /**
     * CALIDEAboutBox constructor comment.
     * @param owner Dialog
     * @param title String
     */
    public CALIDEAboutBox(Dialog owner, String title) {
        super(owner, title);
    }
    /**
     * CALIDEAboutBox constructor comment.
     * @param owner Dialog
     * @param title String
     * @param modal boolean
     */
    public CALIDEAboutBox(Dialog owner, String title, boolean modal) {
        super(owner, title, modal);
    }
    /**
     * CALIDEAboutBox constructor comment.
     * @param owner Dialog
     * @param modal boolean
     */
    public CALIDEAboutBox(Dialog owner, boolean modal) {
        super(owner, modal);
    }
    /**
     * CALIDEAboutBox constructor comment.
     * @param owner Frame
     */
    public CALIDEAboutBox(Frame owner) {
        super(owner);
    }
    /**
     * CALIDEAboutBox constructor comment.
     * @param owner Frame
     * @param title String
     */
    public CALIDEAboutBox(Frame owner, String title) {
        super(owner, title);
    }
    /**
     * CALIDEAboutBox constructor comment.
     * @param owner Frame
     * @param title String
     * @param modal boolean
     */
    public CALIDEAboutBox(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
    }
    /**
     * CALIDEAboutBox constructor comment.
     * @param owner Frame
     * @param modal boolean
     */
    public CALIDEAboutBox(Frame owner, boolean modal) {
        super(owner, modal);
    }
    /**
     * connEtoM1:  (OkButton.action.actionPerformed(ActionEvent) --> CALIDEAboutBox.dispose()V)
     */
    private void connEtoM1() {
        try {
            this.dispose();
        } catch (Throwable ivjExc) {
            handleException(ivjExc);
        }
    }
    /**
     * Return the AppName property value.
     * @return JLabel
     */
    private JLabel getAppName() {
        if (ivjAppName == null) {
            try {
                ivjAppName = new JLabel();
                ivjAppName.setName("AppName"); //$NON-NLS-1$
                ivjAppName.setText(CALIDEMessages.getString("CALIDEAboutBox.AppName")); //$NON-NLS-1$
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjAppName;
    }
    /**
     * Return the ButtonPane property value.
     * @return JPanel
     */
    private JPanel getButtonPane() {
        if (ivjButtonPane == null) {
            try {
                ivjButtonPane = new JPanel();
                ivjButtonPane.setName("ButtonPane"); //$NON-NLS-1$
                ivjButtonPane.setLayout(new FlowLayout());
                getButtonPane().add(getOkButton(), getOkButton().getName());
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjButtonPane;
    }
    /**
     * Return the Copyright property value.
     * @return JLabel
     */
    private JLabel getCopyright() {
        if (ivjCopyright == null) {
            try {
                ivjCopyright = new JLabel();
                ivjCopyright.setName("Copyright"); //$NON-NLS-1$
                ivjCopyright.setText(CALIDEMessages.getString("CALIDEAboutBox.Copyright_Notice")); //$NON-NLS-1$
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjCopyright;
    }
    /**
     * Return the IconLabel property value.
     * @return JLabel
     */
    private JLabel getIconLabel() {
        if (ivjIconLabel == null) {
            try {
                ivjIconLabel = new JLabel();
                ivjIconLabel.setName("IconLabel"); //$NON-NLS-1$
                ivjIconLabel.setIcon(new ImageIcon(getClass().getResource("/Resources/gemcutter_32.gif"))); //$NON-NLS-1$
                ivjIconLabel.setText(""); //$NON-NLS-1$
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjIconLabel;
    }
    /**
     * Return the IconPane property value.
     * @return JPanel
     */
    private JPanel getIconPane() {
        if (ivjIconPane == null) {
            try {
                ivjIconPane = new JPanel();
                ivjIconPane.setName("IconPane"); //$NON-NLS-1$
                ivjIconPane.setLayout(new FlowLayout());
                getIconPane().add(getIconLabel(), getIconLabel().getName());
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjIconPane;
    }
    /**
     * Return the JDialogContentPane property value.
     * @return JPanel
     */
    private JPanel getJDialogContentPane() {
        if (ivjJDialogContentPane == null) {
            try {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane"); //$NON-NLS-1$
                ivjJDialogContentPane.setLayout(new BorderLayout());
                getJDialogContentPane().add(getButtonPane(), "South"); //$NON-NLS-1$
                getJDialogContentPane().add(getTextPane(), "Center"); //$NON-NLS-1$
                getJDialogContentPane().add(getIconPane(), "West"); //$NON-NLS-1$
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjJDialogContentPane;
    }
    /**
     * Return the OkButton property value.
     * @return JButton
     */
    private JButton getOkButton() {
        if (ivjOkButton == null) {
            try {
                ivjOkButton = new JButton();
                ivjOkButton.setName("OkButton"); //$NON-NLS-1$
                ivjOkButton.setText("OK"); //$NON-NLS-1$
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjOkButton;
    }
    /**
     * Return the Spacer property value.
     * @return JLabel
     */
    private JLabel getSpacer() {
        if (ivjSpacer == null) {
            try {
                ivjSpacer = new JLabel();
                ivjSpacer.setName("Spacer"); //$NON-NLS-1$
                ivjSpacer.setText(""); //$NON-NLS-1$
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjSpacer;
    }
    /**
     * Return the TextPane property value.
     * @return JPanel
     */
    private JPanel getTextPane() {
        if (ivjTextPane == null) {
            try {
                ivjTextPane = new JPanel();
                ivjTextPane.setName("TextPane"); //$NON-NLS-1$
                ivjTextPane.setLayout(getTextPaneGridLayout());
                getTextPane().add(getAppName(), getAppName().getName());
                getTextPane().add(getVersion(), getVersion().getName());
                getTextPane().add(getSpacer(), getSpacer().getName());
                getTextPane().add(getCopyright(), getCopyright().getName());
                getTextPane().add(getUserName(), getUserName().getName());
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjTextPane;
    }
    /**
     * Return the TextPaneGridLayout property value.
     * @return GridLayout
     */
    private GridLayout getTextPaneGridLayout() {
        GridLayout ivjTextPaneGridLayout = null;
        try {
            /* Create part */
            ivjTextPaneGridLayout = new GridLayout(5, 1);
        } catch (Throwable ivjExc) {
            handleException(ivjExc);
        }
        return ivjTextPaneGridLayout;
    }
    /**
     * Return the UserName property value.
     * @return JLabel
     */
    private JLabel getUserName() {
        if (ivjUserName == null) {
            try {
                ivjUserName = new JLabel();
                ivjUserName.setName("UserName"); //$NON-NLS-1$
                ivjUserName.setText(CALIDEMessages.getString("CALIDEAboutBox.About_Username")); //$NON-NLS-1$
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjUserName;
    }
    /**
     * Return the Version property value.
     * @return JLabel
     */
    private JLabel getVersion() {
        if (ivjVersion == null) {
            try {
                ivjVersion = new JLabel();
                ivjVersion.setName("Version"); //$NON-NLS-1$
                ivjVersion.setText(CALIDEMessages.getString("CALIDEAboutBox.Version_Number")); //$NON-NLS-1$
            } catch (Throwable ivjExc) {
                handleException(ivjExc);
            }
        }
        return ivjVersion;
    }
    /**
     * Called whenever the part throws an exception.
     * @param exception Throwable
     */
    private void handleException(Throwable exception) {
        /* Uncomment the following lines to print uncaught exceptions to stdout */
        System.out.println("--------- UNCAUGHT EXCEPTION ---------"); //$NON-NLS-1$
        exception.printStackTrace(System.out);
    }
    
    /**
     * Initializes connections
     * @exception Exception The exception description.
     */
    private void initConnections() throws Exception {
        getOkButton().addActionListener(ivjEventHandler);
    }
    /**
     * Initialize the class.
     */
    private void initialize() {
        try {
            setName("CALIDEAboutBox"); //$NON-NLS-1$
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            setSize(330, 160);
            setTitle("CALIDEAboutBox"); //$NON-NLS-1$
            setContentPane(getJDialogContentPane());
            initConnections();
        } catch (Throwable ivjExc) {
            handleException(ivjExc);
        }
    }
    /**
     * main entrypoint - starts the part when it is run as an application
     * @param args String[]
     */
    public static void main(String[] args) {
        try {
            CALIDEAboutBox aCALIDEAboutBox;
            aCALIDEAboutBox = new CALIDEAboutBox();
            aCALIDEAboutBox.setModal(true);
            aCALIDEAboutBox.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            aCALIDEAboutBox.setVisible(true);
            Insets insets = aCALIDEAboutBox.getInsets();
            aCALIDEAboutBox.setSize(aCALIDEAboutBox.getWidth() + insets.left + insets.right, aCALIDEAboutBox.getHeight() + insets.top + insets.bottom);
            aCALIDEAboutBox.setVisible(true);
        } catch (Throwable exception) {
            System.err.println("Exception occurred in main() of JDialog"); //$NON-NLS-1$
            exception.printStackTrace(System.out);
        }
    }
}
