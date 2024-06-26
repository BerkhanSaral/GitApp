package Proje_DepoUygulamasi;
import java.util.HashMap;
import java.util.Map;
public class Product_And_Information {

    // Bedenlere ait ID sayaçları
    static Map<Size, Integer> idCounters = new HashMap<>();

    static {
        // Başlangıçta her beden için ID sayaçlarını başlatma
        idCounters.put(Size.S, 65542);
        idCounters.put(Size.M, 75465);
        idCounters.put(Size.L, 91876);
    }

    public enum Size {
        S, M, L
    }

    public static class Shirt {

        protected String shirt;
        protected Size size;
        protected String companyUS;
        protected String id;
        protected double price;

        public Shirt(String shirt, Size size, String companyUS, double price) {
            this.shirt = shirt;
            this.size = size;
            this.companyUS = companyUS;
            this.id = generateId(size); // Bedene özel benzersiz ID oluşturuluyor
            this.price = price;
        }

        private String generateId(Size size) {
            int idNumber = idCounters.get(size); // İlgili beden için mevcut sayaç değeri alınıyor
            idCounters.put(size, idNumber + 1); // Sayaç değeri bir artırılıyor

            return size.toString() + idNumber; // Beden tipi ve ardışık numara birleştirilerek ID oluşturuluyor
        }

        public String getShirt() {
            return shirt;
        }

        public double getPrice() {
            return price;
        }

        public Size getSize() {
            return size;
        }

        public String getCompanyUS() {
            return companyUS;
        }

        public String getId() {
            return id;
        }

        public void printDetails() {
            System.out.println("Company Name : " + getCompanyUS() + ", Product's Name : " + getShirt() + " Size : " + getSize() + " \n ID: " + getId() + "  => Price in Euro : " + getPrice());
        }
    }
}
