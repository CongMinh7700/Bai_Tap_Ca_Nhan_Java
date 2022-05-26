/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;


public class Tap_Chi extends An_Pham{

    private String Ten_Tap_Chi;

    public Tap_Chi() {
        super();
    }
     public Tap_Chi(String Ma_An_Pham,String Tieu_De, String Tac_Gia, double Don_Gia, int So_Trang, int So_Luong, int Nam_XB,String Ten_Tap_Chi) {
        super(Ma_An_Pham,Tieu_De, Tac_Gia,  Don_Gia,  So_Trang, So_Luong,  Nam_XB);
        this.Ten_Tap_Chi = Ten_Tap_Chi;
    }

  

    public String getTenTapChi() {
        return Ten_Tap_Chi;
    }

    public void setTapChi(String Ten_Tap_chi) {
        this.Ten_Tap_Chi = Ten_Tap_Chi;
    }

    @Override
    public boolean cungLoaiCungTacGia(An_Pham ap) {
        return ap.getClass().equals(this.getClass()) &&  (this.getTacGia().equals(ap.getTacGia()));
    }

}