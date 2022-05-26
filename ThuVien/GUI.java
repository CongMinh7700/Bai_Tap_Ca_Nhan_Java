/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

/**
 *
 * @author Min-chan
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUI {

    static JFrame f = new JFrame("DANH MỤC ẤN PHẨM");

//Phương thức hiển thị danh mục ấn phẩm với giao diện đồ họa thông 
    public static void HienThi(Quan_Ly_Thu_Vien q) {

       
 String colunm[] = {"Ma an pham", "Tieu De", "Tac Gia", "Don Gia", "So Trang", "So Luong", "Nam XB", "Linh Vuc", "So Chuong"};
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
        for (Sach_Tham_Khao stk : q.getStk()) {
            Object row[] = {
                 stk.getMaAnPham(),
                stk.getTieuDe(),
                stk.getTacGia(),
                stk.getDonGia(),
                stk.getSoTrang(),
                stk.getSoLuong(),
                stk.getNamXuatBan(),
                stk.getSoChuongSach(),
                };
            model.addRow(row);

        }
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(1000, 500);
        f.setVisible(true);

    
}
}
