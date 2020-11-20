/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan57.vehicle;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan macam-macam kendaraan
 */
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle() {
        super();
        System.out.println("Bicycle");
    }
    
    public int getGearCount() {
        return this.myGearCount;
    }
    
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}