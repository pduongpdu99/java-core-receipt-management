/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pj.bienlai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author pduon
 */
public class KhachHang {
    private final String hoTen;
    private final int soNha;
    private final int maCongToDien;
    
    public KhachHang(String hoTen, int soNha, int maCongToDien) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongToDien = maCongToDien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public int getMaCongToDien() {
        return maCongToDien;
    }
    
    public static void saveList(String path, LinkedList<Object[]> objs) throws IOException {
        File f = new File(path);
        if(!f.exists()) f.createNewFile();
        String content = "";
        for(Object[] obj: objs) {
            content += String.format("%s\t\t%s\t\t%s\n", obj[0].toString(), obj[1].toString(), obj[2].toString());
        }

        try (FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
        }
    }

    @Override
    public String toString() {
        return String.format("%s\t\t%d\t\t%d\n", this.hoTen, this.soNha, this.maCongToDien);
    }
}
