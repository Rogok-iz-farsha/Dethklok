/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Александр
 */
public class JavaApplication3 {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {         
              Logger log=Logger.getLogger(JavaApplication3.class.getName());
              log.setLevel(Level.FINEST);
              FileHandler handler = new FileHandler("built_in_log_demo.log",256,3,true);
              handler.setFormatter(new SimpleFormatter());
              log.addHandler(handler);
              log.info("555555555555");
              log.info("6666666666666666");
              log.finest("7777777777");
              log.info("888888888888");
    }
    
}
