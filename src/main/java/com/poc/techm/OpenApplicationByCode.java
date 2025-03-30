package com.poc.techm;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OpenApplicationByCode {
    public static void main(String[] args) {
        //File file=new File("C:\\Program Files\\Notepad++\\notepad++.exe");
        //File file=new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        //File file=new File("C:\\Program Files\\MySQL\\MySQL Workbench 8.0\\MySQLWorkbench.exe");
        File file=new File("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe");
        if (!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported !!");
            return;
        }
        Desktop desktop=Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*String command="mspaint";
        try {
            Process process=Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
