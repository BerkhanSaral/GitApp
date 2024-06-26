package Proje_New_Update_Warehouse;

import java.util.List;
import java.util.Map;

public class InsideOf {
    protected Map<String, Newmethod.Shirt> shirts; // Gömlekleri saklamak için harita
    protected List<Integer> shelves; // Rafları saklamak için liste


    public InsideOf(Map<String, Newmethod.Shirt> shirts, List<Integer> shelves) {
        this.shirts = shirts;
        this.shelves = shelves;
    }

    // Gömlek işlemleri
    public void addShirt(Newmethod.Shirt shirt) {
        shirts.put(shirt.getId(), shirt);
    }

    public void removeShirt(String shirtId) {
        shirts.remove(shirtId);
    }

    public Map<String, Newmethod.Shirt> getShirts() {
        return shirts;
    }

    public int getShirtCount() {
        return shirts.size();
    }

    // Raf işlemleri
    public void addShelf( int shelf) {
        shelves.add(shelf);
    }

    public void removeShelf(int shelf) {
        shelves.remove(shelf);
    }

    public int getShelfCount() {
        return shelves.size();
    }

    // Diğer işlevler: gömlekleri listeleme, raf kapasitesi kontrolü, vs.

    @Override
    public String toString() {
        return "Warehouse{" +
                "shirts=" + shirts +
                ", shelves=" + shelves +
                '}';
    }
}
