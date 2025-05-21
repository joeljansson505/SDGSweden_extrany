package inlämningsprojekt_ny;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ludvigkaiser
 */


import oru.inf.InfDB;
import oru.inf.InfException;

public class SDGSweden {
    

    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
           idb = new InfDB("SDGSweden", "3306", "dbAdmin2024", "dbAdmin2024PW");
              new Inloggning(idb).setVisible(true);
            
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
}