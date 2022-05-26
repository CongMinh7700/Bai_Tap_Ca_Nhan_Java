
package ThuVien;



import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    ArrayList<String> S = new ArrayList<>();
    public Menu() {
        super();
    }

    public void addMenuItem(String SG) {
        S.add(SG);
    }

    public int getUserChoice() {
        int result = 0; //dat bien cho result de tra ve kq
        
        if (S.size() > 0) {//print out hints
            for (int i = 0; i < S.size(); i++) {
                System.out.println((i + 1) + "-" + S.get(i));
            }
            try {
                System.out.println("Please select an operation: ");
                Scanner sc = new Scanner(System.in);
                result = Integer.parseInt(sc.nextLine());//get user choice
            }catch(NumberFormatException e){
                System.out.println("The Input Erorr");
            }
        }
        return result;
    }
}
