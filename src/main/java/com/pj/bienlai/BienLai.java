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
public class BienLai {
    private final String thongTinHo;
    private final int soCu;
    private final int soMoi;
    private final int phaiTra;
    
    public BienLai(String tth, int cu, int moi, int tra) {
        this.thongTinHo = tth;
        this.soCu = cu;
        this.soMoi = moi;
        this.phaiTra = tra;
    }
    
    public String getThongTinHo() {
        return thongTinHo;
    }

    public int getSoCu() {
        return soCu;
    }

    public int getSoMoi() {
        return soMoi;
    }

    public int getPhaiTra() {
        return phaiTra;
    }
    
    public static void saveList(String path, LinkedList<Object[]> objs) throws IOException {
        File f = new File(path);
        if(!f.exists()) f.createNewFile();
        String content = "";
        for(Object[] obj: objs) {
            content += String.format("%s\t\t%s\t\t%s\t\t%s\n", obj[0].toString(), obj[3].toString(), obj[4].toString(), obj[5].toString());
        }

        try (FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s\t\t%d\t\t%d\t\t%d\n", this.thongTinHo, this.soCu, this.soMoi, this.phaiTra);
    }
}
