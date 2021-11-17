package tests_311NotinUse;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/71d71064-9d87-4828-a2d0-7f38c5d1be86
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1841, profileId = 102363)
public class trialbalance_TRBALANKCE extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
    @Test  (groups= {"trialbalance","trialbalance - TRBALANKCE"})
    @TestModellerPath(guid = "7517827a-0cd9-40cd-9eb5-888089f12589")
    public void GoToUrlClickAdvisortl1ClickTrialbalanceEntry2PositiveEnterctl00cPHFileUploadcsv1ClickUploadbutt() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="TC45";
      	Sheet="Banking";
       data = ExcelData.toReadExcelData(sTestCaseID,Sheet);
       pages.nlogin _nlogin = new pages.nlogin(driver);
       
       TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
       _nlogin.GoToUrl();
       


       TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
       _nlogin.Enter_nLOGIN(data[1]);
       

       TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
       _nlogin.Enter_nPASS(data[2]);
       

       TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
       _nlogin.Click_Login();
       

   pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);


       TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
       _AgentSearch.Click_Agents();
       

       TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
       _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
       

       TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
       _AgentSearch.Click_Search();
       

       TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
       _AgentSearch.Click__Nidhi1_();
       

   pages.Searchclient _Searchclient = new pages.Searchclient(driver);

   //
//       TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//       _Searchclient.AssertUrl();
       

       TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
       _Searchclient.Click__Clients_();
       

       TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
       _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
       

       TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
       _Searchclient.Click_Searchbtn();
       

       TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
       _Searchclient.Click__NidhiEnt();
    	   
    	pages.SM311.trialbalance _trialbalance = new	pages.SM311.trialbalance(driver);
//    TestModellerLogger.SetLastNodeGuid("7d054288-4841-40fa-9015-ca89cacca609");
//    _trialbalance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb3a96ad-4aff-4897-ada8-e5acd26714df");
    _trialbalance.Click_Advisortl1();
    

    TestModellerLogger.SetLastNodeGuid("f1c47465-f246-4ca9-af81-46a8071d9c28");
    _trialbalance.Click_TrialbalanceEntry2();
    

    TestModellerLogger.SetLastNodeGuid("c30deb0c-17fe-4fdb-bdd5-91a12642dde5");
    _trialbalance.Enter_ctl00cPHFileUpload_csv1("D:\\TestModeller-JavaSeleniumFramework-master\\UploadCSVdownload\\BankTransactionUploadSample4.csv");
    

    TestModellerLogger.SetLastNodeGuid("004283af-9996-45c4-b995-c041e7403883");
    _trialbalance.Click_Upload_button3();
    
    }
}