package C_GeometryInterface;

public class Hinhtron extends Vehinh {
    private float bankinh;

    public Hinhtron() {
    }

    public Hinhtron(float bankinh) {
        this.bankinh = bankinh;
    }
    public float getBankinh(){
        return bankinh;
    }
    public void setBankinh(float bankinh){
       this.bankinh=bankinh;
    }
}
