package Testrun;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.baseclass;
import Testcases.Testpage;
import util.data;

public class bankmanager extends baseclass {
	Testpage pg;
	data ex=new data();
	@BeforeSuite
	public void browser() {
		launchURL();
	}
	@Test
	public void lauchbrowser() {
		pg=new Testpage(driver);
		pg.bank();
	}
	@Test(priority=1)
	public void Newcustomer() throws IOException {
		pg=new Testpage(driver);
		pg.newcustomer(ex.get_FirstName(),ex.get_LastName(),ex.get_PostalCode());
		int accno=pg.submit();
		ex.writedata(accno);
	}

}
