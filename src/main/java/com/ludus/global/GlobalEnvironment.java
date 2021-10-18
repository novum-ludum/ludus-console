package com.ludus.global;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//**********************************************************************************************************************
//*                                         GLOBAL ENVIRONMENT.java
//*     This file describes the environment our game itself is going to take place it contains:
//*                     1) I/O Methods
//*                     2) Util Methods
//*                     3) Loading methods,
//*
//*      using centralised output methods helps to change or manipulate the text shown.
//*
//*
//*
//*
//*
//*
//*
//*
//**********************************************************************************************************************



public final class GlobalEnvironment {
    public static final String            usrHome = System.getProperty("user.home");
    public  static       Scanner          in;
    private static final File             errOut = new File(usrHome+"/.ludus/errorLog.txt");
    private static final File             log = new File(usrHome + "/.ludus/ludusLog.txt");
    private static       FileOutputStream logFileOut;
    private static       FileOutputStream errFileOut;
    private static       boolean initFlag = false;
    private static final File    folder   = new File(usrHome + "/.ludus");

    public static void init() throws FileNotFoundException {
        if(!folder.exists()) {
            boolean didCreate = folder.mkdir();
            if(!didCreate) throw new FileNotFoundException("Cant create base Folder!");
        }

        if(!log.exists()) {
            try {
                errOut.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            logFileOut = new FileOutputStream(log);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        if(!errOut.exists()) {
            try {
                boolean fileCreated = errOut.createNewFile();
                if(fileCreated) log("Created Error Log File");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if(errOut.exists()){
            log("File Found at the default Location!");
        }else{
            //cant print error if log isn't initialised.
            throw new FileNotFoundException("Error Log File Not Found and Cant be Created!");
        }

        try {
            errFileOut = new FileOutputStream(errOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.setErr(new PrintStream(errFileOut));     // Game Errors shouldn't appear on the console where the player is.

        in = new Scanner(System.in);

        initFlag = true;
    }

//*********************************************** META *****************************************************************
    private static void log(String log){
        try {
            logFileOut.write((log+"\n").getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//*********************************************** OUTPUTS **************************************************************
    static  void printGameText(String text){
        System.out.println(text);
    }

//*********************************************** INPUTS ***************************************************************

    static String getPlayerInputString(){
        if(!initFlag) {
            try {
                init();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
       return  in.nextLine();
    }
    static BigInteger getPlayerInputNumber(){
        if(!initFlag) {
            try {
                init();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return  in.nextBigInteger();
    }


//*********************************************** GETTERS **************************************************************

    public static File getErrOut() {
        if(!initFlag) {
            try {
                init();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return errOut;
    }
}

