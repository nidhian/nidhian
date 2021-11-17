package tests.TicketId3821;

import reports.TestNGListener;
import tests.TestBase;
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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b2be98ef-27a4-4dc7-8ef3-954c09b61151
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1526, profileId = 101514)
public class SA_SAClient extends TestBase
{
    

    
    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "945cd79a-a9d7-43f1-b3b2-694057cdcf02")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel()
    {
        
        pages.FIN3821.SA _SA = new pages.FIN3821.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.FIN3821.SA2 _SA2 = new pages.FIN3821.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("eos");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Show All");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }
    /*

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "238b53b4-9779-45c7-8e7e-8f8776f5b448")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel1()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("repellat");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Show All");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Hide Zeros");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "543e8870-21e6-45c9-b471-d15e7b63c86c")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel2()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("impedit");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Show All");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Hide Zeros");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "287dcc2d-d06e-4b84-b7ee-ee50e9d9b575")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel3()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("voluptas");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Individual");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "fcc74759-b109-4814-a8d9-6b9c07744d46")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel4()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("incidunt");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("LimitedCompany");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "75036a8d-5ab6-4deb-ab46-24b3173d8d7a")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel5()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("molestiae");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("LLP");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "d54dae82-fa80-418f-80de-d7bab9a619b4")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel6()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("quisquam");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("Partnership");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "55ab7dc6-e6f4-465a-a472-15f4b5132e66")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel7()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("accusamus");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("PLC");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }

    @Test  (groups= {"SA","SA - SA_Client"})
    @TestModellerPath(guid = "9f4cc736-f717-46cc-b6bf-f517581b4020")
    public void GoToUrlClickSAClickClientsLeftmenuPositiveEnterClientname2PositiveSelectClienttype2PositiveSel8()
    {
        
        pages.SA _SA = new pages.SA(driver);
    TestModellerLogger.SetLastNodeGuid("a403c84f-d2ef-43c1-8022-6f78ff5ece6a");
    _SA.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7b17b90d-7962-4291-9cb3-987aeb0b026f");
    _SA.Click_SA();
    

pages.SA2 _SA2 = new pages.SA2(driver);
    TestModellerLogger.SetLastNodeGuid("0ea06826-83f1-49ba-a1e5-5ce3fcc334da");
    _SA2.Click_Clients_Left_menu();
    

    TestModellerLogger.SetLastNodeGuid("aa157796-90c9-4ead-b4bb-1574ac7c1451");
    _SA2.Enter_Client_name2("est");
    

    TestModellerLogger.SetLastNodeGuid("9b485540-7edb-481a-a57b-f94a3af49f0c");
    _SA2.Select_Client_type2("SoleTrader");
    

    TestModellerLogger.SetLastNodeGuid("fb1e7e59-d051-4a2f-9589-e5e41ed09f4f");
    _SA2.Select_Without_Feeds3("Show All");
    

    TestModellerLogger.SetLastNodeGuid("72b33dff-e56a-4751-8425-9f77cdaa6a12");
    _SA2.Select_Unreco_Trans4("Show All");
    

    TestModellerLogger.SetLastNodeGuid("04e41f05-a634-4b5d-8c0b-1a24837183bf");
    _SA2.Click_Update_btt5();
    

    }*/

}