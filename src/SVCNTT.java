public class SVCNTT implements Cloneable{
    private String monBatBuoc;
    private String ten;
    private int mssv;
    private String chuyenNganh;
    private String monKhac;

    @Override
    protected SVCNTT clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return (SVCNTT) super.clone();
    }
    
    public SVCNTT(String monBatBuoc){
        this.monBatBuoc = monBatBuoc;
    }

    public void setChuyenNganh(String chuyenNganh){
        this.chuyenNganh = chuyenNganh;
    }

    

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMssv() {
        return this.mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getMonKhac() {
        return this.monKhac;
    }

    public void setMonKhac(String monKhac) {
        this.monKhac = monKhac;
    }
    

    @Override
    public String toString() {
        return "MSSV: "+ mssv + "\nTên: " + ten + "\nChuyên ngành: " + chuyenNganh + "\nCác môn bắt buộc: " + monBatBuoc + "\nCác môn khác: " + monKhac;
    }
}
