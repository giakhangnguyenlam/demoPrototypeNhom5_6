public class App {
    public static void main(String[] args) throws Exception {
        
        SVCNTT svCNTT = new SVCNTT("Giáo dục thể chất 1, Nhập môn lập trình, Nhập môn ngành CNTT, Pháp luật đại cương, Toán 1, Vật lý 1");

        //Sinh viên chuyên ngành công nghệ phần mềm
        SVCNTT svCNPM = svCNTT.clone();
        svCNPM.setChuyenNganh("Công nghệ phần mềm");
        svCNPM.setMonKhac("Công nghệ phần mềm, Thiết kế phần mềm hướng đối tượng, Lập trình di động");

        //Sinh viên chuyên ngành mạng và an ninh mạng
        SVCNTT svANM = svCNTT.clone();
        svANM.setChuyenNganh("Mạng và an ninh mạng");
        svANM.setMonKhac("Mật mã học, Mạng máy tính nâng cao, Tấn công mạng và phòng thủ");

        //Sinh viên chuyên ngành hệ thống thông tin
        SVCNTT svHTTT = svCNTT.clone();
        svHTTT.setChuyenNganh("Hệ thống thông tin");
        svHTTT.setMonKhac("Phân tích và thiết kế hệ thống thông tin, Nhập môn dữ liệu lớn, Khai phá dữ liệu");

        //Tạo ra các sinh viên chuyên ngành công nghệ phần mềm
        SVCNTT svCNPM1 = svCNPM.clone();
        svCNPM1.setMssv(18110132);
        svCNPM1.setTen("Khang");

        SVCNTT svCNPM2 = svCNPM.clone();
        svCNPM2.setMssv(18110123);
        svCNPM2.setTen("Tường");

        //Tạo ra các sinh viên chuyên ngành mạng và an ninh mạng
        SVCNTT svANM1 = svANM.clone();
        svANM1.setMssv(18110092);
        svANM1.setTen("Công");

        SVCNTT svANM2 = svANM.clone();
        svANM2.setMssv(18110067);
        svANM2.setTen("Nhi");

        //Tạo ra các sinh viên chuyên ngành hệ thống thông tin
        SVCNTT svHTTT1 = svHTTT.clone();
        svHTTT1.setMssv(18110876);
        svHTTT1.setTen("Linh");

        SVCNTT svHTT2 = svHTTT.clone();
        svHTT2.setMssv(18110096);
        svHTT2.setTen("Thiện");


        //In tất cả sinh viên ra
        System.out.println(svANM1);
        System.out.println(svANM2);
        System.out.println(svCNPM1);
        System.out.println(svCNPM2);
        System.out.println(svHTTT1);
        System.out.println(svHTT2);
    }
}
