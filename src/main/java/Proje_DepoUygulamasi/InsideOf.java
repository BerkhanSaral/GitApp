package Proje_DepoUygulamasi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class InsideOf extends Product_And_Information {

    protected Map<String, Product_And_Information.Shirt> shirts; // Gömlekleri saklamak için harita
    protected List<Integer> shelves; // Rafları saklamak için liste
    protected Map<Integer, String> shelfToShirtMap; // Raf ve gömlek eşleştirmesini saklamak için harita

    public InsideOf(Map<String, Product_And_Information.Shirt> shirts, List<Integer> shelves) {
        this.shirts = shirts;
        this.shelves = shelves;
        this.shelfToShirtMap = new HashMap<>();
    }

    // Gömlek işlemleri
    public void addShirt(Product_And_Information.Shirt shirt) {
        shirts.put(shirt.getId(), shirt);
    }

    public void removeShirt(String shirtId) {
        shirts.remove(shirtId);
    }

    public Map<String, Product_And_Information.Shirt> getShirts() {
        return shirts;
    }

    public int getShirtSize() {
        return shirts.size();
    }

    // Raf işlemleri
    public void addShelf(int shelf) {
        shelves.add(shelf);
    }

    public void removeShelf(int shelf) {
        shelves.remove(Integer.valueOf(shelf));
        shelfToShirtMap.remove(shelf); // Raf çıkarılırken eşleştirmeyi de kaldır
    }

    public int getShelfCount() {
        return shelves.size();
    }

    // Gömleği rafa yerleştirme
    public void placeShirtOnShelf(String shirtId, int shelf) {
        if (shirts.containsKey(shirtId) && shelves.contains(shelf)) {
            shelfToShirtMap.put(shelf, shirtId);
        } else {
            System.out.println("Gömlek ID'si veya raf numarası geçersiz.");
        }
    }

    public Map<Integer, String> getShelfToShirtMap() {
        return shelfToShirtMap;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "shirts=" + shirts +
                ", shelves=" + shelves +
                ", shelfToShirtMap=" + shelfToShirtMap +
                '}';
    }
}

