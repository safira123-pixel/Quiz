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
public class sepedaMotor {
    public String merk;
    public int kecepatanMotor;
    public boolean kontakMotor;
    
    public sepedaMotor(){
        
    }
    public sepedaMotor (String m){
        m = merk;
    }
    public boolean kontakMotor (){
        return false;
    }
    
   public void nyalakanMotor(boolean kontak){
       boolean hidup;
       boolean mati;
       if (hidup = true){
           System.out.println("lanjut menyalakan");
       } else {
           System.out.println("Menhidupkan motor");
           kecepatanMotor = 0;
       }
   }
   public void matikanMotor(boolean kontak){
       
   }
   public void tambahkecepatanMotor(int kec){
       kecepatanMotor = kecepatanMotor + kec;
   }
   public void kurangikecepatanMotor(int kec){
       kecepatanMotor = kecepatanMotor - kec;
   }

   public void info(){
       System.out.println("merk motor: "+merk+"Kecepatan motor: "+kecepatanMotor);
   }
    
}

