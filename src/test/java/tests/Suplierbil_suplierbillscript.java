package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/bb444ad2-d59f-456d-bcff-b7d701bd7a45
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1373, profileId = 101242)
public class Suplierbil_suplierbillscript extends TestBase
{
    

    
    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "09af9918-fdfe-4b67-8f40-a57d5e3a8f1f")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse1()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Z3FhqNWUL9");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("praesentium");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Keeling - Renner");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Quia ut qui aliquid aspernatur et et dolore explicabo.
Veritatis saepe et aut et assumenda veritatis officiis alias ad.
Rerum velit aspernatur fugit culpa animi et dolores velit.
Voluptatem libero dolores consequatur sed maxime nihil nulla.
Modi adipisci quia perferendis corrupti repudiandae quia.
Quo minus laboriosam dolorum eos.
Quasi incidunt iste quisquam.
Sint corporis omnis facere.
Veniam quibusdam tempora non velit repellendus accusantium ex doloremque nihil.
In dolorum in.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "ff13e47b-ec69-4c8f-8f2b-17f8274f1f53")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse2()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("mJMrfk2uUj");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("facere");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Herman - Sanford");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Est et sunt non impedit maiores deserunt quo.
Quos laborum sequi aut.
Odit doloribus est.
Aperiam quaerat libero quod et dolorum eius alias rerum cumque.
Officia dolores amet libero.
Excepturi neque modi modi illo debitis et esse ex in.
Voluptate voluptates et modi veniam at blanditiis in rem voluptatem.
Vel totam impedit nihil aspernatur necessitatibus natus ut ex nihil.
Consectetur cupiditate rerum assumenda iure non.
Dolorem magnam eum quis.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Zero Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "38600e77-96ae-4f00-9e17-5edc3971191e")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse3()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("64RQeL8o75");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("unde");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Donnelly - Friesen");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Vero illum eius perspiciatis molestiae quisquam voluptates.
Sint totam cupiditate et facilis.
Similique sunt illum eveniet laborum est velit est et.
Harum veniam quis delectus neque perferendis officiis culpa.
Veniam qui error quasi aut necessitatibus.
Ut sed ex enim sequi.
Iste dolores asperiores est itaque et id.
Consequuntur dolorem perferendis perspiciatis.
Rerum et rerum fugit et mollitia rerum et ea quis.
Voluptatem nihil aut.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Reduced Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "a9e345d9-023a-453e-b27f-5a911f774119")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse4()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("cGCtoVahDf");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("iure");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Cole, Jones and Nolan");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Mollitia dicta at cum non soluta adipisci omnis doloribus libero.
Est dolores voluptatem sint.
Atque voluptatem qui voluptates minima aut facilis nihil laboriosam.
Et sed qui.
Dolores molestias omnis corporis molestias consequuntur.
Vero nemo voluptate sed reprehenderit voluptatibus.
Nulla est nisi incidunt labore in et quas autem.
Distinctio fuga odio et suscipit.
Et doloribus dolorum.
Quia quisquam nulla adipisci excepturi temporibus ut.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("No VAT");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "81b265a7-7f55-4817-b7e9-e374e6d958a3")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse5()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("AgtEFgfQ12");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("maiores");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Wisoky - Paucek");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Nobis ab occaecati velit nisi perspiciatis est dignissimos et consequuntur.
Voluptatem porro qui ab iusto temporibus sapiente delectus est.
Animi vero rerum aliquid soluta doloremque debitis voluptatem.
Officia nihil omnis et.
Ullam odit sint.
Fugiat fugit unde.
Qui necessitatibus est nam.
Eligendi tenetur velit ipsum blanditiis accusamus magnam.
Adipisci aut pariatur.
Excepturi eveniet exercitationem dignissimos sed autem animi sunt.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Exempt");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "47f87c23-d519-48da-b917-634100d74542")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse6()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("gOlqoQkPht");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("vel");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Nitzsche and Sons");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Sit odit tempora nam ea voluptatem.
Aliquam voluptas sint sint.
In neque rerum.
Et minima voluptas quia neque eligendi temporibus.
Odit et repellat porro.
Blanditiis fugit velit.
Quo sit facilis aut est corrupti vel dignissimos eum et.
Ut qui iusto ex labore sunt.
Eos rerum voluptatum.
Voluptas voluptatem explicabo iste.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Out of Scope");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "48af3e9a-52ed-48e7-b60b-f8c9e846b4cf")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse7()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("SNu4QFIIuU");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("deleniti");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Goldner Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Purchases");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Reprehenderit aut assumenda odio et alias voluptas.
Ab minus quos.
Tempore voluptatem est magni quidem in occaecati itaque ab facere.
Magni porro aut voluptatem sit.
Dolor ut soluta voluptatem.
Repudiandae dolorem suscipit et commodi eum aut sint.
Veritatis voluptatem illum distinctio maxime.
Omnis quod rerum quia ut rem rerum.
Rerum est et quod nemo aut accusamus adipisci.
Et eaque voluptate et quibusdam voluptatibus non est sapiente.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "e526de1b-2f5e-4b60-a694-080f4a398a4d")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse8()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("3rcowml6tg");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("dolorem");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Lind LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Subcontractors");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Non maxime sunt libero impedit reprehenderit et non.
Fuga suscipit maxime delectus possimus molestiae et culpa recusandae sequi.
Provident dolorem in modi eveniet.
Et exercitationem magnam odio debitis.
Libero aut ab totam.
Nostrum eum explicabo quam eveniet consequatur mollitia.
Nam voluptatum soluta rem.
Ut tempora sed at.
Odit ut et est.
Sapiente sunt sapiente qui placeat.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "bbb89f8b-9e23-488d-9fa5-cade4b703192")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAsse9()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("FVvwfka4_2");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("nulla");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Cole - Stiedemann");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Accountancy fee");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Vel itaque rerum.
Minus occaecati atque.
Pariatur recusandae omnis nulla.
Qui laborum aut molestias exercitationem laborum quia inventore non non.
Ut dolorem ut qui numquam.
Quo repudiandae aspernatur amet voluptatem molestiae omnis voluptas.
Assumenda fuga molestiae.
Cumque ut a.
Est minima est.
Dolorem molestiae non a rerum.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "d14f9a8a-44f6-4c07-8f42-7b9db8206fd9")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss10()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("QbEHJ7bB6R");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ad");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Treutel - Price");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Advertising, sales promotion, marketing");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Voluptatem qui omnis necessitatibus quia odio molestiae perferendis doloribus.
Tempora vel sint aut voluptatem consectetur temporibus.
Aut ut id et non enim sit.
Natus et et beatae doloremque dolorem accusantium.
Quidem asperiores ratione sunt vero voluptatum cum.
Est quia similique.
Ipsum aut ea consequatur inventore et quia rerum modi qui.
Quos natus culpa aut omnis.
Voluptates perspiciatis in aliquid recusandae totam.
Quae cumque id provident exercitationem.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "af81b0fc-c6e0-447a-83dd-b1076f8c2166")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss11()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("AQmisE2HQE");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("fuga");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Kub Inc");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Bank, card and overdraft charges");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Harum dolorem qui ut rerum dolores a ex.
Deserunt deserunt cumque esse.
Repellendus ipsum sequi et non.
Necessitatibus quam optio numquam sunt tempora facilis reprehenderit ipsum.
Recusandae qui qui et voluptate sed.
Amet aut fugit nam nam tenetur fugit unde distinctio.
Nostrum accusamus ex sed neque quis itaque pariatur non.
Quis nam esse quos similique sit.
Expedita adipisci debitis quia molestiae magnam consequatur ut.
Velit explicabo modi laudantium qui libero voluptates ea.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "d333760a-4912-46e8-b995-31a4e89308d3")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss12()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("0z3qyTsLiN");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("itaque");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Denesik, Terry and Vandervort");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Business entertaining");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Aliquid repellendus et consequatur dolorum doloribus.
Sed a nulla et.
Necessitatibus nihil facere aut eos quae consequatur consequatur.
Ipsum asperiores dolor qui sit itaque ducimus ut repellendus asperiores.
Numquam consequuntur ipsam consequuntur placeat maiores ut dolorem.
Ut et eaque voluptas.
Quia est assumenda vel corrupti ab.
Aut sunt sit.
Officiis quidem iusto illo nihil ullam quia at necessitatibus.
Voluptas reprehenderit et quaerat sequi ratione ut.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "431d4776-8651-40c4-8301-a5c533da62f5")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss13()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("Ncvs4VW2jB");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("vel");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Spencer - Fadel");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Equipment expensed");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Suscipit eos sed suscipit et sunt.
Molestiae beatae fugiat vero ex molestiae voluptas accusantium.
Officiis voluptates ut sed non aliquam.
Eum aut cum assumenda nobis.
Non est eos quis mollitia officiis ut minus.
Aperiam ab fuga fuga illo quas sit asperiores eaque non.
Quos sit ad laborum impedit velit.
Pariatur id non.
Aut voluptatem numquam accusamus.
Quisquam voluptatibus fugiat.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "244e1668-3adf-457b-be32-6abda6712876")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss14()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("HrcvTUXLk9");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ipsum");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Rogahn Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Insurance");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Consectetur dolores cupiditate nam.
Autem est repellat iusto aut dolore.
Voluptate amet odio exercitationem aut quia sapiente.
Dolor aut in qui dolores laborum aut veritatis quis quo.
Sapiente quibusdam repellat cum error adipisci voluptatem.
Quia quibusdam quo rem quasi ut.
Sit perferendis ut quasi aut et aut dolore odio vitae.
Magni provident repellendus.
Et fuga est numquam veniam consequatur voluptate molestias debitis aut.
Assumenda repellendus dolor quasi quidem sit molestiae neque.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "09761280-dc99-4b27-ae07-5db6fb874090")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss15()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("b_U4ihc_Mm");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Erdman, Wilkinson and Parker");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Membership and subscriptions");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Neque est quas rem delectus fugit nam explicabo.
Quis ducimus voluptas.
Consequatur ex ipsa repudiandae quia illum inventore velit.
Pariatur voluptates voluptate aperiam eveniet.
Occaecati aut voluptatibus.
Voluptatum quod repellat expedita commodi et suscipit autem dolores maiores.
Consectetur voluptatem cumque commodi quam ullam.
Aliquam voluptas recusandae quibusdam.
Et et deserunt veritatis recusandae eius.
In illo iure natus quis a consequatur.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "c61d1d18-688b-4bf8-8cbb-cfa721287a7c")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss16()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("TcNJZF451N");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("error");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Marquardt - Collier");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Postage, stationery, office supplies");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Explicabo minus assumenda sit ea.
Rerum velit molestiae et deserunt velit ea.
Id ut qui.
Et ut enim magni voluptatem fugiat ex voluptatem quod.
Ad ullam ipsum id est cumque enim sapiente.
Corrupti qui qui et et ut vero ipsum exercitationem ut.
Non omnis quia odio ab ducimus.
Delectus rem itaque eum eos fugiat numquam eos magni harum.
Aut nihil dolor rerum et explicabo consectetur blanditiis dolorum rem.
Ea distinctio inventore repellat ipsam occaecati excepturi consequuntur qui.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "6e410847-9e1f-4d4f-abbd-bc81ee2a3040")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss17()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("PiAqedqOQt");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ea");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Effertz, Reinger and Kunze");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Professional, consultancy and legal fees");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Dolore deserunt dolorem.
Sit quasi ad assumenda qui occaecati eligendi.
Consequatur et et facilis doloribus voluptatum ratione et.
Placeat voluptas eius consequatur error dolor.
Similique et tempore hic autem quae.
Sapiente suscipit velit quia quam cumque.
Ullam explicabo impedit aperiam non voluptatem facere nulla in ipsum.
Atque rerum et facere est nihil.
Saepe quibusdam velit impedit pariatur maxime magnam.
Molestiae totam enim temporibus aliquid qui tenetur perspiciatis ducimus maxime.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "a8ed5c7b-12f6-41ce-ae1a-edac3f6ed0f7")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss18()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("2PTxjE7Qze");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("id");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Fadel, Nitzsche and Carroll");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Staff welfare");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Non ut est deserunt dolore delectus dolor.
Saepe veniam sed repellendus illum.
Non aspernatur illo consequatur aspernatur non voluptatem aperiam.
Voluptatum at ut.
Ea omnis qui quaerat.
Exercitationem nulla velit illo vero vero dolores.
Asperiores aspernatur delectus dignissimos amet quasi nobis.
Commodi nemo molestiae quia et similique et dolores eum.
Id ut maxime nihil.
Odio voluptatem tenetur quos ut et voluptatum labore.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "c628fc38-90ee-4c55-a0f7-dd77053cfe7b")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss19()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("_oQ6swU5nx");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("facere");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Huels, Mertz and Lehner");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Sundry expenses");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Et similique qui cupiditate nihil ut in.
Voluptas necessitatibus et qui optio beatae harum beatae.
Sed molestiae a et aliquid et.
Sint ut repellat voluptas commodi quibusdam.
Animi beatae repudiandae placeat commodi.
Perspiciatis sed illo sed rerum veritatis odit dolor quibusdam.
Debitis explicabo non ad sit.
Neque aliquid ducimus eos earum est qui ut.
Aliquid provident harum totam est repellendus sit ut enim.
Alias accusamus facere exercitationem nostrum quia minima sed et quia.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "5ab882e7-febc-4cdf-8a7d-2f59738fefa6")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss20()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("5dtP6iJTbs");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("cumque");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Fay - Koch");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Telephone, internet and broadband");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Impedit voluptatem similique unde dolorem eius.
Sit pariatur voluptate inventore nesciunt vel.
Quos fugiat fugit eos sint aut qui officia.
Tempora doloremque ipsa atque tenetur dolore quae ea.
Omnis at sunt ut quae in nulla et.
Eius doloremque molestias quas.
Velit dolorem dignissimos et.
Aliquam beatae occaecati architecto sed quam nisi sint.
Id iusto assumenda et ab ex in sapiente sunt.
Repellendus sed nostrum eveniet officiis dolor iste.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "4e6cd7eb-f342-4a7e-831b-ec66bf7ced27")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss21()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("08mUgZTEeU");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("quaerat");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Marks Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Travel and overseas travelling");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Quod ducimus architecto et.
Ipsum delectus sit facilis.
Error adipisci dolorum et voluptatem esse molestiae dignissimos laudantium hic.
Neque amet rerum ut vitae deleniti tempora perferendis.
Qui voluptas voluptas sunt.
Amet et officia consectetur.
Dolores odio deserunt debitis.
Ex vitae et repudiandae laudantium omnis alias voluptas molestias quam.
Quaerat iusto hic illo eligendi id dolorem.
Dolorem ut molestiae quae voluptatum sapiente.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "4db76fad-8b48-4507-b92e-3bafc7a3c67d")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss22()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("TAKVYrA6EI");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("ex");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Harber - Buckridge");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles additions");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Rerum dolores voluptatum in ad quia impedit et molestiae.
Tenetur hic nostrum.
Placeat totam eligendi magni aut hic.
Suscipit inventore rerum nihil laborum quasi odio libero.
Saepe voluptates eaque consequatur.
Sed qui esse perferendis ducimus animi aspernatur est.
Explicabo commodi voluptatem a reiciendis explicabo error accusantium iste aut.
Corporis beatae fugiat.
Distinctio ab enim voluptatibus facere qui quae repudiandae molestiae maxime.
Est minima fugit error aliquid qui facilis explicabo.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "53791db1-dafd-4e5e-85de-840876e2bf1d")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss23()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("BslSojAv6g");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("velit");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Jones, Wisozk and Fahey");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles cost b/f");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Illum ab ducimus suscipit numquam ut ducimus veniam repudiandae doloribus.
Ut distinctio voluptatibus quis voluptates nemo itaque.
Voluptate ratione ad eligendi at nobis aliquid deserunt nam.
Possimus ipsum accusantium rem impedit minima dolores et perferendis.
Sed consequuntur voluptas a ea odio cumque minus inventore cumque.
Quae blanditiis occaecati nihil temporibus perspiciatis ex.
Et eos facere repellendus dignissimos sequi qui.
Et hic nihil temporibus exercitationem nostrum ipsa.
Veniam qui voluptatem suscipit esse voluptatibus dolorum sed.
Nemo impedit porro quas assumenda et minus qui voluptatem ea.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "e1aeb9a2-a958-4228-b063-1937826fcce1")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss24()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("lHzLRI741G");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("adipisci");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hessel Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles depreciation");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Dolor tempore et.
Qui eos dignissimos odit.
Ullam doloremque aut.
Ad non aut voluptas earum itaque sint autem.
Nisi voluptas amet illo architecto tenetur corporis.
Ut hic molestias sed voluptas est autem ratione.
Maxime ea iusto maxime suscipit facere vel.
A dolorem ea quas deleniti.
Impedit tempora id.
In aperiam voluptas veritatis corrupti.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "3f1bba63-19ff-47a0-a553-d9144a852c4b")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss25()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("eP7bA8E99a");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("saepe");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Veum - Hettinger");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles depreciation b/f");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Sunt aut autem.
Magni eveniet ipsum.
Sint quibusdam saepe ut ea reprehenderit fugit possimus soluta.
Harum quia eum tempore repudiandae minus cupiditate qui sit.
Veritatis fugiat omnis et est.
Enim tempora aut hic ea.
Aliquam sunt neque nam quidem velit aut eum et nam.
Quis qui molestias et quam necessitatibus inventore.
Unde quo nulla aut dicta dolore accusantium.
Eaque beatae necessitatibus dolor qui excepturi.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "f8ffc59a-5424-403e-aeeb-aef7eef79e2b")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss26()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("mM_gOt6NgB");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("maiores");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Stokes Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles depreciation disposals");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Consectetur voluptate quis beatae quam est id voluptas placeat.
Aut temporibus est alias.
Suscipit voluptates rerum sapiente quaerat nulla.
Qui voluptate assumenda reiciendis necessitatibus.
Ut amet omnis accusamus.
Cumque sed distinctio consequatur et.
Corrupti deserunt vero id vitae sint non quos dolores.
Ea maiores eligendi hic aut delectus eum qui debitis.
Odio quisquam ut dolores error.
Perferendis quam architecto laudantium omnis voluptas voluptatum.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "32a1e026-41a8-4d13-b133-72877c27b63e")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss27()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("pbFzvoKhnC");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("minima");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Welch - Torp");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles depreciation revaluation");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Id nihil quo consequuntur quia.
Assumenda illo ea ipsa praesentium quas.
Quam tempore illo.
Molestias aut voluptatum.
Aut beatae voluptatem maiores quasi tenetur.
Quia excepturi commodi voluptas explicabo sequi suscipit possimus itaque velit.
Nihil impedit laborum harum impedit.
Iure consequuntur et.
Enim tenetur eligendi.
Dignissimos eum omnis et sint eos ab iusto et debitis.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "8265f246-323a-4236-9319-d9f615918ca9")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss28()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("dNI4SMDPAa");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("inventore");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Waelchi, Stoltenberg and Walker");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles depreciation transfers");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Eos iste tempore repellendus est quia in magni quam inventore.
Doloribus et id dolor aperiam.
Reiciendis quia maiores ipsum velit.
Sed cupiditate cum.
Quam quaerat labore.
Aut omnis repudiandae perferendis exercitationem consequatur voluptates.
Et molestias dolor eligendi est at totam eos dicta.
Suscipit non et assumenda ut porro nam.
Dolores quaerat aut voluptatem sequi officiis.
Sint adipisci iusto doloribus.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "a835147c-85c1-45ac-9d4f-3af690ae2db3")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss29()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("v_l7IbpH04");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("voluptas");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Hartmann - Becker");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles disposals");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Molestiae laboriosam est velit aliquid.
Officiis est temporibus enim ex voluptates excepturi aliquam distinctio.
Accusamus commodi quasi.
Quos in tempora molestiae voluptas.
Vitae ducimus sed nesciunt.
Nostrum hic officiis deserunt at temporibus.
Quis et sequi temporibus et incidunt quia voluptatum asperiores.
Accusantium accusantium rerum.
Autem et illum cupiditate aut modi officiis.
Omnis nihil dignissimos et.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "c1461d80-66e6-4412-b081-24697ab650af")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss30()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("siobfhgEI_");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("soluta");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Feil Group");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("Commercial vehicles revaluation");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Maxime error sint.
Pariatur minus nisi aut.
Inventore excepturi ex et eius.
Et natus aliquid laudantium fugit natus fugit sint voluptatem.
Autem repellat ut.
Quasi natus et qui mollitia veritatis.
Nesciunt qui deserunt quam ea neque cum dolore.
Aut iste sed reprehenderit aliquid.
Voluptatem accusamus itaque molestias et.
Eveniet eos inventore minus architecto reprehenderit magnam dolores.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "72e3128d-5c3e-4b83-ad51-83f345963722")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss31()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("fJ_v43MLcN");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("dolor");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Zboncak LLC");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("2020-05-17 10:36:32");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Temporibus velit omnis.
Sunt et aperiam voluptatem soluta provident nobis veniam.
Molestiae facere blanditiis aperiam est ipsa quis facilis ut.
Dolorem sit fugit consectetur aut eius.
Qui earum velit voluptas laudantium vitae quia quia quod qui.
Dignissimos inventore tempora.
Rem dolorum aut et tempora.
Excepturi placeat deserunt esse.
Voluptatem itaque totam reiciendis.
Inventore quae omnis quo.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "92ea25db-8e4a-4a2f-ac52-690066391ca3")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss32()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("uH4ufY1GV4");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("dolorum");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Cummings - Ward");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("Default Supplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("2021-07-24 10:55:55");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Id voluptates numquam veritatis.
Et voluptas corrupti sit.
Veniam sint et eum quia quae.
Saepe quis provident iusto vel.
Assumenda eos rem possimus.
Veritatis alias illo et ea iste.
Sed facere id voluptatem quaerat eius.
Adipisci aut adipisci est pariatur voluptas voluptatem magni et.
Quam omnis facere.
Optio dignissimos sed quo.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

    @Test  (groups= {"Suplierbil","Suplierbil - suplierbill_script"})
    @TestModellerPath(guid = "62c5e93c-b290-4d5b-bb89-9182ab8fc99f")
    public void suplierbillscriptGoToUrlAssertUrlPositiveEnternLOGINPositiveEnternPASSClickLoginGoToUrlAss33()
    {
        
        pages.nlogin _nlogin = new pages.nlogin(driver);
    TestModellerLogger.SetLastNodeGuid("566fb1ff-88ab-4390-9620-fa0a45cdcec0");
    _nlogin.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("923a48dc-6a4a-4554-8ac9-4813b087991c");
    _nlogin.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c656385-577e-4d5d-be0c-75bf35f65762");
    _nlogin.Enter_nLOGIN("");
    

    TestModellerLogger.SetLastNodeGuid("9170c0b0-0503-417f-ae13-4feebc414771");
    _nlogin.Enter_nPASS("vdx8KFhjXI");
    

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
    _AgentSearch.Enter_ctl00cPHFiltertxtAgentName("et");
    

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
    _Searchclient.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Shields - Wintheiser");
    

    TestModellerLogger.SetLastNodeGuid("0bc6f8c0-4fab-4c48-8dae-0d9405954fc9");
    _Searchclient.Click_Searchbtn();
    

    TestModellerLogger.SetLastNodeGuid("f1e00766-382f-4b93-9262-8ebbf4c5872c");
    _Searchclient.Click__NidhiEnt();
    

pages.Expenditure _Expenditure = new pages.Expenditure(driver);
    TestModellerLogger.SetLastNodeGuid("e4bc9d51-a165-41f7-b18b-377c198a7c15");
    _Expenditure.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f1efbaf4-eb30-4078-bb78-a50a74c5201d");
    _Expenditure.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5ab4d8e-5ca6-477a-b726-bf2bd7aec3c6");
    _Expenditure.Click_ExpendLeftMenu();
    

    TestModellerLogger.SetLastNodeGuid("9922eb53-edcd-4b96-b654-efd7c0afd6a2");
    _Expenditure.Click_New_plus();
    

    TestModellerLogger.SetLastNodeGuid("8a75a480-52db-4a9d-bf05-0dab0ed91bb0");
    _Expenditure.Click__New_Supplier_Bill_();
    

    TestModellerLogger.SetLastNodeGuid("1a00be69-a8a7-4fa2-83bd-08ea4c0e9127");
    _Expenditure.Select_DropdownlSupplier("NidhiSupplier");
    

    TestModellerLogger.SetLastNodeGuid("072ac800-2b0e-4ee3-b715-44745190b46f");
    _Expenditure.Enter_DefaultCurrency("");
    

    TestModellerLogger.SetLastNodeGuid("8b7c0f5e-b21d-4ae7-96d7-f479a1c89522");
    _Expenditure.Enter_Enter_BillNo("");
    

    TestModellerLogger.SetLastNodeGuid("d35b0152-f72a-4ff2-9a21-9cf94403702b");
    _Expenditure.Enter_Enter_Date("44288");
    

    TestModellerLogger.SetLastNodeGuid("1c183953-3ba6-4750-88fb-91081cc34a87");
    _Expenditure.Select_ddExpenseHead("");
    

    TestModellerLogger.SetLastNodeGuid("3e98f99f-ec0a-4e8a-860e-8d47b7c5b42c");
    _Expenditure.Enter_Enter_tDescription("Tenetur est fuga et.
Voluptas nemo ea iusto commodi.
In sit praesentium reiciendis provident autem nihil cum quo sequi.
Reprehenderit laudantium qui ipsa veniam.
Doloribus explicabo laudantium aut et vel iure similique quos.
Est quibusdam doloribus et nemo.
Autem non alias tenetur mollitia soluta eum consequatur.
Sunt quae animi aliquam nesciunt distinctio.
Iste iusto esse nisi.
Dolorem eveniet consequatur quasi voluptate ipsa sed omnis aut pariatur.");
    

    TestModellerLogger.SetLastNodeGuid("ffba0a0f-dfef-4d8b-abc6-58716821f6b7");
    _Expenditure.Enter_Enter_UnitPrice("unit");
    

pages.expenditurebill _expenditurebill = new pages.expenditurebill(driver);
    TestModellerLogger.SetLastNodeGuid("7d0e2198-1e67-4e24-89ba-7cbdc6423c4a");
    _expenditurebill.Select_Vattyperate("Standard Rate");
    

    TestModellerLogger.SetLastNodeGuid("c6400306-49d9-45af-ac82-74f5711ca556");
    _Expenditure.Click__Save_();
    

    }

}