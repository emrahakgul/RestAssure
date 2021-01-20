import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ZippoTest222 {

    @Test
    public void test()
    {
        given() // balagıç ayarları (setup) işlemleri
                .when()  // aksiyon kısmı
                .then(); // test kısmı
    }

    @Test
    public void statusCodeTest()
    {
        given()

                .when()
                .get("http://api.zippopotam.us/us/90210")

                .then()
                .log().all()
                .statusCode(200)
        ;
    }
    @Test
    public void contentTypeTest()
    {
        given()

                .when()
                .get("http://api.zippopotam.us/us/90210")

                .then()
                .log().body()
                .contentType(ContentType.JSON)
        ;
    }


}
