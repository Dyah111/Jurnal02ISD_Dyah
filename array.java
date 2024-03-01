import java.util.*;

public class array<T> {
    ArrayList<T> list = new ArrayList<T>();

    public void addData(T data) {
        list.add(data);
    }

    public void printData() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void removeData(Bag data) {
        int index = -1;
        for (T x : list) {
            if (((Bag) x).getKode().equals(((Bag) data).getKode())) {
                index++;
            }
        }
        list.remove(index);
    }

    public void editData(T objek1, T objek2) {
        if (objek1 instanceof ATK) {

        }
        for (T x : list) {
            if (((ATK) x).getKode().equals(((ATK) objek1).getKode())) {
                list.set(list.indexOf(x), objek2);
            }
        }
    }
}