package QuanLyBaiXe;

import java.time.LocalTime;

public  abstract class PhuongTien {
    public String Name;
    public int Gia;
    public LocalTime In;
    public LocalTime Out;
    public abstract String Parking();
}
