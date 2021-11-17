package tests.Bank_Rule;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.BankRule.*;
//import pages.BankRule.BankRuleCreate_Standard;
import pages.BankRule.BankRuleUNR_Runrl;

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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f05343ee-f6c2-439d-8b9f-8285da5a75ae
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1779, profileId = 102234)
public class Rule1_rule1 extends TestBase
{
	String sTestCaseID=null;
    String[] data=null;
    String Sheet =null;

    
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "d4b18723-b1dd-48ba-a67c-35968eb4301f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi() throws InterruptedException, IOException, InvalidFormatException
    {
    	sTestCaseID="TC1";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
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
    
    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
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
    
        pages.bankmenu _bankmenu = new pages.bankmenu(driver);
        _bankmenu.Click_Bankingmenu();
        
        pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
        
        _bankview.Click_Bank_Menu_View();
        
        _bankview.Click_Bank__Rules_dropdown();
        
      pages.BankRule.BankRuleCr_Stdard_Credit _rulecreate2=new pages.BankRule.BankRuleCr_Stdard_Credit(driver);

 
        
        _rulecreate2.enterFrsmedata();       
        
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4484047e-1435-40bf-84e4-93295b93c6c4")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi1() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC1.2";
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

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Stdard_Both _rulecreate2=new pages.BankRule.BankRuleCr_Stdard_Both(driver);


    
    _rulecreate2.enterFrsmedata();   
    }


    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "fed4dbec-783a-45fa-8a62-35a8dff836c0")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi4() throws InvalidFormatException, InterruptedException, IOException
    {
        
    	sTestCaseID="TC1.3";
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

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    



    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    	    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    	    _Searchclient.GoToUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    

    	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    	    _Searchclient.Click__NidhiEnt();
    	    

    	    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    	    _bankmenu.Click_Bankingmenu();
    	    
    	    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    	    
    	    _bankview.Click_Bank_Menu_View();
    	    
    	    _bankview.Click_Bank__Rules_dropdown();
    	    
    	  pages.BankRule.BankRuleCr_Stdard_Debit _rulecreate3=new pages.BankRule.BankRuleCr_Stdard_Debit(driver);

    	   // _rulecreate.Click_Add_Bank_rule_btn();
    	    
    	    _rulecreate3.enterFrsmedata();   
      

    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "240d72a4-3691-48ed-876b-b7104e2d7fff")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi7() throws InvalidFormatException, InterruptedException, IOException
    {
        
    	sTestCaseID="TC2";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    
        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_ReducedRte_Both _rulecreate1=new pages.BankRule.BankRuleCr_ReducedRte_Both(driver);

   // _rulecreate.Click_Add_Bank_rule_btn();
    
    _rulecreate1.enterFrsmedata();   
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos1() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC2.1";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

      pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Reducedrte_Credit _rulecreate2=new pages.BankRule.BankRuleCr_Reducedrte_Credit(driver);

   // _rulecreate.Click_Add_Bank_rule_btn();
    
    _rulecreate2.enterFrsmedata();   
    

    }
  

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi8() throws InterruptedException, InvalidFormatException, IOException
    {
        
    	sTestCaseID="TC2.2";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

          pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Reducedrte_Debit _rulecreate3=new pages.BankRule.BankRuleCr_Reducedrte_Debit(driver);

   // _rulecreate.Click_Add_Bank_rule_btn();
    
    _rulecreate3.enterFrsmedata();  
    }
   
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos8() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC3";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

//    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("admin");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("support@1");
    

    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    _nlogin.Click_Login();
    

pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);

    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    _AgentSearch.GoToUrl();
    
    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("agent_rule2");

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);


    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Business_rule2");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
        
      pages.BankRule.BankRuleCr_NoVat_Both _rulecreate1=new pages.BankRule.BankRuleCr_NoVat_Both(driver);

 
        
        _rulecreate1.enterFrsmedata();       
    

    }
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi10() throws InterruptedException, InvalidFormatException, IOException
    {
    	sTestCaseID="TC3.1";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
    	 pages.nlogin _nlogin = new pages.nlogin(driver);
    	    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    	    _nlogin.GoToUrl();
    	    

//    	    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
//    	    _nlogin.AssertUrl();
    	    

    	    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    	    _nlogin.Enter_nLOGIN("admin");
    	    

    	    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    	    _nlogin.Enter_nPASS("support@1");
    	    

    	    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
    	    _nlogin.Click_Login();
    	    

    	pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);

    	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
    	    _AgentSearch.GoToUrl();
    	    
    	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    	    _AgentSearch.Click_Agents();
    	    

    	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("agent_rule2");

    	//    
    	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    	    _AgentSearch.Click_Search();
    	    

    	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    	    _AgentSearch.Click__Nidhi1_();
    	    

    	pages.Searchclient _Searchclient = new pages.Searchclient(driver);


    	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    	    _Searchclient.Click__Clients_();
    	    

    	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Business_rule2");
    	    

    	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    	    _Searchclient.Click_Searchbtn();
    	    

    	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    	    _Searchclient.Click__NidhiEnt();
    	    

    	    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    	    _bankmenu.Click_Bankingmenu();
    	    
    	    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    	    
    	    _bankview.Click_Bank_Menu_View();
    	    
    	    _bankview.Click_Bank__Rules_dropdown();
    	        
    
  pages.BankRule.BankRuleCr_NoVat_Debit _rulecreate2=new pages.BankRule.BankRuleCr_NoVat_Debit(driver);


    
    _rulecreate2.enterFrsmedata();       
    	
    }


    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos11() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC3.2";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
    	 pages.nlogin _nlogin = new pages.nlogin(driver);
 	    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
 	    _nlogin.GoToUrl();
 	    

// 	    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
// 	    _nlogin.AssertUrl();
 	    

 	    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
 	    _nlogin.Enter_nLOGIN("admin");
 	    

 	    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
 	    _nlogin.Enter_nPASS("support@1");
 	    

 	    TestModellerLogger.SetLastNodeGuid("65be46e9-be5a-4110-9b6f-e4a4dd68b91c");
 	    _nlogin.Click_Login();
 	    

 	pages.AgentSearch _AgentSearch = new pages.AgentSearch(driver);

 	    TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
 	    _AgentSearch.GoToUrl();
 	    
 	    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
 	    _AgentSearch.Click_Agents();
 	    

 	    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
 	    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("agent_rule2");

 	//    
 	    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
 	    _AgentSearch.Click_Search();
 	    

 	    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
 	    _AgentSearch.Click__Nidhi1_();
 	    

 	pages.Searchclient _Searchclient = new pages.Searchclient(driver);


 	    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
 	    _Searchclient.Click__Clients_();
 	    

 	    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
 	    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Business_rule2");
 	    

 	    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
 	    _Searchclient.Click_Searchbtn();
 	    

 	    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
 	    _Searchclient.Click__NidhiEnt();
 	    

 	    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
 	    _bankmenu.Click_Bankingmenu();
 	    
 	    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
 	    
 	    _bankview.Click_Bank_Menu_View();
 	    
 	    _bankview.Click_Bank__Rules_dropdown();
 	        
    
  pages.BankRule.BankRuleCr_NoVat_Crdit _rulecreate3=new pages.BankRule.BankRuleCr_NoVat_Crdit(driver);


    
    _rulecreate3.enterFrsmedata();   

}

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos12() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC4";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_ZroRate_Both _rulecreate1=new pages.BankRule.BankRuleCr_ZroRate_Both(driver);

    _rulecreate1.enterFrsmedata();  

        
    
    }
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos13() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC4.1";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_ZroRate_Credit _rulecreate2=new pages.BankRule.BankRuleCr_ZroRate_Credit(driver);


    
    _rulecreate2.enterFrsmedata();  
    }
    
    
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos14() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC4.2";
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

        TestModellerLogger.SetLastNodeGuid("7bf1bf3d-3f35-4ed2-bb5c-3cc6de7f40bc");
        _AgentSearch.GoToUrl();
        



        TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
        _AgentSearch.Click_Agents();
        

        TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
        _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

    //    
        TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
        _AgentSearch.Click_Search();
        

        TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
        _AgentSearch.Click__Nidhi1_();
        

    pages.Searchclient _Searchclient = new pages.Searchclient(driver);
        TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
        _Searchclient.GoToUrl();
        

        TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
        _Searchclient.Click__Clients_();
        

        TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
        _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
        

        TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
        _Searchclient.Click_Searchbtn();
        

        TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
        _Searchclient.Click__NidhiEnt();
       
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_ZroRate_Debit _rulecreate3=new pages.BankRule.BankRuleCr_ZroRate_Debit(driver);

    
    _rulecreate3.enterFrsmedata();  

    }  

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos15() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC5";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
     pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Expt_Both _rulecreate1=new pages.BankRule.BankRuleCr_Expt_Both(driver);


    
    _rulecreate1.enterFrsmedata();  

      }
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi21() throws InterruptedException, InvalidFormatException, IOException
    {
        
    	sTestCaseID="TC5.1";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

         pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Expt_Crdit _rulecreate2=new pages.BankRule.BankRuleCr_Expt_Crdit(driver);
    _rulecreate2.enterFrsmedata();  
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos16() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC5.2";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
 pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Expt_Debit _rulecreate3=new pages.BankRule.BankRuleCr_Expt_Debit(driver);


    
    _rulecreate3.enterFrsmedata();     

    }
   
 
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos17() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC6";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Outofscope_Both _rulecreate1=new pages.BankRule.BankRuleCr_Outofscope_Both(driver);


    
    _rulecreate1.enterFrsmedata();
    

    }
    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "90709375-ff5b-4f7f-b6a2-5f594f1c3ca7")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePosi9() throws InterruptedException, InvalidFormatException, IOException
    {
        
    	sTestCaseID="TC6.1";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Outofscope_Crdit _rulecreate2=new pages.BankRule.BankRuleCr_Outofscope_Crdit(driver);


    
    _rulecreate2.enterFrsmedata(); 

      
    }

    @Test  (groups= {"Rule1","Rule1 - rule1"})
    @TestModellerPath(guid = "4520f772-f383-4c13-847a-fa828635477f")
    public void GoToUrlClickMenuBankRulesPositiveSelectConditionFormulaEnterRuleDescClickAccountSelectcodePos18() throws InterruptedException, IOException, InvalidFormatException
    {
        
    	sTestCaseID="TC6.2";
    	Sheet="Banking";
    	data =ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	        
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
    



    TestModellerLogger.SetLastNodeGuid("549c0b87-688a-4f18-ac03-9f3aad6dbf82");
    _AgentSearch.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9afd81f0-5ffc-4b6b-9602-9604f0d3d258");
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName(data[3]);

//    
    TestModellerLogger.SetLastNodeGuid("07dbb419-90f6-4465-abc7-dbab418b3c97");
    _AgentSearch.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("e6cc45f1-3468-4b0c-84f6-8a7672384eca");
    _AgentSearch.Click__Nidhi1_();
    

pages.Searchclient _Searchclient = new pages.Searchclient(driver);
    TestModellerLogger.SetLastNodeGuid("6588bb30-8aa9-47e3-9c47-f23afcd5d814");
    _Searchclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8023221d-99f0-4bdf-bb06-f610defd9ebd");
    _Searchclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a71cb6de-7787-4e86-ac83-a09ab1ce3b13");
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    
    pages.bankmenu _bankmenu = new pages.bankmenu(driver);
    _bankmenu.Click_Bankingmenu();
    
    pages.BankRule.bankview _bankview = new pages.BankRule.bankview(driver);
    
    _bankview.Click_Bank_Menu_View();
    
    _bankview.Click_Bank__Rules_dropdown();
    
  pages.BankRule.BankRuleCr_Outofscope_Both _rulecreate3=new pages.BankRule.BankRuleCr_Outofscope_Both(driver);


    
    _rulecreate3.enterFrsmedata(); 
       
    }
}

    
    