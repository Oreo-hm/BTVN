package ThuVien

class Nguoi{
    private var hoTen: String = ""
    private var ngaySinh: String = ""
    private var soDienThoai: String = ""
    private var diaChi: String = ""

    fun thongTinNguoiMuon(){
        println("Nhap ho ten nguoi doc: ")
        var hoTen= readLine()

        println("Nhap ngay sinh: ")
        var ngaySinh= readLine()

        println("Nhap so dien thoai: ")
        var soDienThoai= readLine()

        println("Nhap dia chi: ")
        var diaChi= readLine()
    }
    fun xuatThongTinNguoiMuon(){
        println("Ho va ten: "+ hoTen)
        println("Ngay sinh: "+ ngaySinh)
        println("So dien thoai: "+ soDienThoai)
        println("Dia chi: "+ diaChi)
    }
}