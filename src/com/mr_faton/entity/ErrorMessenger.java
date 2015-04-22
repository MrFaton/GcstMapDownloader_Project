package com.mr_faton.entity;

import com.mr_faton.StartProgram;

import javax.swing.*;

/**
 * Created by Mr_Faton on 20.04.2015.
 */
public final class ErrorMessenger {

    public ErrorMessenger(String message) {
        JOptionPane.showMessageDialog(StartProgram.mainFrame, message, "Ошибка!", JOptionPane.ERROR_MESSAGE);
    }
}
/*
Объект этого класса просто выводит пользователю стандартное сообщение об возникшей ошибке. Для этого ему в конструктор
нужно передать сообщение, содержащее информацию об ошибке
 */