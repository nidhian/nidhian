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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7527f519-d53f-4594-9d6a-44229cfdceb6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1857, profileId = 102405)
public class addmoreinfo_Addcustmore extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "6cc58675-7564-4e36-ba8f-34812c0da9a1")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positive67() throws InvalidFormatException, InterruptedException
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
    

    TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
    _Salemenu.Click_Add_Customer__4();
        
    pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
    _custadd.Enter_Buss_Name_1(data[5]);
    _custadd.Enter_Cust_Fname_2(data[6]);
    _custadd.Enter_Cust_Lname_3(data[7]);
    _custadd.Enter_Customer_Phone_4(data[8]);
    _custadd.Enter_Cust_Customer_email_5(data[9]);
    _custadd.Enter_Cust_Address1(data[10]);
    _custadd.Enter_Cust_Address2(data[11]);
    _custadd.Select_CCountry_10(data[12]);
    	
    	
      pages.Sales_customer_add.AddcustMoreicon _AddcustMoreicon = new pages.Sales_customer_add.AddcustMoreicon(driver);

    _AddcustMoreicon.Click_imgMore_Clicked1();
    

    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
   _AddcustMoreicon.Enter_Eneter_Ref_num2(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

//    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
//    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

//    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
//    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5(data[14]);
    

//    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
//    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("data[15]");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7(data[16]);
    
//
//    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
//    _AddcustMoreicon.Select_Select_Payment_8("data[17]");
    

//    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
//    _AddcustMoreicon.Select_Enter_Ledger_9("data[18]");
    
//
//    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
//    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10(data[19]);
    

//    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
//    _AddcustMoreicon.Select_Select_Currency_11(data[20]);
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
 // _custadd.Click_Click_Form_Save_();
    
    _custadd.Select_Select_Cust_Drpdwn1();
   // _custadd.AsonDate(data[21]);
    pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
    _SalesDB.Click_Click_Update__btn();

    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "8e437c87-1a37-41b8-9638-31551bc18a61")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positive68() throws InterruptedException, InvalidFormatException
    {
        
    	sTestCaseID="TC68";
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
        
        pages.Sales_customer_add.Settingsciscustomer _setting=new pages.Sales_customer_add.Settingsciscustomer(driver);
        
        _setting.Click_Click_Settings__1();
        _setting.Click_Click_Edit_btn_2();
        _setting.Click_Click_SalesInvoice_tab_3();
        _setting.Select_Cis_invoice_dropdown_4(data[21]);
        _setting.Click_Enable_SalesInvoice_5();
        

        _setting.Click_Enable_SalesInvoice_MultiCurrency_7();
        utilities.PassScreenshot.Getscreenshot11("mark for multicurancy invce checked", "Multicurrency Setting");
        _setting.Click_Enable_SalesInvoice_rDeduction_8();
        _setting.Click_Enable_SalesInvoice_SubcontractorCIS_9();
        utilities.PassScreenshot.Getscreenshot11("Activate check box clicked", "Multicurrency Setting");
        _setting.Click_Click__Save__btn_10();
       utilities.PassScreenshot.Getscreenshot11("mark for multicurancy", "Multicurrency Setting");
        
        pages.Sales_customer_add.Salemenu _Salemenu = new pages.Sales_customer_add.Salemenu(driver);
//    TestModellerLogger.SetLastNodeGuid("0a98f50a-b5c0-49c0-a871-f640dac56127");
//    _Salemenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
    _Salemenu.Click_Sales_menu1();
    

    TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
    _Salemenu.Click_Sales_View__menu2();
    

    TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
    _Salemenu.Click_Cust_List_3();
    

    TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
    _Salemenu.Click_Add_Customer__4();
        
    pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
    _custadd.Enter_Buss_Name_2(data[5]);
    _custadd.Enter_Cust_Fname_2(data[6]);
    _custadd.Enter_Cust_Lname_3(data[7]);
    _custadd.Enter_Customer_Phone_4(data[8]);
    _custadd.Enter_Cust_Customer_email_5(data[9]);
    _custadd.Enter_Cust_Address1(data[10]);
    _custadd.Enter_Cust_Address2(data[11]);
    _custadd.Select_CCountry_10(data[12]);
    	
    	
      pages.Sales_customer_add.AddcustMoreicon _AddcustMoreicon = new pages.Sales_customer_add.AddcustMoreicon(driver);

    _AddcustMoreicon.Click_imgMore_Clicked1();
    
//
//    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
//    _AddcustMoreicon.Enter_Eneter_Ref_num2("data[13]");
    

//    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
//    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

//    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
//    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

//    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
//    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5("data[14]");
    
//
//    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
//    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("data[15]");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7(data[16]);
    

//    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
//    _AddcustMoreicon.Select_Select_Payment_8("data[17]");
    
//
  TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
   _AddcustMoreicon.Select_Enter_Ledger_9(data[18]);
    

   TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
   _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10(data[19]);
    

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
    _AddcustMoreicon.Select_Select_Currency_11(data[20]);
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
   
   // ._AddcustMoreicon..Click_Click_Form_Save_();
    
    _custadd.Select_Select_Cust_Drpdwn1();
//    _custadd.AsonDate(data[21]);
    
    pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
    _SalesDB.Click_Click_Update__btn();
    
    /*sale invoice by using this cusomter*/
    pages.Sales_customer_add.SaleInvoices _SaleInvoices=new pages.Sales_customer_add.SaleInvoices(driver);
    		
    
    
    _SaleInvoices.Click_Sale_New_menu1();
    
    _SaleInvoices.Click_Click_Create_Nu_Invoice_2();
    

    TestModellerLogger.SetLastNodeGuid("c169edfa-18e6-4217-b238-5de3a7df3e7f");
    _SaleInvoices.Select_Nu_Inv_Customer_1();
    
 
//
    TestModellerLogger.SetLastNodeGuid("b2c6cddf-27b2-4958-8f39-6ad6f5e5befd");
   _SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
   
   _SaleInvoices.invoiceno();
    

    TestModellerLogger.SetLastNodeGuid("1bce4ad5-82d4-4024-a3a5-03f616e05d33");
    _SaleInvoices.Select_Nu_Inv_Select_Bank_5("bank1");
    

//    TestModellerLogger.SetLastNodeGuid("226e93e6-a115-494e-938a-90ef9d00b76f");
//    _SaleInvoices.Enter_Nu_Inv_PaymentTerm_6("");
    

    TestModellerLogger.SetLastNodeGuid("816442bc-c3cb-4531-849d-2e6cdb0d010c");
    _SaleInvoices.Enter_Nu_Inv_ReferenceNo_7("12404");
    

    TestModellerLogger.SetLastNodeGuid("993e3c3a-d47a-4dc6-b968-18bc6244017a");
   _SaleInvoices.Select_Nu_Inv_Product_8("saleinvoice");
    

    TestModellerLogger.SetLastNodeGuid("013971c8-b1f4-4f9c-8bcd-479a74f989be");
    _SaleInvoices.Enter_Nu_Inv_UnitPrice_9("1900");
    

    TestModellerLogger.SetLastNodeGuid("e11d4e6e-4ace-4e85-80a9-9662602cb2ce");
    _SaleInvoices.Enter_Nu_Inv_Quantity_10("2");
   
    TestModellerLogger.SetLastNodeGuid("8acc3f99-9ef5-475a-8326-bec64586a975");
    _SaleInvoices.Click_Nu_Inv__Save__15();
    _SaleInvoices.Click_Nu_Inv_Savepopup();
   
//  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
//     pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
//    _sd.Select_Sd_Search_Category_2("Inv#");
//    _sd.Enter_Sd_Search_input_3();
//    _sd.Click_Sd_Search_Update_8();
    
    
    
    
    
    
    
    
    

    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "2aa67e95-a69c-4f1e-bc4f-36b89e2d68cb")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positive69() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="TC69";
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
    

    TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
    _Salemenu.Click_Add_Customer__4();
        
    pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
    _custadd.Enter_Buss_Name_1(data[5]);
    _custadd.Enter_Cust_Fname_2(data[6]);
    _custadd.Enter_Cust_Lname_3(data[7]);
    _custadd.Enter_Customer_Phone_4(data[8]);
    _custadd.Enter_Cust_Customer_email_5(data[9]);
    _custadd.Enter_Cust_Address1(data[10]);
    _custadd.Enter_Cust_Address2(data[11]);
    _custadd.Select_CCountry_10(data[12]);
       _custadd.Click_Click_Form_Save_();
  
       _custadd.Select_Select_Cust_Drpdwn1();
       
       pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
       _SalesDB.Click_Click_Update__btn(); 
        
    

    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "1ea919bd-eb7d-4475-8e19-675f48fa46bd")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positive70() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC70";
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
    

    TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
    _Salemenu.Click_Add_Customer__4();
        
    pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
    _custadd.Enter_Buss_Name_1(data[5]);
    _custadd.Enter_Cust_Fname_2(data[6]);
    _custadd.Enter_Cust_Lname_3(data[7]);
    _custadd.Enter_Customer_Phone_4(data[8]);
    _custadd.Enter_Cust_Customer_email_5(data[9]);
    _custadd.Enter_Cust_Address1(data[10]);
    _custadd.Enter_Cust_Address2(data[11]);
    _custadd.Select_CCountry_10(data[12]);
    	
    	
      pages.Sales_customer_add.AddcustMoreicon _AddcustMoreicon = new pages.Sales_customer_add.AddcustMoreicon(driver);

    _AddcustMoreicon.Click_imgMore_Clicked1();
    
//
//    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
//    _AddcustMoreicon.Enter_Eneter_Ref_num2("data[13]");
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

//    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
//    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

//    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
//    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5("data[14]");
    

//    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
//    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("data[15]");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7(data[16]);
    

//    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
//    _AddcustMoreicon.Select_Select_Payment_8("data[17]");
    
//
//    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
//    _AddcustMoreicon.Select_Enter_Ledger_9("data[18]");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
//    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10(data[19]);
    
//
//    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
//    _AddcustMoreicon.Select_Select_Currency_11(data[20]);
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
   
    //_custadd.Click_Click_Form_Save_();
    
    _custadd.Select_Select_Cust_Drpdwn1();
    
    pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
    _SalesDB.Click_Click_Update__btn();
    
    

    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "891a5149-ac66-4463-9e46-9bab1779113c")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positive71() throws InterruptedException, InvalidFormatException
    {
        
      sTestCaseID="TC71";
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
    

    TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
    _Salemenu.Click_Add_Customer__4();
        
    pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
    _custadd.Enter_Buss_Name_1(data[5]);
    _custadd.Enter_Cust_Fname_2(data[6]);
    _custadd.Enter_Cust_Lname_3(data[7]);
    _custadd.Enter_Customer_Phone_4(data[8]);
    _custadd.Enter_Cust_Customer_email_5(data[9]);
    _custadd.Enter_Cust_Address1(data[10]);
    _custadd.Enter_Cust_Address2(data[11]);
    _custadd.Select_CCountry_10(data[12]);
    	
    	
      pages.Sales_customer_add.AddcustMoreicon _AddcustMoreicon = new pages.Sales_customer_add.AddcustMoreicon(driver);

    _AddcustMoreicon.Click_imgMore_Clicked1();
    

//    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
//    _AddcustMoreicon.Enter_Eneter_Ref_num2("data[13]");
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

//    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
//    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

//    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
//    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5("data[14]");
    
//
//    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
//    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("data[15]");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7(data[16]);
    

//    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
//    _AddcustMoreicon.Select_Select_Payment_8("data[17]");
//    
//
//    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
//    _AddcustMoreicon.Select_Enter_Ledger_9("data[18]");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
//    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10(data[19]);
    

//    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
//    _AddcustMoreicon.Select_Select_Currency_11(data[20]);
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
   
//    _custadd.Click_Click_Form_Save_();
    
    _custadd.Select_Select_Cust_Drpdwn1();
    
    pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
    _SalesDB.Click_Click_Update__btn();
    
    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "ffce24ec-eac1-4fb2-a10a-c43e132aff5b")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positive72() throws InvalidFormatException, InterruptedException
    {
    	  sTestCaseID="TC72";
      	Sheet="Banking";
      	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
      	pages.nlogin _nlogin = new pages.nlogin(driver);
          TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
          _nlogin.GoToUrl();
          

//          TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//          _nlogin.AssertUrl();
          

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
//      TestModellerLogger.SetLastNodeGuid("0a98f50a-b5c0-49c0-a871-f640dac56127");
//      _Salemenu.GoToUrl();
      

      TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
      _Salemenu.Click_Sales_menu1();
      

      TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
      _Salemenu.Click_Sales_View__menu2();
      

      TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
      _Salemenu.Click_Cust_List_3();
      

      TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
      _Salemenu.Click_Add_Customer__4();
          
      pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
      _custadd.Enter_Buss_Name_1(data[5]);
      _custadd.Enter_Cust_Fname_2(data[6]);
      _custadd.Enter_Cust_Lname_3(data[7]);
      _custadd.Enter_Customer_Phone_4(data[8]);
      _custadd.Enter_Cust_Customer_email_5(data[9]);
      _custadd.Enter_Cust_Address1(data[10]);
      _custadd.Enter_Cust_Address2(data[11]);
      _custadd.Select_CCountry_10(data[12]);
      	
      	
        pages.Sales_customer_add.AddcustMoreicon _AddcustMoreicon = new pages.Sales_customer_add.AddcustMoreicon(driver);

      _AddcustMoreicon.Click_imgMore_Clicked1();
      
     TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
      _AddcustMoreicon.Enter_Eneter_Ref_num2(data[13]);
      

//      TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
//      _AddcustMoreicon.Click_Vat_no_Applied_No3();
      

//      TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
//      _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
      

//      TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
//      _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
      

      TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
      _AddcustMoreicon.Select_Select_Customer_Type5(data[14]);
      

//      TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
//      _AddcustMoreicon.Select_Select_Cust_Bus_Type6("data[15]");
      

      TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
      _AddcustMoreicon.Enter_Enter_Note_7(data[16]);
      

//      TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
//      _AddcustMoreicon.Select_Select_Payment_8("data[17]");
      
//
//      TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
//      _AddcustMoreicon.Select_Enter_Ledger_9("data[18]");
//      
//
//      TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
//      _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10(data[19]);
      

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
      _AddcustMoreicon.Select_Select_Currency_11(data[20]);
      

      TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
      _AddcustMoreicon.Click_Click_Save_btn_12();
     
      _custadd.Click_Click_Form_Save_();
      
      _custadd.Select_Select_Cust_Drpdwn1();
      
      pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
      _SalesDB.Click_Click_Update__btn();
      pages.Sales_customer_add.SaleInvoices _SaleInvoices=new pages.Sales_customer_add.SaleInvoices(driver);
		
      _SaleInvoices.Click_Sale_New_menu1();
      
      _SaleInvoices.Click_Click_Create_Nu_Invoice_2();
      

      TestModellerLogger.SetLastNodeGuid("c169edfa-18e6-4217-b238-5de3a7df3e7f");
      _SaleInvoices.Select_Nu_Inv_Customer_1();
      
   
  //
      TestModellerLogger.SetLastNodeGuid("b2c6cddf-27b2-4958-8f39-6ad6f5e5befd");
     _SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
     
     _SaleInvoices.invoiceno();
      

      TestModellerLogger.SetLastNodeGuid("1bce4ad5-82d4-4024-a3a5-03f616e05d33");
      _SaleInvoices.Select_Nu_Inv_Select_Bank_5("bank1");
      

//      TestModellerLogger.SetLastNodeGuid("226e93e6-a115-494e-938a-90ef9d00b76f");
//      _SaleInvoices.Enter_Nu_Inv_PaymentTerm_6("");
      

      TestModellerLogger.SetLastNodeGuid("816442bc-c3cb-4531-849d-2e6cdb0d010c");
      _SaleInvoices.Enter_Nu_Inv_ReferenceNo_7("12502");
      

      TestModellerLogger.SetLastNodeGuid("993e3c3a-d47a-4dc6-b968-18bc6244017a");
     _SaleInvoices.Select_Nu_Inv_Product_8("saleinvoice");
      

      TestModellerLogger.SetLastNodeGuid("013971c8-b1f4-4f9c-8bcd-479a74f989be");
      _SaleInvoices.Enter_Nu_Inv_UnitPrice_9("1900");
      

      TestModellerLogger.SetLastNodeGuid("e11d4e6e-4ace-4e85-80a9-9662602cb2ce");
      _SaleInvoices.Enter_Nu_Inv_Quantity_10("2");
     
      TestModellerLogger.SetLastNodeGuid("8acc3f99-9ef5-475a-8326-bec64586a975");
      _SaleInvoices.Click_Nu_Inv__Save__15();
      _SaleInvoices.Click_Nu_Inv_Savepopup();
     
  //  //_SaleInvoices.Enter_Nu_Inv_InvoiceNo_4();
//       pages.Receive_Payment.SDSearch _sd=new pages.Receive_Payment.SDSearch(driver);
//      _sd.Select_Sd_Search_Category_2("Inv#");
//      _sd.Enter_Sd_Search_input_3();
//      _sd.Click_Sd_Search_Update_8();
      
    

    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "39baf643-ef71-4af0-ab95-db7729ba8587")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positive73() throws InvalidFormatException, InterruptedException
    {
    	  sTestCaseID="TC73";
      	Sheet="Banking";
      	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
      	pages.nlogin _nlogin = new pages.nlogin(driver);
          TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
          _nlogin.GoToUrl();
          

//          TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//          _nlogin.AssertUrl();
          

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
//      TestModellerLogger.SetLastNodeGuid("0a98f50a-b5c0-49c0-a871-f640dac56127");
//      _Salemenu.GoToUrl();
      

      TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
      _Salemenu.Click_Sales_menu1();
      

      TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
      _Salemenu.Click_Sales_View__menu2();
      

      TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
      _Salemenu.Click_Cust_List_3();
      
      pages.Sales_customer_add.SalesDB _db=new pages.Sales_customer_add.SalesDB(driver);
      _db.DownloadCsv();
      
    

    }
    


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "8ad77eb4-680b-4ad8-9fb7-23230b67a417")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv74() throws InvalidFormatException, InterruptedException
    {
    	 sTestCaseID="TC74";
       	Sheet="Banking";
       	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
       	pages.nlogin _nlogin = new pages.nlogin(driver);
           TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
           _nlogin.GoToUrl();
           

//           TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//           _nlogin.AssertUrl();
           

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
//       TestModellerLogger.SetLastNodeGuid("0a98f50a-b5c0-49c0-a871-f640dac56127");
//       _Salemenu.GoToUrl();
       

       TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
       _Salemenu.Click_Sales_menu1();
       

       TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
       _Salemenu.Click_Sales_View__menu2();
       

       TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
       _Salemenu.Click_Cust_List_3();
       
       pages.Sales_customer_add.SalesDB _db=new pages.Sales_customer_add.SalesDB(driver);
       _db.UploadCsv();
       _db.Enter_Choose_Upload_CSV(data[5]);
       
       

    }

    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "38b79f47-ca07-4871-b95a-2e43f462e22f")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv75() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="TC75";
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
    
    
    
    pages.Sales_customer_add.EditCustomer _edt=new pages.Sales_customer_add.EditCustomer(driver);
    
    _edt.Click_Edit_Icon_Clicked1();
    _edt.Enter_Edit_CustomerName1(data[5]);
    _edt.Click_Edit__Save9();

    
    }

    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "77c632e8-ac35-4942-927a-52f934ec48c0")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv76() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="TC76";
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
    
    
    
    pages.Sales_customer_add.EditCustomer _edt=new pages.Sales_customer_add.EditCustomer(driver);
    
    _edt.Click_Delete_Icon_Clicked();
  _edt.Click_Delete_btn_after_del_Click();
       
    

    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "2d9472d6-ac15-427c-9e1f-ddd1f1fc4a17")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv66() throws InterruptedException, InvalidFormatException
    {
        
    	sTestCaseID="TC66";
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
    

    TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
    _Salemenu.Click_Add_Customer__4();
        
    pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
    _custadd.Enter_Buss_Name_1(data[5]);
    _custadd.Enter_Cust_Fname_2(data[6]);
    _custadd.Enter_Cust_Lname_3(data[7]);
    _custadd.Enter_Customer_Phone_4(data[8]);
    _custadd.Enter_Cust_Customer_email_5(data[9]);
    _custadd.Enter_Cust_Address1(data[10]);
    _custadd.Enter_Cust_Address2(data[11]);
    _custadd.Select_CCountry_10(data[12]);
       _custadd.Click_Click_Form_Save_();
  
     _custadd.Select_Select_Cust_Drpdwn1();
       
       pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
       _SalesDB.Click_Click_Update__btn();
       
    }
    


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "ee6ab532-1de7-4965-bd14-dd83ccbfcaee")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv77() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC77";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
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
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
    	
        pages.Sales_customer_add.Salemenu _Salemenu = new pages.Sales_customer_add.Salemenu(driver);
    TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
    _Salemenu.Click_Sales_menu1();
    

    TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
    _Salemenu.Click_Sales_View__menu2();
    

    TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
    _Salemenu.Click_Cust_List_3();
    
    pages.Sales_customer_add.SalesDB _db=new pages.Sales_customer_add.SalesDB(driver);
    _db.Click_Checbox();
  pages.Sales_customer_add.EmailFunction _em=new pages.Sales_customer_add.EmailFunction(driver);
  _em.Select_Select_Banks_1(data[5]);
  _em.Select_Select__lEmailTemplate_4(data[6]);
  _em.Select_Select__lEmailTemplate_4(data[6]);
//_em.Enter_Enter_Subject_6("ok");
		  _em.Click_Enter_Body_7();
 // _em.Enter_Enter_Subject_6(data[7]);
  _em.Click_Enter_Send_8();
  _em.Click_Email_Confirmation_Mesage();
    

    

    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "432c9dce-0820-4752-bedd-b3f6628836a0")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv78() throws InterruptedException, InvalidFormatException
    {
        
       sTestCaseID="TC78";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
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
        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        


        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
        
    	
        pages.Sales_customer_add.Salemenu _Salemenu = new pages.Sales_customer_add.Salemenu(driver);

        TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
    _Salemenu.Click_Sales_menu1();
    

    TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
    _Salemenu.Click_Sales_View__menu2();
    

    TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
    _Salemenu.Click_Cust_List_3();
    
   pages.Sales_customer_add.Sendstatement _stmt=new pages.Sales_customer_add.Sendstatement(driver);
   
   _stmt.Click_Send_Statement_1();
   _stmt.Click_Sent_Mail_icon_3();
   _stmt.Click_Enter_Email_id_3_2();
   _stmt.Click_Click__Send__bttn_3_5();
   

    }


    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "862fb89a-754c-4c44-8aa4-cd07fc1a9838")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv79() throws InvalidFormatException, InterruptedException
    {
        
    	sTestCaseID="TC79";
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
        
       pages.Sales_customer_add.Settingsciscustomer _setting=new pages.Sales_customer_add.Settingsciscustomer(driver);
       
       _setting.Click_Click_Settings__1();
       _setting.Click_Click_Edit_btn_2();
       _setting.Click_Click_SalesInvoice_tab_3();
       _setting.Select_Cis_invoice_dropdown_4(data[21]);
       _setting.Click_Enable_SalesInvoice_5();
       
       _setting.Click_Enable_SalesInvoice_Retention_6();
       _setting.Click_Enable_SalesInvoice_MultiCurrency_7();
       _setting.Click_Enable_SalesInvoice_rDeduction_8();
       _setting.Click_Enable_SalesInvoice_SubcontractorCIS_9();
       _setting.Click_Click__Save__btn_10();
          
        pages.Sales_customer_add.Salemenu _Salemenu = new pages.Sales_customer_add.Salemenu(driver);

    

    TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
    _Salemenu.Click_Sales_menu1();
    

    TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
    _Salemenu.Click_Sales_View__menu2();
    

    TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
    _Salemenu.Click_Cust_List_3();
    

    TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
    _Salemenu.Click_Add_Customer__4();
        
    pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
    _custadd.Enter_Buss_Name_1(data[5]);
    _custadd.Enter_Cust_Fname_2(data[6]);
    _custadd.Enter_Cust_Lname_3(data[7]);
    _custadd.Enter_Customer_Phone_4(data[8]);
    _custadd.Enter_Cust_Customer_email_5(data[9]);
    _custadd.Enter_Cust_Address1(data[10]);
    _custadd.Enter_Cust_Address2(data[11]);
    _custadd.Select_CCountry_10(data[12]);
    	
    	
      pages.Sales_customer_add.AddcustMoreicon _AddcustMoreicon = new pages.Sales_customer_add.AddcustMoreicon(driver);

    _AddcustMoreicon.Click_imgMore_Clicked1();
    
//
//    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
//    _AddcustMoreicon.Enter_Eneter_Ref_num2("data[13]");
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

//    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
//    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

//    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
//    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5(data[14]);
    

//    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
//    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("data[15]");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7(data[16]);
    

//    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
//    _AddcustMoreicon.Select_Select_Payment_8("data[17]");
    
//
//    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
//    _AddcustMoreicon.Select_Enter_Ledger_9("data[18]");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
//    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10(data[19]);
    

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
    _AddcustMoreicon.Select_Select_Currency_11(data[20]);
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
   
    //_custadd.Click_Click_Form_Save_();
    
    _custadd.Select_Select_Cust_Drpdwn1();
    
    pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
    _SalesDB.Click_Click_Update__btn();

    }

    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "cfcdbf2c-5ccb-41e2-ad28-ad3129d2b129")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv80() throws InvalidFormatException, InterruptedException
    {
    	sTestCaseID="TC80";
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
        
//       pages.Sales_customer_add.Settingsciscustomer _setting=new pages.Sales_customer_add.Settingsciscustomer(driver);
//       
//       _setting.Click_Click_Settings__1();
//       _setting.Click_Click_Edit_btn_2();
//       _setting.Click_Click_SalesInvoice_tab_3();
//       _setting.Select_Cis_invoice_dropdown_4(data[21]);
//       _setting.Click_Enable_SalesInvoice_5();
//       
//       _setting.Click_Enable_SalesInvoice_Retention_6();
//       _setting.Click_Enable_SalesInvoice_MultiCurrency_7();
//       _setting.Click_Enable_SalesInvoice_rDeduction_8();
//       _setting.Click_Enable_SalesInvoice_SubcontractorCIS_9();
//       _setting.Click_Click__Save__btn_10();
//          
        pages.Sales_customer_add.Salemenu _Salemenu = new pages.Sales_customer_add.Salemenu(driver);

    

    TestModellerLogger.SetLastNodeGuid("22e43829-5159-4cb1-a5ce-a089edb2006c");
    _Salemenu.Click_Sales_menu1();
    

    TestModellerLogger.SetLastNodeGuid("2ccd6476-863e-4bf9-a7d9-67e190df62b0");
    _Salemenu.Click_Sales_View__menu2();
    

    TestModellerLogger.SetLastNodeGuid("4ae5e2de-30ff-41d0-9925-7116322619c6");
    _Salemenu.Click_Cust_List_3();
    

    TestModellerLogger.SetLastNodeGuid("203dc182-91e2-4eba-b758-f05555920577");
    _Salemenu.Click_Add_Customer__4();
        
    pages.Sales_customer_add.CustAdd _custadd = new  pages.Sales_customer_add.CustAdd(driver);
    _custadd.Enter_Buss_Name_1(data[5]);
    _custadd.Enter_Cust_Fname_2(data[6]);
    _custadd.Enter_Cust_Lname_3(data[7]);
    _custadd.Enter_Customer_Phone_4(data[8]);
    _custadd.Enter_Cust_Customer_email_5(data[9]);
    _custadd.Enter_Cust_Address1(data[10]);
    _custadd.Enter_Cust_Address2(data[11]);
    _custadd.Select_CCountry_10(data[12]);
    	
    	
      pages.Sales_customer_add.AddcustMoreicon _AddcustMoreicon = new pages.Sales_customer_add.AddcustMoreicon(driver);

    _AddcustMoreicon.Click_imgMore_Clicked1();
    

    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
    _AddcustMoreicon.Enter_Eneter_Ref_num2(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

//    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
//    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

//    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
//    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5(data[14]);
    

//    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
//    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("data[15]");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7(data[16]);
    

//    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
//    _AddcustMoreicon.Select_Select_Payment_8("data[17]");
    
//
//    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
//    _AddcustMoreicon.Select_Enter_Ledger_9("data[18]");
//    
//
//    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
//    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10(data[19]);
    

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
    _AddcustMoreicon.Select_Select_Currency_11(data[20]);
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
   
    //_custadd.Click_Click_Form_Save_();
    
    _custadd.Select_Select_Cust_Drpdwn1();
    
    pages.Sales_customer_add.SalesDB _SalesDB = new pages.Sales_customer_add.SalesDB(driver);
    _SalesDB.Click_Click_Update__btn();  
       
    

    }
}
    /*

    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "cf71abbe-0872-444c-8432-8b0391090199")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv10()
    {
        
        pages.AddcustMoreicon _AddcustMoreicon = new pages.AddcustMoreicon(driver);
    TestModellerLogger.SetLastNodeGuid("7818aa29-6277-4f4a-ad45-dae35043fbdc");
    _AddcustMoreicon.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("928adfb6-7b95-43ba-8965-82e2c0f00f96");
    _AddcustMoreicon.Click_imgMore_Clicked1();
    

    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
    _AddcustMoreicon.Enter_Eneter_Ref_num2("");
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5("EU Customer");
    

    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("Business");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7("");
    

    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
    _AddcustMoreicon.Select_Select_Payment_8("Card Takings");
    

    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
    _AddcustMoreicon.Select_Enter_Ledger_9("Trade debtors");
    

    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10("Select");
    

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
    _AddcustMoreicon.Select_Select_Currency_11("Swedish Krona");
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
    

    }

    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "4786d735-bc62-47f5-bcab-748e0c4c1849")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv11()
    {
        
        pages.AddcustMoreicon _AddcustMoreicon = new pages.AddcustMoreicon(driver);
    TestModellerLogger.SetLastNodeGuid("7818aa29-6277-4f4a-ad45-dae35043fbdc");
    _AddcustMoreicon.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("928adfb6-7b95-43ba-8965-82e2c0f00f96");
    _AddcustMoreicon.Click_imgMore_Clicked1();
    

    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
    _AddcustMoreicon.Enter_Eneter_Ref_num2("");
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5("EU Customer");
    

    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("Business");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7("");
    

    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
    _AddcustMoreicon.Select_Select_Payment_8("Card Takings");
    

    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
    _AddcustMoreicon.Select_Enter_Ledger_9("Trade debtors");
    

    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10("Select");
    

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
    _AddcustMoreicon.Select_Select_Currency_11("Mauritius Rupee");
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
    

    }

    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "9f17df8e-67b7-4ce0-a1a9-0e3a2b563486")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv12()
    {
        
        pages.AddcustMoreicon _AddcustMoreicon = new pages.AddcustMoreicon(driver);
    TestModellerLogger.SetLastNodeGuid("7818aa29-6277-4f4a-ad45-dae35043fbdc");
    _AddcustMoreicon.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("928adfb6-7b95-43ba-8965-82e2c0f00f96");
    _AddcustMoreicon.Click_imgMore_Clicked1();
    

    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
    _AddcustMoreicon.Enter_Eneter_Ref_num2("");
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5("EU Customer");
    

    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("Business");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7("");
    

    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
    _AddcustMoreicon.Select_Select_Payment_8("Card Takings");
    

    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
    _AddcustMoreicon.Select_Enter_Ledger_9("Trade debtors");
    

    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10("Select");
    

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
    _AddcustMoreicon.Select_Select_Currency_11("Danish Krone");
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
    

    }

    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "a8f17f9c-51b5-400d-b702-8e314f3b99ad")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv13()
    {
        
        pages.AddcustMoreicon _AddcustMoreicon = new pages.AddcustMoreicon(driver);
    TestModellerLogger.SetLastNodeGuid("7818aa29-6277-4f4a-ad45-dae35043fbdc");
    _AddcustMoreicon.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("928adfb6-7b95-43ba-8965-82e2c0f00f96");
    _AddcustMoreicon.Click_imgMore_Clicked1();
    

    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
    _AddcustMoreicon.Enter_Eneter_Ref_num2("");
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5("EU Customer");
    

    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("Business");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7("");
    

    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
    _AddcustMoreicon.Select_Select_Payment_8("Card Takings");
    

    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
    _AddcustMoreicon.Select_Enter_Ledger_9("Trade debtors");
    

    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10("Select");
    

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
    _AddcustMoreicon.Select_Select_Currency_11("Australian Dollar");
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
    

    }

    @Test  (groups= {"add_more_info","add_more_info - Add_cust_more"})
    @TestModellerPath(guid = "9df724a1-672b-42b0-8565-a4534065e1c6")
    public void GoToUrlClickimgMoreClicked1EnterEneterRefnum2ClickVatnoAppliedNo3ClickVatnoAppliedYes3Positiv14()
    {
        
        pages.AddcustMoreicon _AddcustMoreicon = new pages.AddcustMoreicon(driver);
    TestModellerLogger.SetLastNodeGuid("7818aa29-6277-4f4a-ad45-dae35043fbdc");
    _AddcustMoreicon.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("928adfb6-7b95-43ba-8965-82e2c0f00f96");
    _AddcustMoreicon.Click_imgMore_Clicked1();
    

    TestModellerLogger.SetLastNodeGuid("825c8c6a-2fd7-47ba-b741-8c01f2c7afd5");
    _AddcustMoreicon.Enter_Eneter_Ref_num2("");
    

    TestModellerLogger.SetLastNodeGuid("ecd6f15d-edf3-411c-87e4-be747644d51e");
    _AddcustMoreicon.Click_Vat_no_Applied_No3();
    

    TestModellerLogger.SetLastNodeGuid("be11ab5e-6fb7-454a-accd-73609ca6a698");
    _AddcustMoreicon.Click_Vat_no_Applied_Yes3();
    

    TestModellerLogger.SetLastNodeGuid("189c7ebe-d614-49fd-b14b-b38e513c92b6");
    _AddcustMoreicon.Enter_Enter_Vat_Number4("100");
    

    TestModellerLogger.SetLastNodeGuid("003caa01-4869-4a6f-8f09-d7c79a0e0b8c");
    _AddcustMoreicon.Select_Select_Customer_Type5("EU Customer");
    

    TestModellerLogger.SetLastNodeGuid("8569ba40-a749-41d8-9d05-927556ca1baa");
    _AddcustMoreicon.Select_Select_Cust_Bus_Type6("Business");
    

    TestModellerLogger.SetLastNodeGuid("65351183-e884-46d5-b472-55c87247afe9");
    _AddcustMoreicon.Enter_Enter_Note_7("");
    

    TestModellerLogger.SetLastNodeGuid("60c1d070-bda5-497c-80da-f643f5872594");
    _AddcustMoreicon.Select_Select_Payment_8("Card Takings");
    

    TestModellerLogger.SetLastNodeGuid("e93227b6-5e0c-4f6f-aff1-a98fe35cbc66");
    _AddcustMoreicon.Select_Enter_Ledger_9("Trade debtors");
    

    TestModellerLogger.SetLastNodeGuid("4c862a3d-9009-4100-bbcf-3969bc74f8ff");
    _AddcustMoreicon.Select_Select_Credit_Control_Status_Type_10("Select");
    

    TestModellerLogger.SetLastNodeGuid("afdb0eb4-2076-455c-8177-3f1f743c7705");
    _AddcustMoreicon.Select_Select_Currency_11("Norwegian krone");
    

    TestModellerLogger.SetLastNodeGuid("19ab75cb-425c-4bab-bad7-17ef7e6fed53");
    _AddcustMoreicon.Click_Click_Save_btn_12();
    

    }

}*/