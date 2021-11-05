package com.example.utssatria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.g,"","Teknologi 5G.", "Huruf G memberikan arti “Generasi” ini berarti jaringan 5G adalah jaringan yang lebih maju daripada jaringan 4G. Maju dalam konteks ini adalah kecepatan internet, bila kita menggunakan jaringan 5G berarti akan jauh lebih cepat dari jaringan 4G. Contoh paling sederhananya adalah dengan menggunakan jaringan 5G kita bisa mengunduh film dengan resolusi 4K hanya dengan waktu hitungan detik. Menurut perkiraan para ahli, jaringan 5G nantinya akan menghadirkan internet dengan kecepatan 800 Gbps atau bisa dibilang seratus kali lebih cepat dibanding generasi sebelumnya. "))

        data?.add(DataModel(R.drawable.ac,"","Ac Samsung", "Spesifikasi " +
                "Capacity" +
                "4800 Btu/hr"+"Capacity (Cooling, kW)" +
                "1.406 kW" +
                "" +
                "EER (Cooling, W/W)" +
                "4.02 W/W" +
                "" +
                "Net Dimension (Outdoor, WxHxD, ㎜*㎜*㎜)" +
                "681x285x434 mm"))

        data?.add(DataModel(R.drawable.laptop,"","Asus GL553VD", "Harga Rp15.000.000\n" +
                "SPESIFIKASI :\n" +
                "Color : Metal Black\n" +
                "Battery : 48WHrs, 4S1P, 4-cell Li-ion Battery Pack\n" +
                "Panel Size : 15.6\" FHD (1920x1080) Wide-View Anti- Glare\n" +
                "CPU.Display : Intel Core i7-7700HQ Processor 2.8 GHz (6M Cache, up to 3.8 GHz)\n" +
                "Graphics.Display : NVIDIA GTX1050 4GB DDR5\n" +
                "Display RAM : 16GB DDR4 RAM\n" +
                "Storage : 1TB HDD 7200rpm DAN 128GB SSD\n" +
                "ODD : 8 x DVD Super Multi-Dual\n" +
                "Display Bluetooth : Bluetooth 4.1\n" +
                "Webcam : HD Web Camera\n" +
                "USB Ports : USB3.1*1, USB3.0*2, USB2.0*1\n"))

        data?.add(DataModel(R.drawable.meta,"","Nama Baru Facebook", "Facebook Inc. resmi berganti nama menjadi Meta Platforms Inc. pada Jumat, 29 Oktober 2021.\n" +
                "Pendiri sekaligus CEO Facebook, Mark Zuckerberg menjelaskan, ia ingin Facebook—sebelumnya dikenal sebagai perusahaan media sosial—kini telah bergeser jadi perusahaan yang berfokus pada metaverse. \n" +
                "Sebab, perusahaannya memiliki visi masa depan menjadi perusahaan metaverse.\n" +
                "Istilah ini biasa digunakan untuk menggambarkan dunia virtual baru. Menurut Zuckerberg, metaverse bisa menjadi masa depan internet seluler yang bisa diandalkan. Sebab, selama ini manusia sudah sangat mengandalkan internet untuk berinteraksi.\n"))

        data?.add(DataModel(R.drawable.power,"","Bahasa Pemrograman Baru dari Microsoft", "Microsoft meluncurkan bahasa pemrograman low-code serbaguna baru, yang berbasis Microsoft Excel. \n" +
                "Kode pemrograman itu oleh Microsoft diberi nama PowerFx. Karena digunakan untuk low-code, atau pemrosesan yang sederhana saja, maka bahasa ini didesain secara ringkas dan sederhana agar lebih mudah digunakan oleh programer. \n" +
                "\"PowerFx adalah bahasa pemrograman untuk tujuan umum, deklaratif, dan fungsional,\" tulis Microsoft dalam laman resminya. \n" +
                "Microsoft menyebutkan bahwa bahasa pemrograman low-code ini akan menjadi ekspresi logika di seluruh platform Microsoft PowerApps, terutama saat ini tersedia di aplikasi Canvas.\n"))

        data?.add(DataModel(R.drawable.robot,"","Robot yang diberi gelar non-manusia pertama oleh PBB.", "Robot ini dikenal sebagai selebriti di dunia robot. Dibuat oleh mantan Disney Imagineer David Hanson, robot ini sebagian dimodelkan agar terlihat seperti Audrey Hepburn, dan istri pencipta.\n" +
                "Mesin cerdas ini dibangun dengan tujuan meniru perilaku manusia dan untuk menginspirasi perasaan cinta dan kasih sayang pada manusia. Menariknya, Sophia pernah dinobatkan sebagai juara Inovasi pertama Program Pembangunan Perserikatan Bangsa-Bangsa dan merupakan non-manusia pertama yang diberi gelar PBB.\n"))

        data?.add(DataModel(R.drawable.roket,"","SpaceX Luncurkan Roket Daur Ulang Pertama dalam Sejarah.", " Hampir 15 tahun setelah merevolusi cara seseorang untuk mencapai luar angkasa, perusahaan milik Elon Musk, SpaceX, sukses meluncurkan kembali roket orbital yang sebelumnya pernah dipakai untuk mendorong muatan ke luar gravitasi bumi. Setelah pendaratan di bumi, The Falcon 9 diperbaiki, direkondisi, dan disiapkan untuk peluncurannya yang kedua. Lagi-lagi, The Falcon 9 untuk kedua kalinya berhasil mendarat di bumi, di lepas pantai Floria tepatnya di tengah papan pendaratan yang ada di kapal Of Course I Still Love You."))


        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}