package UnitedHome;

import CommonAPI.CommonAPPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitedHomePage extends CommonAPPI {
    public void checkTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Health Insurance Plans for Individuals & Families, Employers, Medicare | UnitedHealthcare");
    }
}
