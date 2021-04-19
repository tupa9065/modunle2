package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QLCB {
    ArrayList<Canbo> canbos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void  insertCongNhan(){
        CongNhan congNhan= new CongNhan();
        congNhan.insertInfoCanBo();
        System.out.println("Level");
        congNhan.setLevel(scanner.nextInt());
        scanner.nextLine();
        canbos.add(congNhan);
    }
    public void  insertKySu(){
        KySu kySu= new KySu();
        kySu.insertInfoCanBo();
        System.out.println("specialized");
        kySu.setSpecialized(scanner.nextLine());
        canbos.add(kySu);
    }
    public void  insertNhanVien(){
        NhanVien nhanVien= new NhanVien();
        nhanVien.insertInfoCanBo();
        System.out.println("specialized");
        nhanVien.setJob(scanner.nextLine());
        canbos.add(nhanVien);
    }
    public ArrayList<Canbo> searchByName(String name){
        ArrayList<Canbo> newCanBo = new ArrayList<>();
        for (Canbo canbo:canbos) {
            if(canbo.getName().equals(name)){
                newCanBo.add(canbo);
            }
        }
        return newCanBo;
    }
    public void displayByName(String name){
        ArrayList<Canbo> newCanBo = searchByName(name);
        System.out.println(newCanBo);
    }
}
