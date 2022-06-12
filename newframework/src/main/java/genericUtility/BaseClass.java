package genericUtility;
import org.testng.annotations.*;

public class BaseClass {

	@BeforeSuite(groups= {"regression","smoke"})
	public void bsconfig()
	{
		System.out.println("start database");
	}
	@Parameters("browser")
	
	@BeforeClass(groups= {"regression","smoke"})
	public void bclassconfig(String browser)
	{
		System.out.println("start"+browser+" browser");
}
	@BeforeMethod(groups= {"regression","smoke"})
	public void bmethodconfig()
	{
		System.out.println("start login");
	}
	@AfterMethod(groups= {"regression","smoke"})
	public void AfterMetthod()
{
	System.out.println("close aplication");
}

	@AfterClass(groups= {"regression","smoke"})
	public void classconfig()
	{
		System.out.println("start browser");
}
@AfterSuite(groups= {"regression","smoke"})
public void  classAfter()
{
	System.out.println("close database");
}
}
