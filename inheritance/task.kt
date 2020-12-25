package inheritance

fun main() {

    val indra = Mahasiswa()
        indra.nama = "Indra Bayu Segara"
        indra.alamat = "jln.kaliurang km 16,5"
        indra.kendaraan = "motor"
        indra.perkenalan()
        indra.kendaraan()

    val bambang = smp()
        bambang.nama = "Bambang supriyadi"
        bambang.kelas = "kelas 8"
        bambang.kendaraan = "mobil"
        bambang.perkenalan()
        bambang.kendaraan2()

    val rudi = sma()
        rudi.nama = "Rudi Harnyanto"
        rudi.kelas = "Kelas 12"
        rudi.jurusan = "IPA"
        rudi.kendaraan = "motor"
        rudi.perkenalan()
        rudi.kendaraan3()

    val budi = sd()
        budi.nama = "Budi utomo"
        budi.kelas = "kelas 6 "
        budi.perkenalan()

    val binatang = animal()
        binatang.nama = "sapi"
        binatang.jeniskelamin = "betina"
        binatang.hidup = "tempat yang memiliki padang rumput yang luas"
        binatang.makan = "rumput"
        binatang.hewan()

    val agus = ortu()
        agus.nama = "Agus Setyo"
        agus.alamat = "cepit harjobinangun"
        agus.umur = 55
        agus.kerja = "herbalis"
        agus.perkenalan()

    val cukil = teman()
        cukil.nama = "toni dipanggil cukil"
        cukil.tinggi = 169
        cukil.karakter = "humoris"
        cukil.perkenalan()

    val indra1 = tongkrongan()
    indra1.tempat = "oksigen coffee"
    indra1.harga = "terhitung murah"
    indra1.pelayanan = "bagus sekali"
    indra1.kondisi()



}