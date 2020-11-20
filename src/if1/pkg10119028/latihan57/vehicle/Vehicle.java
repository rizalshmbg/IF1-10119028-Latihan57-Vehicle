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
public class Vehicle {
    private String myBrand, myModel;
    
    public Vehicle() {
    }
    
    public String getBrand() {
        return this.myBrand;
    }
    
    public void setBrand(String brand) {
        this.myBrand = brand;
    }
    
    public String getModel() {
        return this.myModel;
    }
    
    public void setModel(String model) {
        this.myModel = model;
    }
}
