package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keluaran;

        if (input.equals("")) {
            System.out.println("Berikan Kembali inputan Infix !");
        } else {
            OperasiHitung theTrans = new OperasiHitung(input.next());
            keluaran = theTrans.doTrans();
            System.out.println(keluaran);
        }
    }
}
