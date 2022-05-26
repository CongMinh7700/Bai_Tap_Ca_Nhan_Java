
package ThuVien;

import java.util.List;
public class Quan_Ly_Thu_Vien {
    private List<Sach_Tham_Khao> stk;
    private List<Tap_Chi> tc;
    
        public Quan_Ly_Thu_Vien(List<Sach_Tham_Khao> stk,List<Tap_Chi> tc){
        this.stk =stk;
        this.tc=tc;
    }
     public List<Sach_Tham_Khao> getStk() {
        return stk;
    }
     public void setStk (List<Sach_Tham_Khao> stk) {
        this.stk = stk;
    }

      public List<Tap_Chi> getTc() {
        return tc;
    }
       public void setTc (List<Tap_Chi> tc) {
        this.tc = tc;
    }
}
