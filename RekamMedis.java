import java.util.ArrayList;
import java.util.List;

public class RekamMedis {
    private List<String> catatan;

    public RekamMedis() {
        this.catatan = new ArrayList<>();
    }

    public void tambahCatatan(String catatan) {
        this.catatan.add(catatan);
    }

    public List<String> getCatatan() {
        return catatan;
    }

    @Override
    public String toString() {
        return "RekamMedis" + catatan;
    }
}
