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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3a3958ff-a55c-42ce-a670-80332b652b0a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1462, profileId = 101327)
public class Verify_Bankname extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ds_Adbnk","ds_Adbnk - ds_banking"})
    @TestModellerPath(guid = "f7e654ad-065c-453c-a51d-ffefe43c7ede")
    public void dsbankingGoToUrlAssertUrlClickBankingdashPositiveSelectbnkselectiondash1() throws InvalidFormatException, InterruptedException, IOException
    {
        
    	sTestCaseID="Verifybankname";
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
    
      pages.UX1804.bank_dropdown _addashboard = new pages.UX1804.bank_dropdown(driver);
//    TestModellerLogger.SetLastNodeGuid("7c25a927-642d-48d6-9ed3-d98b33a4ba4b");
//    _addashboard.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("e98ed820-abd6-4bc3-89c7-2adc5dfa8ad2");
//    _addashboard.AssertUrl();


//   TestModellerLogger.SetLastNodeGuid("be6b57b7-68ed-4627-afa4-1711c8567e04");
//   _addashboard.Click_Bankingdash();
   
   
   TestModellerLogger.SetLastNodeGuid("be6b57b7-68ed-4627-afa4-1711c8567e04");
   _addashboard.Select_bnk_selection_dash(data[5]);
    
       pages.UX1804.Bank_Verifynames _test6 = new pages.UX1804.Bank_Verifynames(driver);
//       TestModellerLogger.SetLastNodeGuid("00de91d5-f8c5-41bb-bc53-d6c19c5d6134");
//       _test6.GoToUrl();
//       
//       TestModellerLogger.SetLastNodeGuid("00de91d5-f8c5-41bb-bc53-d6c19c5d6134");
//     _test6.AssertUrl();
     
       TestModellerLogger.SetLastNodeGuid("384bdaee-b6fa-444c-8f0b-a91ab338ca98");
       _test6.Click_Bank_menu2();
       

       TestModellerLogger.SetLastNodeGuid("c5ad71b5-eb8f-4284-8f28-a9bda1ca9fcf");
       _test6.Click_New__btn_bank();
       

       TestModellerLogger.SetLastNodeGuid("afc14f02-2335-4f27-8645-2bfb64009ca2");
       _test6.Click_Bank_Account_menu();
       

       TestModellerLogger.SetLastNodeGuid("5bc7e29c-938a-47c3-92bb-5599aed0343c");
       _test6.Click_Account_Name_column();
       
   
   
    }
}


/*

    @Test  (groups= {"ds_Adbnk","ds_Adbnk - ds_banking"})
    @TestModellerPath(guid = "df7342c2-3da4-47a4-88b8-db5300e4e0c7")
    public void dsbankingGoToUrlAssertUrlClickBankingdashPositiveSelectbnkselectiondash4()
    {
        
    	 pages.UX1804.addashboard _addashboard = new  pages.UX1804.addashboard(driver);
    TestModellerLogger.SetLastNodeGuid("7c25a927-642d-48d6-9ed3-d98b33a4ba4b");
    _addashboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e98ed820-abd6-4bc3-89c7-2adc5dfa8ad2");
    _addashboard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("be6b57b7-68ed-4627-afa4-1711c8567e04");
    _addashboard.Click_Bankingdash();
    

    TestModellerLogger.SetLastNodeGuid("e25c38ee-e9be-4654-bb3a-36e82a04bba1");
    _addashboard.Select_bnk_selection_dash("Nidhilimited1");
    

    }

    @Test  (groups= {"ds_Adbnk","ds_Adbnk - ds_banking"})
    @TestModellerPath(guid = "e93b26bf-e000-4aec-928c-2fcfaf21ddda")
    public void dsbankingGoToUrlAssertUrlClickBankingdashPositiveSelectbnkselectiondash5()
    {
        
    	 pages.UX1804.addashboard _addashboard = new pages.UX1804.addashboard(driver);
    TestModellerLogger.SetLastNodeGuid("7c25a927-642d-48d6-9ed3-d98b33a4ba4b");
    _addashboard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e98ed820-abd6-4bc3-89c7-2adc5dfa8ad2");
    _addashboard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("be6b57b7-68ed-4627-afa4-1711c8567e04");
    _addashboard.Click_Bankingdash();
    

    TestModellerLogger.SetLastNodeGuid("e25c38ee-e9be-4654-bb3a-36e82a04bba1");
    _addashboard.Select_bnk_selection_dash("NidhiLimited");
    

    }

}*/
    