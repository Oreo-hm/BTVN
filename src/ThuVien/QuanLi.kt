package ThuVien

class ThuVien(){
    private var nguoiMuon: Nguoi= Nguoi()
    private var sachMuon: Sach= Sach()
    private var soLuong: Int= 1
    private var ngayMuon: String= ""

    fun xuLi(){
        nguoiMuon.thongTinNguoiMuon()
        println("So sach muon: ")
        var soLuong= readLine()
        for(i in 1..soLuong){
            var sachMuon: Sach
            sachMuon.thongTinSach()
        }
        println("Ngay muon: ")
        var ngayMuon= readLine()
    }

    fun xuatThongTin(){
        nguoiMuon.xuatThongTinNguoiMuon()
        println("So sach muon"+ soLuong)
        for(i in 1..soLuong){
            sachMuon.xuatThongTinSach()
        }
        println("Ngay muon: "+ ngayMuon)
    }

}