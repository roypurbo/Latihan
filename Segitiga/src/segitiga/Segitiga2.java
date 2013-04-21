/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author phantom
 */
public class Segitiga2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
