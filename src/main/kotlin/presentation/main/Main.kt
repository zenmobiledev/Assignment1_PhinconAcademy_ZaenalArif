package presentation.main

import presentation.feature.IncomeAndExpense
import utils.Convert
import utils.TransactionTracker

/*
* Fitur Aplikasi:
-   Input Pemasukan dan Pengeluaran: Pengguna dapat memasukan jumlah pemasukan atau pengeluaran bersama dengan keterangan.

-   Perhitungan Saldo: Aplikasi secara otomatis menghitung saldo akhir berdasarkan pemasukan dan pengeluaran.

-   Riwayat Transaksi: Menampilkan riwayat semua pemasukan dan pengeluaran.

-   Analisis Keuangan: Menampilkan jumlah total pemasukan, pengeluaran dan saldo akhir.
     */

/*
* Point Penilaian:
    1. Basic Functionality (Variables and Data Types, Aritchmetic Operations, etc): (25 point)
    2. Control Flow (IF-Else, When, Looping): (20 point)
    3. Function Definition and Utilization: (25 point)
    4. OOP Concepts (Classes, Objects, Properties, Methods): (20 point)
    5. Collection Data Management (MutableList): (10 point)
 */

fun main() {
    val uiIncomeAndExpense = IncomeAndExpense(TransactionTracker)

    do {
        /*
        UI Menu
        Personal Finance Manager Application
         */
        println("Selamat Datang di Personal Finance Manager Application\nSilakan memilih angka dari 1 sampai 5")
        println("1. Pemasukan dan Pengeluaran")
        println("2. Perhitungan Saldo")
        println("3. Riwayat Transaksi")
        println("4. Analisis Keuangan")
        println("5. Keluar")

        print("Input: ")
        val menu = Convert.stringToInt()

        when (menu) {
            1 -> uiIncomeAndExpense.featureIncomeAndExpense()

            2 -> {
                println("UI Perhitungan Saldo")
            }

            3 -> {
                println("UI Riwayat Transaksi")
            }

            4 -> {
                println("UI Analisis Keuangan")
            }

            5 -> {
                println("Keluar Aplikasi.....\nTerima Kasih :)")
                break
            }

            else -> {
                println("Angka yang anda input tidak di ketahui")
                break
            }
        }
    } while (menu != 5)
}