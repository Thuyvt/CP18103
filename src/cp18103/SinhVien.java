/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp18103;

/**
 *
 * @author ThuyVT
 */
public class SinhVien implements Comparable<SinhVien>{

    private String maSv;
    private String hoTen;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String chuyenNganh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    public void inThongTin() {
        System.out.println("Ma sinh vien: " + this.maSv);
        System.out.printf("Ho va ten: %s \n", this.hoTen);
        System.out.println("Chuyen nganh: " + this.chuyenNganh);
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.chuyenNganh.compareTo(o.getChuyenNganh());
    }
}
