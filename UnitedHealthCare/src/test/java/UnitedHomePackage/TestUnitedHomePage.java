package UnitedHomePackage;

import CommonAPI.CommonAPPI;
import UnitedHome.UnitedHomePage;
import org.testng.annotations.Test;

public class TestUnitedHomePage extends CommonAPPI {
    @Test
    public void searchBoxTest(){
        typeOnSearchBox("//input[@id='q']","jobs");
    }
}
