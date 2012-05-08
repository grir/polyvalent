/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polyvalent;

import org.apache.commons.math3.geometry.euclidean.threed.*;

/**
 *
 * @author sm
 */
public class PolyvalentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector3D v1 = Vector3D.PLUS_I;
        System.out.println(v1);
        Vector3D v2 = Vector3D.PLUS_J;
        v2.crossProduct(v1);
        System.out.println(v2);
        
    }
}
