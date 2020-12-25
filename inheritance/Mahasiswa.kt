package inheritance

open class Mahasiswa : kendaraan() {
    var nama: String = ""
    var alamat: String = ""

    fun perkenalan() {
        println("nama saya adalah $nama dan alamat saya di $alamat")
    }
}