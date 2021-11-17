package tests.Ticket_UX_1804;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d7b4f95c-4481-490f-bac2-e86e670ac8a3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1466, profileId = 101321)
public class dspendrec_dspenrec extends TestBase
{
	
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ds_pendrec","ds_pendrec - ds_penrec"})
    @TestModellerPath(guid = "a9660fcd-3f9b-447d-a7b6-468f78799c51")
    public void dspenrecGoToUrlAssertUrlClickPendingReceipt() throws InterruptedException, InvalidFormatException
    {
    	sTestCaseID="PendingRcpt";
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
//    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//    _Searchclient.GoToUrl();
//    
//
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
        
    	pages.UX1804.addashboard_2 _addashboard = new pages.UX1804.addashboard_2(driver);
    TestModellerLogger.SetLastNodeGuid("546c6330-3bf0-4892-bd16-b878866c7030");
    _addashboard.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("e04e8b82-3266-40c7-a9f3-9e2e4bae6300");
//    _addashboard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("599a8747-9e7b-4853-9748-8f5e71c0a8ff");
    _addashboard.Click_Pending__Receipt();
        
    
//    pages.UX1804.test4 _recipt=new pages.UX1804.test4(driver);
//    TestModellerLogger.SetLastNodeGuid("546c6330-3bf0-4892-bd16-b878866c7030");
//    _recipt.GoToUrl();
//    
//    
//   TestModellerLogger.SetLastNodeGuid("599a8747-9e7b-4853-9748-8f5e71c0a8ff");
//   _recipt.Click_Expen_leftmenu2();
//    
//    TestModellerLogger.SetLastNodeGuid("599a8747-9e7b-4853-9748-8f5e71c0a8ff");
//    _recipt.Click_New_btn2();
//    
//    
//    TestModellerLogger.SetLastNodeGuid("599a8747-9e7b-4853-9748-8f5e71c0a8ff");
//    _recipt.Click_UnprocessedReceipts2();
    
       
    

    }

}