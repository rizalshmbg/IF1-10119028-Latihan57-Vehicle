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
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard() {
        System.out.println("SkateBoard");
    }
    
    public double getBoardLength() {
        return this.myBoardLength;
    }
    
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}
