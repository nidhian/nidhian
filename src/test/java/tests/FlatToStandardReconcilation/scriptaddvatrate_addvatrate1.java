package tests.FlatToStandardReconcilation;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.addVatrate;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f0e9899a-2609-4425-9cdb-c93321f6719e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1303, profileId = 101175)
public class scriptaddvatrate_addvatrate1 extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
   /// @Test  (groups= {"scriptaddvatrate","scriptaddvatrate - addvatrate"})
   // @TestModellerPath(guid = "6853c2e4-45f5-415e-aa35-893b6f08aa09")
   // public void addvatrateGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl1() throws InterruptedException
   // {
     /*   
    	sTestCaseID="TC3";
    	Sheet="Addvatsetting";
    	data =ExcelData.toReadExcelData("TC3", "Addvatsetting");
        pages.nlogin _nlogin = new pages.nlogin(driver);
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
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
//    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
//    _EditSettingToStandard.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
//    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
          
addVatrate _addVatrate = new pages.addVatrate(driver);
//  TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
//   _addVatrate.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
//    _addVatrate.AssertUrl();
TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
_addVatrate.Click_AddVatbtn();


    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date(data[6]);
    
//
//    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
//    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
  

    }
}  */
/*

    @Test  (groups= {"scriptaddvatrate","scriptaddvatrate - addvatrate"})
    @TestModellerPath(guid = "74ae5d98-4f22-4f38-a2a1-9f410220ae89")
    public void addvatrateGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl2()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("H8ahMnikC0");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quidem");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Upton, Homenick and Kutch");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
    _EditSettingToStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("2020-12-07 18:42:41");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }

    @Test  (groups= {"scriptaddvatrate","scriptaddvatrate - addvatrate"})
    @TestModellerPath(guid = "b52d2bb0-45e3-4c7c-a8d8-219f20fe4d39")
    public void addvatrateGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl3()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("bzWUHAE6S0");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("corporis");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hilll, Schultz and Mann");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
    _EditSettingToStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("2022-03-19 22:50:52");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }

    @Test  (groups= {"scriptaddvatrate","scriptaddvatrate - addvatrate"})
    @TestModellerPath(guid = "9f420fcc-703e-4607-b526-188eec86527f")
    public void addvatrateGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl4()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("1n1wsnQbSR");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nemo");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kreiger - Wehner");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
    _EditSettingToStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("44279");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }

    @Test  (groups= {"scriptaddvatrate","scriptaddvatrate - addvatrate"})
    @TestModellerPath(guid = "61f677ce-e0fe-4b2d-93ef-81465ddd8465")
    public void addvatrateGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl5()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("_MYS839wEL");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ullam");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Runolfsdottir - Funk");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
    _EditSettingToStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("FLATRATE VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("44279");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }

    @Test  (groups= {"scriptaddvatrate","scriptaddvatrate - addvatrate"})
    @TestModellerPath(guid = "7b1d4821-7d96-4141-bb4e-5cc22f8477c4")
    public void addvatrateGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl6()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("FS93nabrjB");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("molestiae");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
    _Searchclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kiehn LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
    TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
    _EditSettingToStandard.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
    _EditSettingToStandard.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
    _EditSettingToStandard.Click_SettingsTab();
    

    TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
    _EditSettingToStandard.Click_VATTab();
    

    TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
    _EditSettingToStandard.Click_EditButton();
    

    TestModellerLogger.SetLastNodeGuid("6d5eefd9-4f52-460d-a46c-cee2ff36ecef");
    _EditSettingToStandard.Click_VATTypeEdit();
    

    TestModellerLogger.SetLastNodeGuid("caa4ec7f-5c3f-4dc5-a5a0-b798ccb83a18");
    _EditSettingToStandard.Select_SelectVATType("STANDARD VAT");
    

    TestModellerLogger.SetLastNodeGuid("e4d8d7c9-bc58-407d-bc46-cbb6f678bad3");
    _EditSettingToStandard.Click_SaveButton();
    

pages.addVatrate _addVatrate = new pages.addVatrate(driver);
    TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
    _addVatrate.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
    _addVatrate.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1("NO VAT");
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date("44279");
    

    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    

    }
*/
    @Test  (groups= {"scriptaddvatrate","scriptaddvatrate - addvatrate"})
    @TestModellerPath(guid = "df25ee70-ce9b-4963-ab42-e7fcbc758529")
    public void addvatrateGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl7() throws InterruptedException, InvalidFormatException, IOException
    {        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
	sTestCaseID="TC18";
	Sheet="Sheet1";
	data =ExcelData.toReadExcelData("TC18", "Sheet1");


//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

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
    

    pages.EditSettingToStandard _EditSettingToStandard = new pages.EditSettingToStandard(driver);
//  TestModellerLogger.SetLastNodeGuid("be5994ab-08fc-491b-93e9-7e0d982cadb3");
//  _EditSettingToStandard.GoToUrl();
  

//  TestModellerLogger.SetLastNodeGuid("fce56750-e722-4b5b-a6b4-a88c3fc2a3f7");
//  _EditSettingToStandard.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("f503a66c-5a3a-4197-b3ae-159ed01aa52c");
  _EditSettingToStandard.Click_SettingsTab();
  

  TestModellerLogger.SetLastNodeGuid("c92f0a95-9832-4576-a4fb-7c5179e2bd74");
  _EditSettingToStandard.Click_VATTab();
  

  TestModellerLogger.SetLastNodeGuid("af7a0151-5ddf-4c3a-9108-d2ee93cf17fd");
  _EditSettingToStandard.Click_EditButton();
        
addVatrate _addVatrate = new pages.addVatrate(driver);
//TestModellerLogger.SetLastNodeGuid("c7696e8a-4f80-4f22-9521-cfa90aa6fdf1");
// _addVatrate.GoToUrl();
  

//  TestModellerLogger.SetLastNodeGuid("c4cea565-6443-4f64-ac5b-e22f59b2fca4");
//  _addVatrate.AssertUrl();
TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
_addVatrate.Click_AddVatbtn();
    


    TestModellerLogger.SetLastNodeGuid("6e060c6a-4d91-4fcb-83c9-1b01a39e2e6c");
    _addVatrate.Select_VAT_Status1(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("b81fccd4-7cd8-416f-868f-575a580512c7");
    _addVatrate.Enter_Effective_Date(data[6]);
    

//    TestModellerLogger.SetLastNodeGuid("341b2232-9550-47ba-903b-d14ebe1fcd21");
//    _addVatrate.Select_FlatrateBusinesscat("Band 1(Retailing food, confectionary, tobacco, newspapers...)");
    

    TestModellerLogger.SetLastNodeGuid("f919c1f5-4c35-42db-b468-c1526851cf7d");
    _addVatrate.Click_btn_Save_1();
    }


}
