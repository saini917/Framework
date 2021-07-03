Feature: Search and validate service name


Background: User is Logged In
 Given User is on List of service landing page
 When User searched for "Application for subsidy under Anti Hale net Scheme" service
 
 

#@SeleniumTest
Scenario: Search for service name and validate result
Then "Application for subsidy under Anti Hale net Scheme" result is displayed


#@SeleniumTest
Scenario: Search for service name and click on search service name
Then click on service "Application for subsidy under Anti Hale net Scheme" name
And User is on "Application for subsidy under Anti Hale net Scheme" entry page

#@PersonalDetailPageTest
Scenario Outline: User is already sign up and verify the Personal detail tab
Then click on service "Application for subsidy under Anti Hale net Scheme" name
Then User is Landing on Personal detail tab
Then User enter with aadhar number <Aadhaar number> 
And User enter with emailid <Email Id> 
And User enter with udyan number <Udyan number>
Then click on Next button
Then User move to the Applicant Address tab

Examples:
|Aadhaar number |Email Id                  |Udyan number|
|574517527338   |saini1987deepak@gmail.com |868876555   |


#@ApplicantAddress
Scenario Outline: Verify the Applicant Address page
Then click on service "Application for subsidy under Anti Hale net Scheme" name
Then User enter with aadhar number <Aadhaar number> 
And User enter with emailid <Email Id> 
And User enter with udyan number <Udyan number>
Then click on Next button
Then User verify the Correspondence address on the Applicant Address page
Then User verify the state with "HIMACHAL PRADESH | हिमाचल प्रदेश"
Then User verify the district with "HAMIRPUR | हमीरपुर"
Then User verify the tehsil with "Nadaun  |  ऩादौन "
Then User verify the village with "Nadaun  |  नादौन"
Then User verify the block with "Nagar Panchayat Nadaun / नगर पंचायत नादौन" 
Then User verify the panchayat with "Ward No. 1 - Hospital Ward / वार्ड नंबर 1 - अस्पताल वार्ड"
Then user verify the address with "Abc"
Then User verift the pincode with "174405"

Examples:
|Aadhaar number |Email Id            |Udyan number |
|574517527338   |reema1994@gmail.com |775774577    |

@ApplicantAddress
Scenario Outline: Verify the Applicant Address page
Then click on service "Application for subsidy under Anti Hale net Scheme" name
Then User enter with aadhar number <Aadhaar number> 
And User enter with emailid <Email Id> 
And User enter with udyan number <Udyan number>
Then click on Next button
Then User verify the Correspondence address on the Applicant Address page
Then User verify the state with <state>
Then User verify the district with <district>
Then User verify the tehsil with <tehsil>
Then User verify the village with <village>
Then User verify the block with <block> 
Then User verify the panchayat with <panchayat>
Then user verify the address with <address>
Then User verift the pincode with <pincode>


Examples:
|Aadhaar number |Email Id            |Udyan number | state            | district  | tehsil   |village |block                  |panchayat                  |address|pincode|
|574517527338   |reema1994@gmail.com |775774577    | HIMACHAL PRADESH | HAMIRPUR  | Nadaun   |Nadaun  |Nagar Panchayat Nadaun |Ward No. 1 - Hospital Ward |Abc    |174405 |

 