import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Market {
    private String marketName;
    private int dailyTotalCash;

    public Market(String marketName, int dailyTotalCash) {
        /**
         1-) <constructor-arg value="BİM" ></constructor-arg>
         2-) <constructor-arg value="12450" index="1" ></constructor-arg>
         3-) <constructor-arg value="12450" name="dailyTotalCash" ></constructor-arg>
         yukarıdaki iki xml cümleciğide constructor'ın aldığı parametrelerin xml deki tanımlanma biçimidir.
         Constructor aldığı paramtre sırasına göre xml deki tanımlama işlemi yapılmalıdır yoksa exception fırşatılır.
         Bu tanımlama şekillerini özelleştirmek için index, name vb özellikler kullanıla bilir. Örnek 2. ve 3. tanımlamalar.
         */
        this.marketName = marketName;
        this.dailyTotalCash = dailyTotalCash;
    }

    @Bean
    public void itemInfo() {
        System.out.println("Elma = 5 TL");
        System.out.println("Ekmek = 1 TL");
        System.out.println("Zeytin = 12 TL");
        System.out.println("Yumurta Adt = 0.75 TL");
    }

    @Override
    public String toString() {
        return "Market{" +
                "marketName='" + marketName + '\'' + '\n' +
                "dailyTotalCash=" + dailyTotalCash +
                '}';
    }
}
