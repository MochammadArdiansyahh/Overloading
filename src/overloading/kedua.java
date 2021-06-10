/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Moch Ardiansyah
 */
public class kedua extends ketiga{
    
    
    void bio(String nama){
        this.nama = nama;
        System.out.println(nama+"Moch Ardiansyah");
    }
    
    void bio (String nama, String kelas){
        this.nama = nama;
        this.kelas = kelas;
        System.out.println("  ");
        System.out.println(nama+"Moch Ardiansyah");
        System.out.println(kelas+"X RPL 2");
    }
}
