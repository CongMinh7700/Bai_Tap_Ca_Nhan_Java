
package ThuVien;



public class Sach_Tham_Khao extends An_Pham  {

    private String Linh_Vuc;
    private int So_Chuong_Sach;

    public Sach_Tham_Khao() {
        super();
    }

    public Sach_Tham_Khao(String Ma_An_Pham,String Tieu_De, String Tac_Gia, double Don_Gia, int So_Trang, int So_Luong, int Nam_XB,String Linh_Vuc, int So_Chuong_Sach) {
        super(Ma_An_Pham,Tieu_De, Tac_Gia,  Don_Gia,  So_Trang, So_Luong,  Nam_XB);
        this.Linh_Vuc = Linh_Vuc;
        this.So_Chuong_Sach = So_Chuong_Sach;
    }

    public String getLinhVuc() {
        return Linh_Vuc;
    }

    public void setLinhVuc(String Linh_Vuc) {
        this.Linh_Vuc = Linh_Vuc;

    }

    public int getSoChuongSach() {
        return So_Chuong_Sach;
    }

    public void setSoChuongSach(int So_Chuong_Sach) {
        this.So_Chuong_Sach = So_Chuong_Sach;
    }

    @Override
    public boolean cungLoaiCungTacGia(An_Pham ap) {
      return ap.getClass().equals(this.getClass()) &&(this.getTacGia().equals(ap.getTacGia()));
    }

}