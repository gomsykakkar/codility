package tests.responsivefight;

import java.net.UnknownHostException;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.gaurav.responsivefight.pages.Bus;
import com.gaurav.responsivefight.pages.Covid;
import com.gaurav.responsivefight.pages.Leaderboard;
import com.gaurav.responsivefight.pages.RF_Landing;

import tests.common.Web_TestBase;

public class busChallenge extends Web_TestBase  {
	String user="";

	@Test
	public void startgit(ITestContext testContext) throws UnknownHostException, InterruptedException{
		// What pages are being used?
		RF_Landing landing= new RF_Landing(testContext);
		Covid covid= new Covid(testContext);
		Bus bus= new Bus(testContext);
		Leaderboard lb= new Leaderboard(testContext);
		
		//steps
		user=landing.setWarriorUsername();
		landing.verifyStartJourneyBtn(user);
		landing.startJourney();
		covid.verifyTitle(user);
		covid.takeTheBus();
		bus.startBusChallenge();
		bus.busQuestion1();
		bus.goToLeaderBoard();
		lb.getUserId(user);
		lb.verifyScore(user, 100);
	}
}
