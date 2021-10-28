/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionutilisateurs.test;

import java.sql.SQLException;
import gestionutilisateurs.entites.Utilisateur;
import gestionutilisateur.services.ServiceUtilisateur;
import gestionutilisateurs.entites.Utilisateur.Roles;
import gestionutilisateurs.entites.Utilisateur.Type_service;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author khili youssef
 */
public class gestionutilisateur {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceUtilisateur su = new ServiceUtilisateur();
        Utilisateur u = new Utilisateur(78,"you","ssef","alimoil@.com",25869123,"mohh","pass","","",258,Type_service.LIVRAISON,Roles.RESPONSABLE_ACT);
        su.ajouter(u);
        //su.logInVerif("mohh","pass");
        //su.archiver(24,u);
//        try {
//            //System.out.println(su.afficher());
//            //System.out.println(su.trierParRole());
//            //su.modifier(1,u);
//            //System.out.println(su.rechercheParId(50));
//        } catch (SQLException ex) {
//            Logger.getLogger(gestionutilisateur.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
       
    }
    
    
}
