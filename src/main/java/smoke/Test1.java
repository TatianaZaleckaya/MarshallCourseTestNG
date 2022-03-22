package smoke;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test1 {

    //возвращает массив массивов из объекта
    @DataProvider(name = "db")
    public static Object[][] dbData () {
        return new Object[][]{
                {"SQL", new Integer(1)},
                {"NOSQL", new Integer(2)}
        };
    }





    @Parameters({"db"})
    //параметеризированные тесты. прописываем в хмл
    @Test  (dataProvider = "db")
    public void test1(String e1, int e2) {
        System.out.println("smoke.Test1 " + e1 + "" + e2 );
    }

    @Test(groups = {"regress"})
    public void test11() {
        System.out.println("smoke.Test1");
    }

    @Test(groups = {"smokeTest"})
    public void test111() {
        System.out.println("smoke.Test111");
    }
}
