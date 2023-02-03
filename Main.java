import classes.*;

// Nama : Nicolas Airel Valeriant Suwarno
// NIM  : 2540117981

public class Main {
    public static void main(String[] args){
        makanan[] arrMakanan;
        arrMakanan = new makanan[6];
        arrMakanan[0] = new nastar();
        arrMakanan[1] = new donut();
        arrMakanan[2] = new kerupuk();
        arrMakanan[3] = new kue();
        arrMakanan[4] = new permen();
        arrMakanan[5] = new pretzel();

        for(int i = 0 ; i < arrMakanan.length ; i++){
            System.out.print("[INFO] ");
            arrMakanan[i].bought();
            System.out.print("\n");
        }
    }
}
