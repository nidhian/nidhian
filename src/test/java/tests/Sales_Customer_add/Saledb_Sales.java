package tests.Sales_Customer_add;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/1a11efcd-a7d8-48a4-98b3-7162e3354663
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1855, profileId = 102402)
public class Saledb_Sales extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;
    

    
    @Test  (groups= {"Sale_db","Sale_db - Sales"})
    @TestModellerPath(guid = "55032975-e817-4938-bf1c-e9c93148c4c5")
    public void PositiveSelectSelectCustDrpdwn1PositiveSelectSearchbYCat2ClickSelectPaymentStatus3PositiveSelect() throws InterruptedException, InvalidFormatException
    {
        
    	
    	sTestCaseID="TC67";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);

    	pages.nlogin _nlogin = new pages.nlogin(driver);
        TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
        _nlogin.GoToUrl();
        

//        TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//        _nlogin.AssertUrl();
        

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
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
    	
        pages.Sales_customer_add.Salemenu _Salemenu = new pages.Sales_customer_add.Salemenu(driver);
//    TestModellerLogger.SetLastNodeGuid("0a98f50a-b5c0-49c0-a871-f640dac56127");
//    _Salemenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
    _Salemenu.Click_Sales_menu1();
    

    TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
    _Salemenu.Click_Sales_View__menu2();
    

    TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
    _Salemenu.Click_Cust_List_3();
    
    pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
    TestModellerLogger.SetLastNodeGuid("76c39053-53d8-46ea-9a87-1707355f7e5f");
    _SalesDB.Select_Select_Cust_Drpdwn1("data[5]");

    

//    TestModellerLogger.SetLastNodeGuid("04669abe-d6b9-4985-9318-c2b5085c8e61");
//    _SalesDB.Select_Search_bY_Cat2("Ref#");
//    
//
//    TestModellerLogger.SetLastNodeGuid("cb665dff-d8a7-4859-b9e0-fe2b92422981");
//    _SalesDB.Click_Select_Payment_Status3();
//    
//
//    TestModellerLogger.SetLastNodeGuid("35665da6-fc46-423a-96f1-0180e1f42158");
//    _SalesDB.Select_Select_Due_Status4("All");
//    
//
//    TestModellerLogger.SetLastNodeGuid("9a18b203-5f21-4d28-a815-c587c302f16f");
//    _SalesDB.Enter_Select_Date_From6("2022-02-23 01:08:04");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5ac3f91c-d188-42f1-9e56-65aee8836645");
//    _SalesDB.Enter_ctl00cPHFiltertxtDateTo("2022-09-02 12:16:06");
//    

    TestModellerLogger.SetLastNodeGuid("9b93ae5f-9d92-4db0-b51a-c4ceaf7af5d5");
    _SalesDB.Click_Click_Update__btn();
    

    }
}
/*
    @Test  (groups= {"Sale_db","Sale_db - Sales"})
    @TestModellerPath(guid = "e2d9ef88-d1b7-4a73-8f47-cc366c0cba36")
    public void PositiveSelectSelectCustDrpdwn1PositiveSelectSearchbYCat2ClickSelectPaymentStatus3PositiveSelect1()
    {
        
        pages.SalesDB _SalesDB = new pages.SalesDB(driver);
    TestModellerLogger.SetLastNodeGuid("76c39053-53d8-46ea-9a87-1707355f7e5f");
    _SalesDB.Select_Select_Cust_Drpdwn1("All");
    

    TestModellerLogger.SetLastNodeGuid("04669abe-d6b9-4985-9318-c2b5085c8e61");
    _SalesDB.Select_Search_bY_Cat2("Tran#");
    

    TestModellerLogger.SetLastNodeGuid("cb665dff-d8a7-4859-b9e0-fe2b92422981");
    _SalesDB.Click_Select_Payment_Status3();
    

    TestModellerLogger.SetLastNodeGuid("35665da6-fc46-423a-96f1-0180e1f42158");
    _SalesDB.Select_Select_Due_Status4("All");
    

    TestModellerLogger.SetLastNodeGuid("9a18b203-5f21-4d28-a815-c587c302f16f");
    _SalesDB.Enter_Select_Date_From6("2021-11-18 03:14:16");
    

    TestModellerLogger.SetLastNodeGuid("5ac3f91c-d188-42f1-9e56-65aee8836645");
    _SalesDB.Enter_ctl00cPHFiltertxtDateTo("2020-11-23 07:43:35");
    

    TestModellerLogger.SetLastNodeGuid("9b93ae5f-9d92-4db0-b51a-c4ceaf7af5d5");
    _SalesDB.Click_Click_Update__btn();
    

    }

    @Test  (groups= {"Sale_db","Sale_db - Sales"})
    @TestModellerPath(guid = "4645c96b-21e6-45c5-bdbb-beede21f076c")
    public void PositiveSelectSelectCustDrpdwn1PositiveSelectSearchbYCat2ClickSelectPaymentStatus3PositiveSelect2()
    {
        
        pages.SalesDB _SalesDB = new pages.SalesDB(driver);
    TestModellerLogger.SetLastNodeGuid("76c39053-53d8-46ea-9a87-1707355f7e5f");
    _SalesDB.Select_Select_Cust_Drpdwn1("All");
    

    TestModellerLogger.SetLastNodeGuid("04669abe-d6b9-4985-9318-c2b5085c8e61");
    _SalesDB.Select_Search_bY_Cat2("Type");
    

    TestModellerLogger.SetLastNodeGuid("cb665dff-d8a7-4859-b9e0-fe2b92422981");
    _SalesDB.Click_Select_Payment_Status3();
    

    TestModellerLogger.SetLastNodeGuid("35665da6-fc46-423a-96f1-0180e1f42158");
    _SalesDB.Select_Select_Due_Status4("All");
    

    TestModellerLogger.SetLastNodeGuid("9a18b203-5f21-4d28-a815-c587c302f16f");
    _SalesDB.Enter_Select_Date_From6("2022-03-07 00:31:05");
    

    TestModellerLogger.SetLastNodeGuid("5ac3f91c-d188-42f1-9e56-65aee8836645");
    _SalesDB.Enter_ctl00cPHFiltertxtDateTo("44487");
    

    TestModellerLogger.SetLastNodeGuid("9b93ae5f-9d92-4db0-b51a-c4ceaf7af5d5");
    _SalesDB.Click_Click_Update__btn();
    

    }

    @Test  (groups= {"Sale_db","Sale_db - Sales"})
    @TestModellerPath(guid = "06f58024-f09d-4e13-ad43-903242a63aa7")
    public void PositiveSelectSelectCustDrpdwn1PositiveSelectSearchbYCat2ClickSelectPaymentStatus3PositiveSelect3()
    {
        
        pages.SalesDB _SalesDB = new pages.SalesDB(driver);
    TestModellerLogger.SetLastNodeGuid("76c39053-53d8-46ea-9a87-1707355f7e5f");
    _SalesDB.Select_Select_Cust_Drpdwn1("All");
    

    TestModellerLogger.SetLastNodeGuid("04669abe-d6b9-4985-9318-c2b5085c8e61");
    _SalesDB.Select_Search_bY_Cat2("Select");
    

    TestModellerLogger.SetLastNodeGuid("cb665dff-d8a7-4859-b9e0-fe2b92422981");
    _SalesDB.Click_Select_Payment_Status3();
    

    TestModellerLogger.SetLastNodeGuid("35665da6-fc46-423a-96f1-0180e1f42158");
    _SalesDB.Select_Select_Due_Status4("All");
    

    TestModellerLogger.SetLastNodeGuid("9a18b203-5f21-4d28-a815-c587c302f16f");
    _SalesDB.Enter_Select_Date_From6("2021-06-23 19:58:54");
    

    TestModellerLogger.SetLastNodeGuid("5ac3f91c-d188-42f1-9e56-65aee8836645");
    _SalesDB.Enter_ctl00cPHFiltertxtDateTo("2022-02-23 12:05:45");
    

    TestModellerLogger.SetLastNodeGuid("9b93ae5f-9d92-4db0-b51a-c4ceaf7af5d5");
    _SalesDB.Click_Click_Update__btn();
    

    }

    @Test  (groups= {"Sale_db","Sale_db - Sales"})
    @TestModellerPath(guid = "771c0de4-7559-4db9-8443-23b27e7a0e9d")
    public void PositiveSelectSelectCustDrpdwn1PositiveSelectSearchbYCat2ClickSelectPaymentStatus3PositiveSelect4()
    {
        
        pages.SalesDB _SalesDB = new pages.SalesDB(driver);
    TestModellerLogger.SetLastNodeGuid("76c39053-53d8-46ea-9a87-1707355f7e5f");
    _SalesDB.Select_Select_Cust_Drpdwn1("All");
    

    TestModellerLogger.SetLastNodeGuid("04669abe-d6b9-4985-9318-c2b5085c8e61");
    _SalesDB.Select_Search_bY_Cat2("Customer Name");
    

    TestModellerLogger.SetLastNodeGuid("cb665dff-d8a7-4859-b9e0-fe2b92422981");
    _SalesDB.Click_Select_Payment_Status3();
    

    TestModellerLogger.SetLastNodeGuid("35665da6-fc46-423a-96f1-0180e1f42158");
    _SalesDB.Select_Select_Due_Status4("All");
    

    TestModellerLogger.SetLastNodeGuid("9a18b203-5f21-4d28-a815-c587c302f16f");
    _SalesDB.Enter_Select_Date_From6("44487");
    

    TestModellerLogger.SetLastNodeGuid("5ac3f91c-d188-42f1-9e56-65aee8836645");
    _SalesDB.Enter_ctl00cPHFiltertxtDateTo("2022-06-04 19:28:39");
    

    TestModellerLogger.SetLastNodeGuid("9b93ae5f-9d92-4db0-b51a-c4ceaf7af5d5");
    _SalesDB.Click_Click_Update__btn();
    

    }

    @Test  (groups= {"Sale_db","Sale_db - Sales"})
    @TestModellerPath(guid = "12d01961-59bf-470c-aba3-1e026b71b152")
    public void PositiveSelectSelectCustDrpdwn1PositiveSelectSearchbYCat2ClickSelectPaymentStatus3PositiveSelect5()
    {
        
        pages.SalesDB _SalesDB = new pages.SalesDB(driver);
    TestModellerLogger.SetLastNodeGuid("76c39053-53d8-46ea-9a87-1707355f7e5f");
    _SalesDB.Select_Select_Cust_Drpdwn1("All");
    

    TestModellerLogger.SetLastNodeGuid("04669abe-d6b9-4985-9318-c2b5085c8e61");
    _SalesDB.Select_Search_bY_Cat2("Inv#");
    

    TestModellerLogger.SetLastNodeGuid("cb665dff-d8a7-4859-b9e0-fe2b92422981");
    _SalesDB.Click_Select_Payment_Status3();
    

    TestModellerLogger.SetLastNodeGuid("35665da6-fc46-423a-96f1-0180e1f42158");
    _SalesDB.Select_Select_Due_Status4("Not Due");
    

    TestModellerLogger.SetLastNodeGuid("9a18b203-5f21-4d28-a815-c587c302f16f");
    _SalesDB.Enter_Select_Date_From6("2022-09-24 19:07:49");
    

    TestModellerLogger.SetLastNodeGuid("5ac3f91c-d188-42f1-9e56-65aee8836645");
    _SalesDB.Enter_ctl00cPHFiltertxtDateTo("2022-04-13 14:14:19");
    

    TestModellerLogger.SetLastNodeGuid("9b93ae5f-9d92-4db0-b51a-c4ceaf7af5d5");
    _SalesDB.Click_Click_Update__btn();
    

    }

    @Test  (groups= {"Sale_db","Sale_db - Sales"})
    @TestModellerPath(guid = "d7ad5ef1-36f7-45e3-b9cf-21dcaa06085b")
    public void PositiveSelectSelectCustDrpdwn1PositiveSelectSearchbYCat2ClickSelectPaymentStatus3PositiveSelect6()
    {
        
        pages.SalesDB _SalesDB = new pages.SalesDB(driver);
    TestModellerLogger.SetLastNodeGuid("76c39053-53d8-46ea-9a87-1707355f7e5f");
    _SalesDB.Select_Select_Cust_Drpdwn1("All");
    

    TestModellerLogger.SetLastNodeGuid("04669abe-d6b9-4985-9318-c2b5085c8e61");
    _SalesDB.Select_Search_bY_Cat2("Ref#");
    

    TestModellerLogger.SetLastNodeGuid("cb665dff-d8a7-4859-b9e0-fe2b92422981");
    _SalesDB.Click_Select_Payment_Status3();
    

    TestModellerLogger.SetLastNodeGuid("35665da6-fc46-423a-96f1-0180e1f42158");
    _SalesDB.Select_Select_Due_Status4("Due");
    

    TestModellerLogger.SetLastNodeGuid("9a18b203-5f21-4d28-a815-c587c302f16f");
    _SalesDB.Enter_Select_Date_From6("2022-04-11 20:42:23");
    

    TestModellerLogger.SetLastNodeGuid("5ac3f91c-d188-42f1-9e56-65aee8836645");
    _SalesDB.Enter_ctl00cPHFiltertxtDateTo("2022-01-07 12:23:18");
    

    TestModellerLogger.SetLastNodeGuid("9b93ae5f-9d92-4db0-b51a-c4ceaf7af5d5");
    _SalesDB.Click_Click_Update__btn();
    

    }
  

*/