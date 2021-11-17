package tests;

import reports.TestNGListener;
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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a6af8c2b-cea7-4c27-9a9f-f0f88ba4ed7f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 997, profileId = 100893)
public class tr_nidbanktrn1 extends TestBase
{
	 
		String sTestCaseID=null;
	    String[] data=null;
	    String Sheet =null;

    
    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "e267114f-419d-45e6-885e-92b14bc1b012")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl1() throws InterruptedException, IOException, InvalidFormatException
    {
    	sTestCaseID="UNR_SUP1";
    	Sheet="VAT3";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
   // TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    


   // TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN(data[1]);
    

    //TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
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
//    
//    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//    _AgentSearch.Select_status_dropdown("Show All");
//    
//    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
//    _AgentSearch.Select_status_dropdown("Show All");
//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
   

  TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
   _bankmenu.Click_Bankingmenu();
   

   TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
   _bankmenu.Click_Newmenu();
   
   TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
   _bankmenu.Click_New_Transactionclick();

//pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
pages.Currency_Multi.nBANKTRN _nBANKTRN =new pages.Currency_Multi.nBANKTRN(driver);

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt(data[9]);
    

  TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2(data[11]);
 
       TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_1();

    

    }
}
     
/*
    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "41267028-946b-4eb6-82e8-23c05061a91c")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl2()
    {
    	sTestCaseID="TC2";
    	Sheet="Sheet1";
    	data =ExcelData.toReadExcelData("TC1", "Sheet1");
        pages.nlogin _nlogin = new pages.nlogin(driver);
      TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
      _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("8hXb0DPPGI");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);
    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    

////    TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//    _AgentSearch.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("sit");
    

    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//    _Searchclient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Herzog Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
//    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
//    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

    }

    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "0d9526cc-157b-4ca4-b6fe-ca7c9cf80d67")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl3()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("qsQNztJEJ4");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Schinner - Funk");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

    }

    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "745a17e2-a84d-4a11-b65b-46c0b7903336")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl4()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("NwD4qeliky");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("mollitia");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Fahey Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

    }

    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "b192c36b-fd7d-425e-a3d3-8b53dafaf8ee")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl5()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("762Slc8jNu");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("eius");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Stroman, Bode and Krajcik");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

    }

    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "b0623bb7-65a2-4453-9936-c48c464b3647")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl6()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("_50ud5oYc4");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("consequuntur");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Legros - Beahan");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("2020-06-05 23:42:32");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

    }

    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "728085a5-85bb-4c41-82dd-d04e06c56d50")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl7()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("RNNtqeg5W7");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("delectus");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Nicolas, Schoen and Miller");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("nidhibank");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("2021-07-27 20:19:45");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

    }

    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "44adb444-615f-4d6a-bcf4-ef6bd5be2be5")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl8()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("59oImXZ51q");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ut");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Collier Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("Nidhilimited1");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

    }

    @Test  (groups= {"1tr","1tr - nidbanktrn"})
    @TestModellerPath(guid = "0fbb92d4-1b6a-4a37-8950-8ac7c3a37496")
    public void nidbanktrnGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAssertUrlCl9()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("TaFhJqGRjo");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("dicta");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Parker - Grimes");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    TestModellerLogger.SetLastNodeGuid("dd264f34-0334-46b7-9855-c5572bcefb82");
    _bankmenu.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("261d0a9e-9ba4-454f-9499-0653695e292a");
    _bankmenu.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd431e1c-5f14-4042-85e6-c92307a9ba2b");
    _bankmenu.Click_Bankingmenu();
    

    TestModellerLogger.SetLastNodeGuid("393c1872-a4cc-4710-8a03-f5053253baa4");
    _bankmenu.Click_Newmenu();
    

pages.nBANKTRN _nBANKTRN = new pages.nBANKTRN(driver);
    TestModellerLogger.SetLastNodeGuid("04a80b29-ca7e-432d-aae4-cc8cb6604a1e");
    _nBANKTRN.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0dd2fe9-0820-4a0f-986f-e9e2d7101a55");
    _nBANKTRN.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9440758-2f86-4894-829c-0d5b167b4d77");
    _nBANKTRN.Select_BK_SELECT("Nidlimited");
    

    TestModellerLogger.SetLastNodeGuid("3f2cfb4f-290b-419a-9ed6-4e05cf7a2f84");
    _nBANKTRN.Enter_NDate("44233");
    

    TestModellerLogger.SetLastNodeGuid("10e5cab1-05f8-476d-a283-f0a589c153b9");
    _nBANKTRN.Enter_n_desc("");
    

    TestModellerLogger.SetLastNodeGuid("0f5a2a25-9705-4e67-8818-b65654218779");
    _nBANKTRN.Enter_Recived_amt("");
    

    TestModellerLogger.SetLastNodeGuid("c690e93b-6b55-451f-b3be-8e8499f0cee5");
    _nBANKTRN.Enter_spnt_amt("");
    

    TestModellerLogger.SetLastNodeGuid("5f6292f3-6e4e-41f5-a9ed-fbf01a27951f");
    _nBANKTRN.Select_Select_VATRate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("76cc92bc-1ec4-436a-b43a-396af0f3df0b");
    _nBANKTRN.Click_Select_Option1();
    

    TestModellerLogger.SetLastNodeGuid("8cb869ce-983f-422b-a7ab-11f2359ec333");
    _nBANKTRN.Enter_BOX2("");
    

    TestModellerLogger.SetLastNodeGuid("8589c653-c831-4d3c-a70b-566928561494");
    _nBANKTRN.Click__1400_DATA();
    

    TestModellerLogger.SetLastNodeGuid("392f9d4d-b082-42d6-8f76-9054b29928ae");
    _nBANKTRN.Click__Save_();
    

    }

}
    */