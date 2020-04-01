package ThuVien

fun main ()
{
    println("Nhap so luong khach muon sach: ")
    var n: Int=0
    var n = readLine()

    var List: ArrayList<ThuVien> = ArrayList()
    for (i in 1..n){
        var person: ThuVien= ThuVien()
        println("Nhap thong tin khach: ")
        person.xuLi()
        List.add(person)
    }

    for (i in 0..List.size-1){
        println("Hien thi thong tin khach: ")
        List.get(i).xuatThongTin()
    }
}