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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/528fe538-b7c1-4103-9839-6690ad4a4c35
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1524, profileId = 101508)
public class businesswithoutuser_busineswithoutuser extends TestBase
{
    

    
    @Test  (groups= {"business_without_user","business_without_user - busines_without_user"})
    @TestModellerPath(guid = "07a79700-10da-4224-835f-9940c249d9c2")
    public void GoToUrlClickWithoutBussinessusrClickAgentReportsClickBusinesseswithoutusersPositiveEnterClientN()
    {
        
        pages.FIN3821.BusinessUser _BusinessUser = new pages.FIN3821.BusinessUser(driver);
    TestModellerLogger.SetLastNodeGuid("30ac18a6-c18c-459a-a0a0-372def465f5c");
    _BusinessUser.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("591224e8-b755-41d9-bf71-863633c2b6dc");
    _BusinessUser.Click_Without_Bussiness_usr();
    

pages.FIN3821.withoutuser _withoutuser = new pages.FIN3821.withoutuser(driver);
    TestModellerLogger.SetLastNodeGuid("061c6937-e1cd-40b8-9bef-0f69ed97a9b3");
    _withoutuser.Click_Agent_Reports();
    

    TestModellerLogger.SetLastNodeGuid("8156580c-8974-4806-a569-15030e664a55");
    _withoutuser.Click_Businesses__without__users();
    

    TestModellerLogger.SetLastNodeGuid("dabdb721-dc93-4081-8c9e-a2b3444bfb7e");
    _withoutuser.Enter_Client_Name1("doloremque");
    

    TestModellerLogger.SetLastNodeGuid("ace96b4c-1879-4477-aca3-8ea53f7d87f7");
    _withoutuser.Enter_user_count("");
    

    TestModellerLogger.SetLastNodeGuid("d74692c6-6b1a-4e81-9793-7acf45de9a5d");
    _withoutuser.Click_Search__btnn();
    

    }

}