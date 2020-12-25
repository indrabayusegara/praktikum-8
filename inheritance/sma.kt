package inheritance

class sma : kendaraan() {
    var nama: String = ""
    var kelas: String = ""
    var jurusan: String = ""

    fun perkenalan() {
        println("nama saya adalah $nama dan saya adalah berada di $kelas, jurusan yang saya ambil adalah $jurusan")
    }
}