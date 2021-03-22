/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author HP
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho = new Automovil();
        Automovil miAcura = new Automovil();
        Automovil miMustang = new Automovil();
        
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedán");
        miBocho.setModelo(5000);
       // miBocho.modelo=5000;//Enn peligro la integridad de la lógica
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
       
        miAcura.setMarca("Acura");
        miAcura.setSubMarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.gray);
        System.out.println(miAcura);
                
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
    }
    
}
