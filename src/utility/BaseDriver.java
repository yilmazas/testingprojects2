package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

public static WebDriver driver;

 static {

    Logger logger= Logger.getLogger(""); // output'a ait bütün logları üreten objeye/servise ulaştım ""
    logger.setLevel(Level.SEVERE); // Sadece errorları göster

     // gerekmeyen loglari kaldiracagiz
    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // once ayar yapilacak sonra
    //calisacak. bu yuzden driver alt kisma yazildi. alt calisma kisminda cikan bazi seyler gitmis oldu
    driver= new ChromeDriver();

    driver.manage().window().maximize();// acilinca web sayfasini tam ekran yapiyor
    Duration dr= Duration.ofSeconds(30);
    driver.manage().timeouts().pageLoadTimeout(dr);
    // Sadece tüm sayfanın kodlarının bilgisyarınıza inmesi süresiyle ilgili
    //bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.
    // 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
    // eğer 2 sn yüklerse 30 sn. beklemez.

     driver.manage().timeouts().implicitlyWait(dr); // sayfa yuklnedi ama bazi elemanlar hzir hale gelmemis olabiliyor
    // bu elemanlarin lendine gelmesi icin biraz bekle demek icin bu kod
    // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
    // hazır hale gelmesi verilen mühlet yani süre. // eğer 2 sn yüklerse 30 sn. beklemez.


}


    public static void BekleKapat(){
    Myfunction.Bekle(3);
    driver.quit();

}
    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }

}
