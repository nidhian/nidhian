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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f8f4900c-ca86-452c-aa76-48e7b8f35b25
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1484, profileId = 101379)
public class Ldgrrpt_ldgerrpt extends TestBase
{
    
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;

    
    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "078c75de-5c02-47f8-9e49-dfbc34bbeb13")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="Dsbank";
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
    	
        pages.UX1804.ldgrbook _ldgrbook = new pages.UX1804.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    
    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_btn_opnclose_chkbox();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_option1();
    
    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Enter_option2(data[6]);

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }
}
    /*

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "22aaf9d4-e6bf-4fb0-ba80-590cc7e80269")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL1()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Debit");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "f5d2cd44-ff72-4a83-b1b9-f595a2912243")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL2()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Credit");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "a58b74c0-69ae-4574-bfe4-d8ccf505774b")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL3()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Description");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "04998f03-8310-4382-9f8e-bbb064f8a553")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL4()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("Unreconciled");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "68b7ae87-305e-4451-9e84-14226a720d38")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL5()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("Reconciled");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "314c5d0e-dbd2-4e97-8c86-22fadc4ce462")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL6()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Quarter");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "d67b13f7-69d8-4c40-9ad8-c77606eaf828")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL7()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "36570e40-e052-4c18-bfbd-3db959977393")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterangeL8()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("Last Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "fe5b1194-c627-484e-92da-d04f81c7913c")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("Last Quarter");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "c6d43d21-6e58-4bfb-81e1-61f798f1eea3")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange1()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("Last Financial Year");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "c7f4e720-627b-44f4-ac0e-19efd5dc923e")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange2()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("Month To Date");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "f8891932-9b28-4c82-b436-74ea76cda49a")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange3()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("Quarter To Date");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "69b1cb92-cfc7-4487-a28d-3bdc31eb18fa")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange4()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("Year To Date");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "c3ff32f1-9d71-404a-aba1-17c222275c0b")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange5()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Bank");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("Custom");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "f0f8b71b-904d-4d4b-aea4-57e7a1962a96")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange6()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Capital Account");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "34e19b30-e99b-40f2-8579-d9241732cd89")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange7()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Capital Account - Balance Brought Forward");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "811ca209-0cb8-465b-bfc7-40e4df633c5e")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange8()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Capital Account - Current Year Profit/Loss");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "9276731a-747f-493b-861a-a546c1119315")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange9()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Capital Account - Drawings");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "c57a496f-499a-4534-9080-af2c670f631c")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange10()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Capital Account - Introductions");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "ee7ff100-4e9b-477c-9ee9-d9a4c344b45f")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange11()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Capital Account - Transfers");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "40eed291-bac6-4f70-82a0-181c9e3f816c")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange12()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Capital Account - Wages");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "35286a1b-830f-48dc-ade1-be63347971af")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange13()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Current Account - Balance Brought Forward");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "7323a6f8-71ed-4e01-9d8a-22675f786794")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange14()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Current Account - Current Year Profit/Loss");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "51025c5a-419d-488e-9567-c43a17451d89")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange15()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Current Account - Drawings");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "63aa4ac4-6969-4664-a048-99dafc3c69b8")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange16()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Current Account - Introductions");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "8eb0165c-121e-4734-9da9-8305e64106a1")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange17()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Current Account - Transfers");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "8c1fd86f-fa1f-4a59-9d67-d97f78cd646b")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange18()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Current Account - Wages");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "96dc614c-809c-4e4a-81b6-962d75d3084f")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange19()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Cost of Sale");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "a70a5215-5b81-4dd9-8f60-3442b0bd0e50")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange20()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Credit Card");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "3ab2490e-b2c8-4f75-b763-ee6f48edbd46")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange21()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Creditors due after one year");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "2932d881-da99-4797-a3ec-780a8817254e")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange22()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Creditors due within one year");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "4291b793-8a33-4527-a9b3-36a4b3322cc4")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange23()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Current Asset");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "8424b3c2-0676-415c-9f08-5ba1cbc02f2c")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange24()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Customer");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "1022dcd1-8145-4e07-9da4-b55d8c14ea57")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange25()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Debtor");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "dbd3f5a2-c37e-4c9f-b026-8350b7dd1fba")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange26()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("Director");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "e442d70b-6aad-4a40-81d6-e8559a9f8815")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange27()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Director Current Account");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "b23d19ce-eef1-42c5-8867-16cb917a590c")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange28()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Director Capital Distribution");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

    @Test  (groups= {"Ldgr_rpt","Ldgr_rpt - ldger_rpt"})
    @TestModellerPath(guid = "3610fe15-f26d-4fd6-a346-c08197bde2c6")
    public void GoToUrlClickReportsmenu2ClickLedgerrptPositiveSelectActtype2exClickAllPositiveSelectDaterange29()
    {
        
        pages.ldgrbook _ldgrbook = new pages.ldgrbook(driver);
    TestModellerLogger.SetLastNodeGuid("597c0884-0bad-49ef-8ceb-828fc6e14629");
    _ldgrbook.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1177962-33ba-4130-b235-2ee02f43e8b3");
    _ldgrbook.Click_Reports_menu2();
    

    TestModellerLogger.SetLastNodeGuid("de26cfb2-8a18-4869-8e17-b7d226063a08");
    _ldgrbook.Click_Ledger_rpt();
    

    TestModellerLogger.SetLastNodeGuid("152e1e95-acac-4120-8f6c-8ab1f9ba3e56");
    _ldgrbook.Select_Act_type2ex("    Director Dividend");
    

    TestModellerLogger.SetLastNodeGuid("22c8f230-390c-4b7e-b7b2-98f7a6c93557");
    _ldgrbook.Click_All();
    

    TestModellerLogger.SetLastNodeGuid("831ac059-8a76-4477-9a27-df8f330e1ae7");
    _ldgrbook.Select_Date_range_L("This Month");
    

    TestModellerLogger.SetLastNodeGuid("6d9fca26-9a5c-4e31-86f4-8d5ed6d5ba91");
    _ldgrbook.Enter_dt_frm("");
    

    TestModellerLogger.SetLastNodeGuid("9e674d13-8903-4069-93df-53b7d14be093");
    _ldgrbook.Enter_dt_to("");
    

    TestModellerLogger.SetLastNodeGuid("c1f0b15b-e011-4eb4-ae16-b9018f3c2b16");
    _ldgrbook.Select_Ledger_Reconcile_2("All");
    

    TestModellerLogger.SetLastNodeGuid("84c396d8-8293-4956-91c8-af84def5a313");
    _ldgrbook.Select_Search_cat_1("Select");
    

    TestModellerLogger.SetLastNodeGuid("d80b8bce-583b-4707-a447-2464ed70198c");
    _ldgrbook.Click_Update__btn1();
    

    }

}*/