package POM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class PomTest {

	MyPage mypage = new MyPage();
	@Test
	public void test() {
		mypage.launchBrowser();
		mypage.login();
	}
	
//@After

//public void closetest()
//{
	//mypage.closedriver();
//}
}
