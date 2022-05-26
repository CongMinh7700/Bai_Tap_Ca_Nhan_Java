package ThuVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main {
//Cau 3                                                                                                             

    public void LayAnPham(Quan_Ly_Thu_Vien q) {

        System.out.println("Sach tham khao la: ");
        for (Sach_Tham_Khao stk : q.getStk()) {
            if (stk.getMaAnPham() == "A2") {
                System.out.println("Tac Gia: " + stk.getTacGia() + ", Nam xuat ban: " + stk.getNamXuatBan());
            }
        }
        System.out.println("----------------------------");

        System.out.println("Tap chi la : ");
        for (Tap_Chi tc : q.getTc()) {
            if (tc.getMaAnPham() == "A1") {
                System.out.println("Tac gia: " + tc.getTacGia() + ", Nam xuat ban: " + tc.getNamXuatBan());
            }
        }
        System.out.println("----------------------------");
    }
// Cau 4:

    public void TapChi10Nam(Quan_Ly_Thu_Vien q) {
        System.out.println("Tap chi 10 nam truoc la");
        for (Tap_Chi tc : q.getTc()) {
            if ((2022 - tc.getNamXuatBan()) >= 10) {
                System.out.println("Tieu de : " + tc.getTieuDe() + ",Tac gia: " + tc.getTacGia() + ", Nam xuat ban: " + tc.getNamXuatBan());
            }
        }
    }


// Cau 6:
    public void TongTienAnPham(Quan_Ly_Thu_Vien q) {
        System.out.print("Tong tien cua cac an pham la :");
        double TongTien = 0;
        for (Tap_Chi tc : q.getTc()) {
            TongTien = TongTien + tc.getDonGia();
        }
        for (Sach_Tham_Khao stk : q.getStk()) {
            TongTien = TongTien + stk.getDonGia();
        }
        System.out.println(TongTien);
    }
// Cau 7:

    public void SachThamKhaoMaxChuong(Quan_Ly_Thu_Vien q) {
        System.out.println("Sach tham khao nhieu chuong nhat la:");
        int max = 0;
        for (Sach_Tham_Khao stk : q.getStk()) {

            if (stk.getSoChuongSach() * stk.getSoTrang() > max) {
                max = stk.getSoChuongSach() * stk.getSoTrang();

                System.out.println("Tieu de : " + stk.getTieuDe() + ",Tac gia: " + stk.getTacGia() + ", Nam xuat ban: " + stk.getNamXuatBan());
            }
        }
    }
// cau 8

    public void TimTapChi(Quan_Ly_Thu_Vien q, String tenTc) {
        boolean t = true;

        for (Tap_Chi tc : q.getTc()) {
            if (tenTc == tc.getTenTapChi()) {
                System.out.println("Tim kiem an pham " + tc.getTenTapChi());
                System.out.println("Ma an pham : " + tc.getMaAnPham() + ", Tieu de : " + tc.getTieuDe() + ", Tac Gia : " + tc.getTacGia() + ", Don gia : "
                        + tc.getDonGia() + ", So trang : "
                        + tc.getSoTrang() + ", So luong : "
                        + tc.getSoLuong() + ", Nam Xuat Ban : " + tc.getNamXuatBan() + ", Ten tap chi : " + tc.getTenTapChi());
                t = false;
                break;
            }
            if (t) {
                System.out.println("Khong co tap chi ten  " + tenTc + " trong danh sach cac an pham");
            }
        }

    }
//Cau 9

    public void TapChi1Nam(Quan_Ly_Thu_Vien q) {
        System.out.println("Danh sach tap chi 1 nam truoc la");
        for (Tap_Chi tc : q.getTc()) {
            if ((2022 - tc.getNamXuatBan()) >= 1) {
                System.out.println("Tieu de : " + tc.getTieuDe() + ", Tac Gia : " + tc.getTacGia() + ", Nam Xuat Ban : " + tc.getNamXuatBan());
            }
        }
    }
//Cau 10

    public void TieuDeTangDan(Quan_Ly_Thu_Vien q) {
        System.out.println("An pham sap xep tang dan theo tieu de la :");
        System.out.println("");
        Collections.sort(q.getStk(), new Comparator<An_Pham>() {
            @Override
            public int compare(An_Pham a1, An_Pham a2) {
                return a1.getTieuDe().compareTo(a2.getTieuDe());
            }
        });
        System.out.println("Sach tham khao la: ");
        for (An_Pham ap : q.getStk()) {
            System.out.println("Tieu De : " + ap.getTieuDe() + ", Tac Gia: " + ap.getTacGia());
        }
        Collections.sort(q.getTc(), new Comparator<An_Pham>() {
            @Override
            public int compare(An_Pham a1, An_Pham a2) {
                return a1.getTieuDe().compareTo(a2.getTieuDe());
            }
        });
        System.out.println("Tap chi la: ");
        for (An_Pham ap : q.getTc()) {
            System.out.println("Tieu De : " + ap.getTieuDe() + ", Tac Gia: " + ap.getTacGia());
        }
    }

    public void NamXuatBanGiamDan(Quan_Ly_Thu_Vien q) {
        System.out.println("An pham sap xep giam dan theo nam xuat ban  la :");
        System.out.println("");
        Collections.sort(q.getStk(), new Comparator<An_Pham>() {
            @Override
            public int compare(An_Pham a1, An_Pham a2) {
                return a2.getNamXuatBan() > a1.getNamXuatBan() ? 1 : -1;
            }
        });
        System.out.println("Sach tham khao la: ");
        for (An_Pham ap : q.getStk()) {
            System.out.println("Tieu De : " + ap.getTieuDe() + ", Tac Gia: " + ap.getTacGia() + "Nam xuat ban : " + ap.getNamXuatBan());
        }
        Collections.sort(q.getTc(), new Comparator<An_Pham>() {
            @Override
            public int compare(An_Pham a1, An_Pham a2) {
                return a2.getNamXuatBan() > a1.getNamXuatBan() ? 1 : -1;

            }
        });
        System.out.println("Tap chi la: ");
        for (An_Pham ap : q.getTc()) {
            System.out.println("Tieu De : " + ap.getTieuDe() + ", Tac Gia: " + ap.getTacGia() + ",Nam xuat ban : " + ap.getNamXuatBan());
        }
    }

    //Cau 11:
    public void ThongKeAnPhamTheoNam(Quan_Ly_Thu_Vien q, int Nam) {
        int count = 0, tong = 0;
        for (Tap_Chi tc : q.getTc()) {
            if (Nam == tc.getNamXuatBan()) {
                count++;
            }
        }
        for (Sach_Tham_Khao stk : q.getStk()) {
            if (Nam == stk.getNamXuatBan()) {
                count++;
            }
        }
        System.out.println("So luong an pham nam " + Nam + " la : " + count);
    }
//Cau 12a:
    static JFrame f = new JFrame("DANH MUC SACH THAM KHAO");
    public static void HienThi(Quan_Ly_Thu_Vien q) {
    String colunm[] = {"Ma an pham", "Tieu De", "Tac Gia", "Don Gia", "So Trang", "So Luong", "Nam XB", "Linh Vuc", "So Chuong"};
        DefaultTableModel model = new DefaultTableModel(colunm, 0);
        JTable table = new JTable(model);
        table.setBounds(30, 40, 200, 300);
 
        for (Sach_Tham_Khao stk : q.getStk()) {
            Object row[] = {
                 stk.getMaAnPham(),
                stk.getTieuDe(),
                stk.getTacGia(),
                stk.getDonGia(),
                stk.getSoTrang(),
                stk.getSoLuong(),
                stk.getNamXuatBan(),
                stk.getLinhVuc(),
                stk.getSoChuongSach(),
                };
            model.addRow(row);

        }
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(1000, 500);
        f.setVisible(true);

    }
    //Cau 12b:
    static JFrame a = new JFrame("DANH MUC TAP CHI");
    public static void HienThi1(Quan_Ly_Thu_Vien q) {
    String colunm[] = {"Ma an pham", "Tieu De", "Tac Gia", "Don Gia", "So Trang", "So Luong", "Nam XB", "Ten Tap Chi"};
        DefaultTableModel model = new DefaultTableModel(colunm, 0);
        JTable table = new JTable(model);
        table.setBounds(30, 40, 200, 300);
           for (Tap_Chi tc : q.getTc()) {
            Object row[] = {
                tc.getMaAnPham(),
                tc.getTieuDe(),
                tc.getTacGia(),
                tc.getDonGia(),
                tc.getSoTrang(),
                tc.getSoLuong(),
                tc.getNamXuatBan(),
            tc.getTenTapChi()};
            model.addRow(row);

        }
   JScrollPane sp = new JScrollPane(table);
        a.add(sp);
        a.setSize(1000, 500);
        a.setVisible(true);

        }
     
    
    //Main
    public static void main(String[] args) {

        Tap_Chi tc1 = new Tap_Chi("A1", "AB01", "Minh", 10000, 210, 100, 2021, "Abc");
        Tap_Chi tc2 = new Tap_Chi("A1", "AD05", "MinhA", 1000, 210, 100, 2010, "bef");
        Tap_Chi tc3 = new Tap_Chi("A1", "AA00", "Minh", 10000, 210, 100, 2012, "DEF");
        Tap_Chi tc4 = new Tap_Chi("A1", "AC11", "MinhF", 1000, 210, 100, 2010, "AdB");
        Tap_Chi tc5 = new Tap_Chi("A1", "AE23", "MinhF", 1000, 210, 100, 2009, "AdE");
        Sach_Tham_Khao stk1 = new Sach_Tham_Khao("A2", "A12", "MinhF", 120.2, 210, 100, 2010, "XZy ", 10);
        Sach_Tham_Khao stk2 = new Sach_Tham_Khao("A2", "B17", "Minh", 1100, 220, 100, 2012, "YZY ", 10);
        Sach_Tham_Khao stk3 = new Sach_Tham_Khao("A2", "D15", "MinhF", 120.2, 210, 100, 2014, "KAy ", 10);
        Sach_Tham_Khao stk4 = new Sach_Tham_Khao("A2", "C10", "Minh", 1100, 220, 100, 2009, "OpC", 10);
        Sach_Tham_Khao stk5 = new Sach_Tham_Khao("A2", "A22", "MinhA", 1100, 220, 100, 2010, "TCD ", 10);

//
        ArrayList<Tap_Chi> t1 = new ArrayList<Tap_Chi>();
        ArrayList<Sach_Tham_Khao> s1 = new ArrayList<Sach_Tham_Khao>();

        t1.add(tc1);
        t1.add(tc2);
        t1.add(tc3);
        t1.add(tc4);
        t1.add(tc5);
        s1.add(stk1);
        s1.add(stk2);
        s1.add(stk3);
        s1.add(stk4);
        s1.add(stk5);

        Quan_Ly_Thu_Vien q1 = new Quan_Ly_Thu_Vien(s1, t1);

        Main main = new Main();

        System.out.println("Danh sach an pham la ");
        for (Sach_Tham_Khao ap : q1.getStk()) {
            System.out.println();
            System.out.println("Ma an pham : " + ap.getMaAnPham() + ", Tieu de : " + ap.getTieuDe() + ", Tac Gia : " + ap.getTacGia() + ", Don gia : "
                    + ap.getDonGia() + ", So trang : "
                    + ap.getSoTrang() + ", So luong : "
                    + ap.getSoLuong() + ", Nam Xuat Ban : " + ap.getNamXuatBan() + ", Linh vuc : " + ap.getLinhVuc() + ", So chuong sach : " + ap.getSoChuongSach());
        }
        for (Tap_Chi ap : q1.getTc()) {
            System.out.println();
            System.out.println("Ma an pham : " + ap.getMaAnPham() + ", Tieu de : " + ap.getTieuDe() + ", Tac Gia : " + ap.getTacGia() + ", Don gia : "
                    + ap.getDonGia() + ", So trang : "
                    + ap.getSoTrang() + ", So luong : "
                    + ap.getSoLuong() + ", Nam Xuat Ban : " + ap.getNamXuatBan() + ", Ten tap chi : " + ap.getTenTapChi());
        }
        //Cau 3:
        System.out.println("");
        System.out.println("Cau 3 : ");
        main.LayAnPham(q1);
        System.out.println("----------------------------");
        //Cau 4:
        System.out.println("");
        System.out.println("Cau 4 : ");
        main.TapChi10Nam(q1);
        System.out.println("----------------------------");
        //Cau 5:
        System.out.println("");
        System.out.println("Cau 5 :");
        System.out.println("Kiem tra an pham AA00 va AB01 : "+tc3.cungLoaiCungTacGia(tc1));
      
        System.out.println("Kiem tra an pham AB01 va A12 : "+tc3.cungLoaiCungTacGia(stk1));

//        System.out.println("----------------------------");
        // Cau 6:
        System.out.println("");
        System.out.println("Cau 6 :");
        main.TongTienAnPham(q1);
        System.out.println("----------------------------");
        //Cau 7:
        System.out.println("");
        System.out.println("Cau 7 : ");
        main.SachThamKhaoMaxChuong(q1);
        System.out.println("----------------------------");
        //Cau 8:
        System.out.println("");
        System.out.println("Cau 8 : ");
        main.TimTapChi(q1, "bef");
        System.out.println("----------------------------");
        //Cau9:
        System.out.println("");
        System.out.println("Cau 9 : ");
        main.TapChi1Nam(q1);
        System.out.println("----------------------------");
        //Cau 10:
        System.out.println("");
        System.out.println("Cau 10a");
        main.TieuDeTangDan(q1);
        System.out.println("----------------------------");
        System.out.println("Cau 10b : ");
        main.NamXuatBanGiamDan(q1);
        System.out.println("----------------------------");
        //cau 11:
        System.out.println("");
        System.out.println("Cau11 : ");
        main.ThongKeAnPhamTheoNam(q1, 2009);
        System.out.println("----------------------------");
        main.ThongKeAnPhamTheoNam(q1, 2010);
        System.out.println("----------------------------");
        main.ThongKeAnPhamTheoNam(q1, 2012);
        System.out.println("----------------------------");
        main.ThongKeAnPhamTheoNam(q1, 2014);
        System.out.println("----------------------------");
        main.ThongKeAnPhamTheoNam(q1, 2021);
        System.out.println("----------------------------");
        //cau 12:
        System.out.println("");
        System.out.println("Cau12 : ");
        main.HienThi(q1);
        main.HienThi1(q1);
    }

}
