import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        /**
         * ClassPathXmlApplicationContext komutu ile sadece resources klasörü altındaki xml congif dosyasına bakıyoruz.
         * Eğer Xml dosyası resources altında olmasa hata alırdık.
         * Xml dosyasını resources altında tutmayacak isek " FileSystemXmlApplicationContext " komutu kullanabiliriz.
         */

        /**
         * Market classından new keyword'ü ile nesne oluşturmadık bu işlemi ClassPathXmlApplicationContext yada FileSystemXmlApplicationContext
         * ile komutları ile yaptık. Artık o nesnenin kontrolünü spring bean tarafında yapılmaktadır.
         * Bu yapıya " Ioc(Inversition of Control) " denir.
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Market mrk = (Market) context.getBean("market");

        mrk.itemInfo();
        String marketDeteils = mrk.toString();
        System.out.println(marketDeteils);

        ((ClassPathXmlApplicationContext) context).close();

        /**
         * ((ClassPathXmlApplicationContext) context).close(); komutu ile oluşturulan contexti yapattık.
         */
    }
}
