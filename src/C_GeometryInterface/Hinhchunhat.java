package C_GeometryInterface;

public class Hinhchunhat extends Vehinh{
    private float chieudai;
    private float chieurong;
public Hinhchunhat(){
}
public Hinhchunhat(float chieudai){
    this.chieudai=chieudai;
}
public Hinhchunhat(float chieudai, float chieurong){
    this.chieudai=chieudai;
    this.chieurong=chieurong;
}
public float getChieudai(){
    return chieudai;
}
public void setChieudai(float chieudai){
    this.chieudai=chieudai;
}
public float getChieurong(){
    return chieurong;
}
public void setChieurong(){
    this.chieurong=chieurong;
}
}
