
package ThuVien;





import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import java.util.Scanner;

public abstract class An_Pham {

    private String Tieu_De, Tac_Gia;
    private String Ma_An_Pham;
    private double Don_Gia;
    private int So_Luong, Nam_XB, So_Trang;
    Scanner in = new Scanner(System.in);

    public An_Pham() {
        super();
    }

    public An_Pham(String Ma_An_Pham,String Tieu_De, String Tac_Gia, double Don_Gia, int So_Trang, int So_Luong, int Nam_XB) {
        super();
        this.Ma_An_Pham =Ma_An_Pham;
        this.Tieu_De = Tieu_De;
        this.Tac_Gia = Tac_Gia;
        this.Don_Gia = Don_Gia;
        this.So_Trang = So_Trang;
        this.So_Luong = So_Luong;
        this.Nam_XB = Nam_XB;

    }

    public String getMaAnPham() {
        return Ma_An_Pham;
    }

    public void setMaAnPham(String Ma_An_Pham) {
        this.Ma_An_Pham = Ma_An_Pham;
    }
    public String getTieuDe() {
        return Tieu_De;
    }

    public void setTieuDe(String Tieu_De) {
        this.Tieu_De = Tieu_De;
    }

    public String getTacGia() {
        return Tac_Gia;
    }

    public void setTacGia(String Tac_Gia) {
        this.Tac_Gia = Tac_Gia;
    }

    public int getNamXuatBan() {
        return Nam_XB;
    }

    public void setNamXuatBan(int Nam_XB) {
        this.Nam_XB = Nam_XB;
    }

    public double getDonGia() {
        return Don_Gia;
    }

    public void setDonGia(double Don_Gia) {
        this.Don_Gia = Don_Gia;
    }

    public int getSoLuong() {
        return So_Luong;
    }

    public void setSoLuong(int So_Luong) {
        this.So_Luong = So_Luong;
    }

    public int getSoTrang() {
        return So_Trang;
    }

    public void setTrang(int So_Trang) {
        this.So_Trang = So_Trang;
    }
    
    public abstract boolean cungLoaiCungTacGia(An_Pham ap);

}