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
public class dsAdbnk_dsbanking extends TestBase
{
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"ds_Adbnk","ds_Adbnk - ds_banking"})
    @TestModellerPath(guid = "f7e654ad-065c-453c-a51d-ffefe43c7ede")
    public void dsbankingGoToUrlAssertUrlClickBankingdashPositiveSelectbnkselectiondash1() throws InvalidFormatException, InterruptedException, IOException
    {
        
    	sTestCaseID="Verifybankamt1";
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
    
       pages.UX1804.bank_DB _addashboard = new  pages.UX1804.bank_DB(driver);
//    TestModellerLogger.SetLastNodeGuid("7c25a927-642d-48d6-9ed3-d98b33a4ba4b");
//    _addashboard.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("e98ed820-abd6-4bc3-89c7-2adc5dfa8ad2");
//    _addashboard.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("be6b57b7-68ed-4627-afa4-1711c8567e04");
//    _addashboard.Click_Bankingdash();
    

    TestModellerLogger.SetLastNodeGuid("e25c38ee-e9be-4654-bb3a-36e82a04bba1");
    _addashboard.Select_bnk_selection_dash(data[5]);
    
    pages.UX1804.ldgrbook _ldgrbook = new pages.UX1804.ldgrbook(driver);
//    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
//    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    
    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_btn_opnclose_chkbox();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_option1();
    
    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Enter_option2(data[7]);

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    
    }
    public String sTestCaseID1=null;
	String[] data1=null;
	String Sheet1 = null;

   @Test  (groups= {"ds_Adbnk","ds_Adbnk - ds_banking"})
    @TestModellerPath(guid = "6e763454-fe6a-42cc-8d78-a636c5d877c0")
    public void dsbankingGoToUrlAssertUrlClickBankingdashPositiveSelectbnkselectiondash2() throws InvalidFormatException, InterruptedException, IOException
    {
    	sTestCaseID="Verifybankamt2";
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
    
       pages.UX1804.bank_DB _addashboard = new  pages.UX1804.bank_DB(driver);
//    TestModellerLogger.SetLastNodeGuid("7c25a927-642d-48d6-9ed3-d98b33a4ba4b");
//    _addashboard.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("e98ed820-abd6-4bc3-89c7-2adc5dfa8ad2");
//    _addashboard.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("be6b57b7-68ed-4627-afa4-1711c8567e04");
//    _addashboard.Click_Bankingdash();
    

    TestModellerLogger.SetLastNodeGuid("e25c38ee-e9be-4654-bb3a-36e82a04bba1");
    _addashboard.Select_bnk_selection_dash(data[5]);  
    
    pages.UX1804.ldgrbook _ldgrbook = new pages.UX1804.ldgrbook(driver);
//    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
//    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    
    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_btn_opnclose_chkbox();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_option1();
    
    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Enter_option2(data[7]);

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    	
    }
   
    @Test  (groups= {"ds_Adbnk","ds_Adbnk - ds_banking"})
    @TestModellerPath(guid = "d3d93daa-4fcf-47f8-a649-8513d34a6996")
    public void dsbankingGoToUrlAssertUrlClickBankingdashPositiveSelectbnkselectiondash3() throws InterruptedException, IOException, InvalidFormatException
    {
    	sTestCaseID="Verifybankamt3";
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
    
       pages.UX1804.bank_DB _addashboard = new  pages.UX1804.bank_DB(driver);
//    TestModellerLogger.SetLastNodeGuid("7c25a927-642d-48d6-9ed3-d98b33a4ba4b");
//    _addashboard.GoToUrl();
//    

//    TestModellerLogger.SetLastNodeGuid("e98ed820-abd6-4bc3-89c7-2adc5dfa8ad2");
//    _addashboard.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("be6b57b7-68ed-4627-afa4-1711c8567e04");
//    _addashboard.Click_Bankingdash();
    

    TestModellerLogger.SetLastNodeGuid("e25c38ee-e9be-4654-bb3a-36e82a04bba1");
    _addashboard.Select_bnk_selection_dash(data[5]);
    
    pages.UX1804.ldgrbook _ldgrbook = new pages.UX1804.ldgrbook(driver);
//    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
//    _ldgrbook.GoToUrl();
//    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    
    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_btn_opnclose_chkbox();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_option1();
    
    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Enter_option2(data[7]);

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();

    
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
    