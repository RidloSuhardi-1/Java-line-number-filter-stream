/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RIDLO_SHUHARDI
 */
public class ReadFileReader {
    public static void main(String[] args) {
        try {
            int desimal;
            char ascii;
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("coba.txt"));
            while ((desimal = lineNumberReader.read()) != -1) {
                ascii = (char) desimal;
                System.out.println("" + ascii + " at line " + lineNumberReader.getLineNumber());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
