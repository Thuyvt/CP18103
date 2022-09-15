/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp18103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class QLSV {
    List<SinhVien> listSinhvien = new ArrayList<>();
//    ArrayList<SinhVien> array = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public QLSV() {
    }
    
    // Nhap thong tin sinh vien
    public void nhapSv() {
        while(true) {
            // Tao doi tuong sinh vien
            SinhVien st = new SinhVien();
            System.out.println("Nhap ma Sinh vien: ");
            st.setMaSv(sc.nextLine());
            System.out.println("Nhap ho va ten: ");
            st.setHoTen(sc.nextLine());
            System.out.println("Nhap chuyen nganh: ");
            st.setChuyenNganh(sc.nextLine());
            
            listSinhvien.add(st);
            System.out.println("Ban co muon nhap tiep khong(Y/N)");
            if (sc.nextLine().trim().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    // Xuat danh sach
    public void xuatDS() {
        for (SinhVien v: listSinhvien) {
            v.inThongTin();
        }
    }
    
    // Tim sinh vien theo ma
    public void timSv() {
        System.out.println("Nhap ma sinh vien can tim:");
        String ma = sc.nextLine().trim();
        // C1:
        for  (SinhVien sv: listSinhvien) {
            if (sv.getMaSv().equalsIgnoreCase(ma)) {
                sv.inThongTin();
            }
        }
        // C2:
        List<SinhVien> result = listSinhvien.stream().
                filter(sinhvien -> sinhvien.getMaSv().equalsIgnoreCase(ma))
                .collect(Collectors.toList());
        if (!result.isEmpty()) {
            result.forEach(rs -> rs.inThongTin());
        }
    }
    
    // sap xep sinh vien theo chuyen nganh
    public void sapxep() {
        Collections.sort(listSinhvien);
        xuatDS();
    }
    
    
}
