package ThuVien

class Sach(){
    private var tenSach: String=""
    private var maSach: String=""

    fun thongTinSach(){
        println("Nhap ten sach: ")
        var tenSach= readLine()

        println("Nhap ma sach: ")
        var maSach= readLine()
    }

    fun xuatThongTinSach(){
        println("Ten sach: "+ tenSach)
        println("Ma sach: "+ maSach)
    }
}