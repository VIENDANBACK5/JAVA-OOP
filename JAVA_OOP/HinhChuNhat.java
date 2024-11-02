
class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        this.chieuDai=1;
        this.chieuRong=1;
    }

    public HinhChuNhat(double canh) {
        this.chieuDai= canh;
        this.chieuRong=canh;
    }

    public HinhChuNhat(double chieuDai,double chieuRong) {
        this.chieuDai=chieuDai;
        this.chieuRong= chieuRong;
    }

    public double dientich(){
        return  this.chieuDai*this.chieuRong;
    }

    public void ketqua(){
        System.out.println(this.chieuDai);
        System.out.println(this.chieuRong);
        System.out.println(this.dientich());
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.ketqua();
    }
}

