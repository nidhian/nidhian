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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ad894700-bed3-46e8-ae59-59d690055ee9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1317, profileId = 101088)
public class ungroupreconcile_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"ungroupreconcile","ungroupreconcile - Default Profile"})
    @TestModellerPath(guid = "7106cfbf-19ff-4bcc-9cbe-b8fcb8b7369c")
    public void GoToUrlAssertUrlClickselectallcheckbboxClickUngrouplinkselected()
    {
        
        pages.ungroup _ungroup = new pages.ungroup(driver);
    TestModellerLogger.SetLastNodeGuid("e495b171-a0bb-4515-b26d-17ac8ecd09fd");
    _ungroup.GoToUrl();
    

   // TestModellerLogger.SetLastNodeGuid("faafd899-e511-4133-8cc9-393b5077d464");
   // _ungroup.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8579422c-5a13-4d28-bcdb-80684455e0ac");
    _ungroup.Click_selectallcheckbbox();
    

    TestModellerLogger.SetLastNodeGuid("e8d9d338-eb30-4309-96e4-dc0de1ba572c");
    _ungroup.Click_Ungroup_linkselected();
    

    }

}