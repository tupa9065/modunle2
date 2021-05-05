import java.util.ArrayList;

public class QuanLy {
    private ArrayList<TaiLieu> taiLieus = new ArrayList<>();

    public ArrayList<TaiLieu> getTaiLieus() {
        return taiLieus;
    }

    public void setTaiLieus(ArrayList<TaiLieu> taiLieus) {
        this.taiLieus = taiLieus;
    }

    public QuanLy() {
    }

    public void add5TaiLieu() {
        TaiLieu taiLieu1 = new TaiLieu(1, "cuc hoa mi", 1);
        TaiLieu taiLieu2 = new TaiLieu(2, "bao dom", 1);
        Sach taiLieu3 = new Sach(3, "ao lang", 1,"Nam",100);
        TapChi taiLieu4= new TapChi(4,"dd",1,102,12);
        Bao tailieu5 = new Bao(5,"ee",1,120421);
        taiLieus.add(taiLieu1);
        taiLieus.add(taiLieu3);
        taiLieus.add(taiLieu2);
        taiLieus.add(tailieu5);
        taiLieus.add(taiLieu4);
    }

    public void addSach() {
        Sach sach = new Sach();
        sach.inserInfoSach();
        taiLieus.add(sach);
    }

    public void addTapChi() {
        TapChi tapChi = new TapChi();
        tapChi.inserInfoTapChi();
        taiLieus.add(tapChi);
    }

    public void addBao() {
        Bao bao = new Bao();
        bao.inserInfoBao();
        taiLieus.add(bao);
    }

    public boolean deleteTaiLieu(TaiLieu taiLieu) {
        return taiLieus.remove(taiLieu);
    }

    public void editTaiLieu(TaiLieu taiLieu) {
        if (taiLieu instanceof Sach) {
            ((Sach) taiLieu).inserInfoSach();
        }
        if (taiLieu instanceof TapChi) {
            ((TapChi) taiLieu).inserInfoTapChi();
        }
        if (taiLieu instanceof Bao) {
            ((Bao) taiLieu).inserInfoBao();
        }
    }

    public ArrayList<TaiLieu> searchByLoai(String loai) {
        ArrayList<TaiLieu> newTaiLieus = new ArrayList<>();
        for (TaiLieu taiLieu : taiLieus) {
            if (taiLieu.loai.equals(loai)) {
                newTaiLieus.add(taiLieu);
            }
        }
        return newTaiLieus;
    }

    public void showTailieus(ArrayList<TaiLieu> newTaiLieu) {
        System.out.println("============= tai lieu list ===============");
        for (TaiLieu taiLieu : newTaiLieu
        ) {
            System.out.println(taiLieu);
        }
    }

    public int searchByID(int id, ArrayList<TaiLieu> taiLieus) {
        int middle;
        int left = 0;
        int right = taiLieus.size() - 1;
        while (left <= right) {
            middle = (left + right) / 2;
            if (taiLieus.get(middle).getId() == id) {
                return middle;
            }
            if (id > taiLieus.get(middle).getId()) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public ArrayList<TaiLieu> softByID(ArrayList<TaiLieu> newTailieu) {
        for (int i = 1; i < newTailieu.size(); i++) {
            TaiLieu temp = newTailieu.get(i);
            int pos = i;
            while (pos > 0 && temp.getId() < newTailieu.get(pos - 1).getId()) {
                newTailieu.set(pos, newTailieu.get(pos - 1));
                pos--;
            }
            newTailieu.set(pos, temp);
        }
        return newTailieu;
    }

    public ArrayList<TaiLieu> softByNXB(ArrayList<TaiLieu> newTailieu) {
        for (int i = 1; i < newTailieu.size(); i++) {
            TaiLieu temp = newTailieu.get(i);
            int pos = i;
            while (pos > 0 && temp.getNameNXB().charAt(0) < newTailieu.get(pos - 1).getNameNXB().charAt(0)) {
                newTailieu.set(pos, newTailieu.get(pos - 1));
                pos--;
            }
            newTailieu.set(pos, temp);
        }
        return newTailieu;
    }

}
