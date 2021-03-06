/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kuis1_1H.Safira;

/**
 *
 * @author SAFIRA
 */
public class mainSepedaMotor {
    public static void main(String[] args) {
        sepedaMotor spm = new sepedaMotor();
        spm.merk = "Honda";
        spm.kurangikecepatanMotor(10);
        spm.tambahkecepatanMotor(15);
        spm.info();
        
        spm.merk = "Yamaha";
        spm.kurangikecepatanMotor(20);
        spm.tambahkecepatanMotor(15);
        spm.info();
        
        spm.merk = "Ducati";
        spm.kurangikecepatanMotor(20);
        spm.tambahkecepatanMotor(15);
        spm.info();
        
        spm.merk = "Suzuki";
        spm.kurangikecepatanMotor(20);
        spm.tambahkecepatanMotor(15);
        spm.info();
    }
}
