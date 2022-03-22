package smoke;

import org.testng.annotations.Test;

public class Test2 {


    @Test (groups = {"smokeTest", "regress"})
    public void Test2(){
        System.out.println("smoke.Test2");
    }
}
