/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Alek
 */
public class ValidInput {
    
    public boolean valid(double height, double width) {
        return height > 0 && width > 0 && height < 9001 && width < 9001; // Over 9000!
        // Can only input numbers from 0 to 9001
    }
}
