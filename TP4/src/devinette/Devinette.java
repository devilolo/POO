/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devinette;

/**
 *
 * @author lemairlo
 */
public class Devinette {

    private int nombre;
    private int min;
    private int max;

    public Devinette(int min, int max) {
        if (min < 0) {
           min=-min;
        }
        if (max < 0) {
            max=-max;

        }
        if (min > max) {
            this.min = max;
            this.max = min;
        } else {
            this.min = min;
            this.max = max;
        }

    }

    public void cheat(int nombre) {
        if (nombre > max || nombre < min) {
            this.nombre = (max + min) / 2;
        } else {
            this.nombre = nombre;
        }

    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    
    public void auhasard(){
         double valeur = min + (max - min)*Math.random();
        this.nombre = (int)Math.round(valeur);
    }

}
