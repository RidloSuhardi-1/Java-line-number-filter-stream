/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RIDLO_SHUHARDI
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            int desimal;
            char ascii;
            LineNumberInputStream inputStream = new LineNumberInputStream(new FileInputStream("coba.txt"));
            while((desimal = inputStream.read()) != -1) {
                ascii = (char) desimal;
                System.out.println("" + ascii + " at line " + inputStream.getLineNumber());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
