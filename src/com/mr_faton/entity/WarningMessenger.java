package com.mr_faton.entity;

import com.mr_faton.StartProgram;

import javax.swing.*;

/**
 * Created by root on 21.04.2015.
 */
public class WarningMessenger {
    public WarningMessenger(String title, String message) {
        JOptionPane.showMessageDialog(StartProgram.mainFrame, message, title, JOptionPane.WARNING_MESSAGE);
    }
}
