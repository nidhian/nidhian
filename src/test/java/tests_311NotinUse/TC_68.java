package tests.Ticket311;
import pages.SM311.*;
import reports.TestNGListener;
import tests.TestBase;
import tests.provider;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;
import utilities.ExcelData;
import utilities.Excelfordp;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7b912838-9d7f-45bb-b428-a7835e6c096b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1709, profileId = 102045)

public class TC_68 extends TestBase
{

    
	public String sTestCaseID=null;
	String[] data=null;
	String Sheet = null;
	//@Test(dataProviderClass=provider.class,dataProvider="getData")
@Test  (groups= {"sm-311","sm-311 - Ticket-311"})
    @TestModellerPath(guid = "eb8a86f2-0ebb-4073-bde4-c13aafa2f717")
    public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive() throws InterruptedException, InvalidFormatException, IOException
    {
        
    	sTestCaseID="TC68";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
//        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
//        _AgentSearch.GoToUrl();
    

//        TestModellerLogger.SetLastNodeGuid("554b508e-c8b1-424a-a74b-723fc92f0453");
//        _AgentSearch.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);
        

        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
//        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
//        _Searchclient.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("9b4a89f1-4dd6-4c9d-a653-42321721ed34");
//        _Searchclient.AssertUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        

    

    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);


   TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
   _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

 TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();

    }


}
/*

 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive2() throws InvalidFormatException, InterruptedException, IOException
 {
		sTestCaseID="TC2";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        


    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);

    

    TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
    _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();
    
 }
}
/*
 
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive3() throws InvalidFormatException, InterruptedException, IOException
 {
		sTestCaseID="TC3";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        


    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//    TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//    _sm311.Enter_SearchCode_input("");
    

    TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
    _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();
 }
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive4() throws InvalidFormatException, InterruptedException, IOException
 {
		sTestCaseID="TC4";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        


    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//    TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//    _sm311.Enter_SearchCode_input("");
    

    TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
    _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();
    
 }
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive5() throws InvalidFormatException, InterruptedException, IOException
 {
		sTestCaseID="TC5";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        


    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//    TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//    _sm311.Enter_SearchCode_input("");
    

    TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
    _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();
 
 
 }
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive6() throws InvalidFormatException, InterruptedException, IOException
 {
		sTestCaseID="TC6";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        


    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//    TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//    _sm311.Enter_SearchCode_input("");
    

    TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
    _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();
 }
 
 
 
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive7() throws InterruptedException, InvalidFormatException, IOException
{
 sTestCaseID="TC7";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();
}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive8() throws InvalidFormatException, InterruptedException, IOException
 {
		sTestCaseID="TC8";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        


    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//    TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//    _sm311.Enter_SearchCode_input("");
    

    TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
    _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();
 }
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive9() throws InvalidFormatException, InterruptedException, IOException
 {
		sTestCaseID="TC9";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        


    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//    TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//    _sm311.Enter_SearchCode_input("");
    

    TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
    _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();
 }
 
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive10() throws InterruptedException, InvalidFormatException, IOException
 {
 sTestCaseID="TC10";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();
}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive11() throws InvalidFormatException, InterruptedException, IOException
 {
		sTestCaseID="TC11";
       	Sheet="sm-311";
        data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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

      pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
        


    TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
    _sm311.Click_AdvisorToolsToplft();
    

    TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
    _sm311.Click_NominalCod_link();
    
    pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//    TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//    _sm311.Enter_SearchCode_input("");
    

    TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
    _nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
    _nominal.Click_Search();
 }
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive12() throws InterruptedException, IOException, InvalidFormatException
{
 sTestCaseID="TC12";
 Sheet="sm-311";
 try {
	data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
} catch (InvalidFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 pages.nlogin _nlogin = new pages.nlogin(driver);

   
 TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 try {
	_nlogin.GoToUrl();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 

 

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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();
}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive13() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC13";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();
}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive14() throws InvalidFormatException, InterruptedException, IOException
{

 sTestCaseID="TC14";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();
}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive15() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC15";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();
}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive16() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC16";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive17() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC17";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();
}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive18() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC18";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive19() throws InterruptedException, InvalidFormatException, IOException
{
 sTestCaseID="TC19";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive20() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC20";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive21() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC21";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive22() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC22";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();
}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive23() throws InterruptedException, InvalidFormatException, IOException
{
 sTestCaseID="TC23";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive24() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC24";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();}
 public void GoToUrlAssertUrlClickAdvisorToolsToplftClickNominalCodlinkPositiveEnterSearchCodeinputPositive25() throws InvalidFormatException, InterruptedException, IOException
{
 sTestCaseID="TC25";
 Sheet="sm-311";
 data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
 
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

pages.SM311.sm311 _sm311=new pages.SM311.sm311(driver);
 


TestModellerLogger.SetLastNodeGuid("5bf3b43a-0a06-43ad-972f-b25574344912");
_sm311.Click_AdvisorToolsToplft();


TestModellerLogger.SetLastNodeGuid("ab5cab8e-3520-4418-b1c9-15d91790e67a");
_sm311.Click_NominalCod_link();

pages.SM311.nominalcode _nominal=new pages.SM311.nominalcode(driver);
//TestModellerLogger.SetLastNodeGuid("2497df88-a793-4a04-8823-2f99eaf487ea");
//_sm311.Enter_SearchCode_input("");


TestModellerLogger.SetLastNodeGuid("69f8ad96-bce7-4b9a-8bf4-60999496a596");
_nominal.Enter_ctl00cPHFiltertxtAccountName(data[5]);


TestModellerLogger.SetLastNodeGuid("2f8747b9-b5b2-48f6-b4a3-fdf79b8a323b");
_nominal.Click_Search();

}*/


