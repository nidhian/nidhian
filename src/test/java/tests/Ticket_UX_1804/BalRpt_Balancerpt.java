package tests.Ticket_UX_1804;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/65484291-bfa8-4f47-ba5d-72a7162e02d1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1503, profileId = 101436)
public class BalRpt_Balancerpt extends TestBase
{
    
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    
    @Test  (groups= {"Bal_Rpt","Bal_Rpt - Balance_rpt"})
    @TestModellerPath(guid = "eba9ae2a-7325-424e-884f-04bb433ff8a7")
    public void GoToUrlClickBalanceReportPositiveSelectAsofPositiveEnterAsofDateToClickUpdatebtnbalanceClickCa() throws InvalidFormatException, InterruptedException, IOException
    {
        

    	sTestCaseID="Report_Balance_Sheet";
       	Sheet="UX1804";
        data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
        pages.nlogin _nlogin = new pages.nlogin(driver);
        
        //pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
//    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//    _AgentSearch.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
 
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    
    
pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    
    pages.UX1804.addashboard_Report_balance _balance2 = new pages.UX1804.addashboard_Report_balance(driver);
//   TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
//   _balance.GoToUrl();
//    	
    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance2.Select_ctl00ddlFinancialYear("Jan 2021- Dec 2021");
    
   TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
  _balance2.Click_Reports_dash();
    
    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance2.Select_reports_dash();
    	
        pages.UX1804.balance _balance = new pages.UX1804.balance(driver);
//    TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
//    _balance.GoToUrl();
    
    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _balance.Click_Reports_menu2();

    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance.Click_Balance_Report();
    

//    TestModellerLogger.SetLastNodeGuid("bd3e9df8-df04-45c0-923d-8838e9bcd4c8");
//    _balance.Select_Asof(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("3cc77d0d-68eb-4ad8-bff0-91a28b24da52");
    _balance.Enter_Asof_DateTo(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("787031b5-dae9-47e0-9c7d-283c276495ac");
    _balance.Click_Update_btn_balance();
    

//    TestModellerLogger.SetLastNodeGuid("3c4e88fa-91e9-4925-ba14-6d770038e67d");
//    _balance.Click_Capital_Reserveamt();
    

    }
}
/*
    		

    @Test  (groups= {"Bal_Rpt","Bal_Rpt - Balance_rpt"})
    @TestModellerPath(guid = "76a824b0-12ac-468a-ae40-47ad847b00e6")
    public void GoToUrlClickBalanceReportPositiveSelectAsofPositiveEnterAsofDateToClickUpdatebtnbalanceClickCa1()
    {
        
        pages.balance _balance = new pages.balance(driver);
    TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
    _balance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance.Click_Balance_Report();
    

    TestModellerLogger.SetLastNodeGuid("bd3e9df8-df04-45c0-923d-8838e9bcd4c8");
    _balance.Select_Asof("End of This Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("3cc77d0d-68eb-4ad8-bff0-91a28b24da52");
    _balance.Enter_Asof_DateTo("2020-12-13 19:14:04");
    

    TestModellerLogger.SetLastNodeGuid("787031b5-dae9-47e0-9c7d-283c276495ac");
    _balance.Click_Update_btn_balance();
    

    TestModellerLogger.SetLastNodeGuid("3c4e88fa-91e9-4925-ba14-6d770038e67d");
    _balance.Click_Capital_Reserveamt();
    

    }

    @Test  (groups= {"Bal_Rpt","Bal_Rpt - Balance_rpt"})
    @TestModellerPath(guid = "90a3923a-805f-4773-9d38-6d501d271c27")
    public void GoToUrlClickBalanceReportPositiveSelectAsofPositiveEnterAsofDateToClickUpdatebtnbalanceClickCa2()
    {
        
        pages.balance _balance = new pages.balance(driver);
    TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
    _balance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance.Click_Balance_Report();
    

    TestModellerLogger.SetLastNodeGuid("bd3e9df8-df04-45c0-923d-8838e9bcd4c8");
    _balance.Select_Asof("End of This Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("3cc77d0d-68eb-4ad8-bff0-91a28b24da52");
    _balance.Enter_Asof_DateTo("2021-09-07 04:26:06");
    

    TestModellerLogger.SetLastNodeGuid("787031b5-dae9-47e0-9c7d-283c276495ac");
    _balance.Click_Update_btn_balance();
    

    TestModellerLogger.SetLastNodeGuid("3c4e88fa-91e9-4925-ba14-6d770038e67d");
    _balance.Click_Capital_Reserveamt();
    

    }

    @Test  (groups= {"Bal_Rpt","Bal_Rpt - Balance_rpt"})
    @TestModellerPath(guid = "dc09032a-0d03-4b09-a992-f9b04710b498")
    public void GoToUrlClickBalanceReportPositiveSelectAsofPositiveEnterAsofDateToClickUpdatebtnbalanceClickCa3()
    {
        
        pages.balance _balance = new pages.balance(driver);
    TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
    _balance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance.Click_Balance_Report();
    

    TestModellerLogger.SetLastNodeGuid("bd3e9df8-df04-45c0-923d-8838e9bcd4c8");
    _balance.Select_Asof("Today");
    

    TestModellerLogger.SetLastNodeGuid("3cc77d0d-68eb-4ad8-bff0-91a28b24da52");
    _balance.Enter_Asof_DateTo("44337");
    

    TestModellerLogger.SetLastNodeGuid("787031b5-dae9-47e0-9c7d-283c276495ac");
    _balance.Click_Update_btn_balance();
    

    TestModellerLogger.SetLastNodeGuid("3c4e88fa-91e9-4925-ba14-6d770038e67d");
    _balance.Click_Capital_Reserveamt();
    

    }

    @Test  (groups= {"Bal_Rpt","Bal_Rpt - Balance_rpt"})
    @TestModellerPath(guid = "9e314366-4b8d-4ae8-8138-9cab67da62c6")
    public void GoToUrlClickBalanceReportPositiveSelectAsofPositiveEnterAsofDateToClickUpdatebtnbalanceClickCa4()
    {
        
        pages.balance _balance = new pages.balance(driver);
    TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
    _balance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance.Click_Balance_Report();
    

    TestModellerLogger.SetLastNodeGuid("bd3e9df8-df04-45c0-923d-8838e9bcd4c8");
    _balance.Select_Asof("End of Last Month");
    

    TestModellerLogger.SetLastNodeGuid("3cc77d0d-68eb-4ad8-bff0-91a28b24da52");
    _balance.Enter_Asof_DateTo("44337");
    

    TestModellerLogger.SetLastNodeGuid("787031b5-dae9-47e0-9c7d-283c276495ac");
    _balance.Click_Update_btn_balance();
    

    TestModellerLogger.SetLastNodeGuid("3c4e88fa-91e9-4925-ba14-6d770038e67d");
    _balance.Click_Capital_Reserveamt();
    

    }

    @Test  (groups= {"Bal_Rpt","Bal_Rpt - Balance_rpt"})
    @TestModellerPath(guid = "49da6332-f721-4952-900b-2f0fddabdeb4")
    public void GoToUrlClickBalanceReportPositiveSelectAsofPositiveEnterAsofDateToClickUpdatebtnbalanceClickCa5()
    {
        
        pages.balance _balance = new pages.balance(driver);
    TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
    _balance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance.Click_Balance_Report();
    

    TestModellerLogger.SetLastNodeGuid("bd3e9df8-df04-45c0-923d-8838e9bcd4c8");
    _balance.Select_Asof("End of Last Quarter");
    

    TestModellerLogger.SetLastNodeGuid("3cc77d0d-68eb-4ad8-bff0-91a28b24da52");
    _balance.Enter_Asof_DateTo("44337");
    

    TestModellerLogger.SetLastNodeGuid("787031b5-dae9-47e0-9c7d-283c276495ac");
    _balance.Click_Update_btn_balance();
    

    TestModellerLogger.SetLastNodeGuid("3c4e88fa-91e9-4925-ba14-6d770038e67d");
    _balance.Click_Capital_Reserveamt();
    

    }

    @Test  (groups= {"Bal_Rpt","Bal_Rpt - Balance_rpt"})
    @TestModellerPath(guid = "045334da-a6a3-402a-8976-029c693057ce")
    public void GoToUrlClickBalanceReportPositiveSelectAsofPositiveEnterAsofDateToClickUpdatebtnbalanceClickCa6()
    {
        
        pages.balance _balance = new pages.balance(driver);
    TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
    _balance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance.Click_Balance_Report();
    

    TestModellerLogger.SetLastNodeGuid("bd3e9df8-df04-45c0-923d-8838e9bcd4c8");
    _balance.Select_Asof("End of Last Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("3cc77d0d-68eb-4ad8-bff0-91a28b24da52");
    _balance.Enter_Asof_DateTo("44337");
    

    TestModellerLogger.SetLastNodeGuid("787031b5-dae9-47e0-9c7d-283c276495ac");
    _balance.Click_Update_btn_balance();
    

    TestModellerLogger.SetLastNodeGuid("3c4e88fa-91e9-4925-ba14-6d770038e67d");
    _balance.Click_Capital_Reserveamt();
    

    }

    @Test  (groups= {"Bal_Rpt","Bal_Rpt - Balance_rpt"})
    @TestModellerPath(guid = "68a48e4f-8c9c-41a1-a445-f7fe7be2e061")
    public void GoToUrlClickBalanceReportPositiveSelectAsofPositiveEnterAsofDateToClickUpdatebtnbalanceClickCa7()
    {
        
        pages.balance _balance = new pages.balance(driver);
    TestModellerLogger.SetLastNodeGuid("8cd16e74-a60a-499e-ac92-6d89a76f8446");
    _balance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b5e9013-d457-4096-ba0b-ed57fa1a0516");
    _balance.Click_Balance_Report();
    

    TestModellerLogger.SetLastNodeGuid("bd3e9df8-df04-45c0-923d-8838e9bcd4c8");
    _balance.Select_Asof("Custom");
    

    TestModellerLogger.SetLastNodeGuid("3cc77d0d-68eb-4ad8-bff0-91a28b24da52");
    _balance.Enter_Asof_DateTo("44337");
    

    TestModellerLogger.SetLastNodeGuid("787031b5-dae9-47e0-9c7d-283c276495ac");
    _balance.Click_Update_btn_balance();
    

    TestModellerLogger.SetLastNodeGuid("3c4e88fa-91e9-4925-ba14-6d770038e67d");
    _balance.Click_Capital_Reserveamt();
    

    }

}*/