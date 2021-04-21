import java.util.ArrayList;

public class QuanLy {
    private ArrayList<CanBo> canBos= new ArrayList<>();

    public ArrayList<CanBo> getCanBos() {
        return canBos;
    }

    public void add5GiaoVien(){
        GiaoVien giaoVien1= new GiaoVien("1",1991,"1",300,0,30);
        GiaoVien giaoVien2= new GiaoVien("2",1976,"2",600,30,15);
        GiaoVien giaoVien3= new GiaoVien("3",1988,"3",500,0,50);
        GiaoVien giaoVien4= new GiaoVien("4",1995,"4",300,100,0);
        GiaoVien giaoVien5= new GiaoVien("5",1991,"5",300,50,10);
        canBos.add(giaoVien1);
        canBos.add(giaoVien2);
        canBos.add(giaoVien3);
        canBos.add(giaoVien4);
        canBos.add(giaoVien5);
    }
    public void displayAllInfo(ArrayList<CanBo> canBos){
        System.out.println("================> Can Bo list <==============");

        for (CanBo canBo:canBos
             ) {
            System.out.println(canBo);
        }
    }
    public void displayCanBo(CanBo canBo){
        System.out.println("==============> "+canBo.getName()+" <=================");
        System.out.println(canBo.toString());
    }
    public void addGiaoVien(){
        GiaoVien giaoVien = new GiaoVien();
        giaoVien.insertInfoGiaoVien();
        canBos.add(giaoVien);
        displayCanBo(giaoVien);
    }
    public void addCanBo(){
        CanBo canBo = new CanBo();
        canBo.insertInfoCanBo();
        canBos.add(canBo);
        displayCanBo(canBo);
    }
    public ArrayList<CanBo> findBySalary(int x){
        ArrayList<CanBo> newCanBo= new ArrayList<>();
        for (CanBo canBo:canBos) {
            if(canBo instanceof GiaoVien){
                if (((GiaoVien) canBo).getRealSalary()>= x){
                    newCanBo.add(canBo);
                }
            }
        }
        displayAllInfo(newCanBo);
        return newCanBo;
    }
}



