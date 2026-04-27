import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EndpointServiceService {

  constructor() {
    console.log('in EndpointServiceService ts')
  }

  public SERVER_URL = "http://localhost:8080";
  public MESSAGE = this.SERVER_URL + "/Message";
  public USER = this.SERVER_URL + "/User";
  public ROLE = this.SERVER_URL + "/Role";
  public COLLEGE = this.SERVER_URL + "/College";
  public MARKSHEET = this.SERVER_URL + "/Marksheet";
  public STUDENT = this.SERVER_URL + "/Student";
  public SUBJECT = this.SERVER_URL + "/Subject";
  public FACULTY = this.SERVER_URL + "/Faculty";
  public COURSE = this.SERVER_URL + "/Course";
  public TIMETABLE = this.SERVER_URL + "/TimeTable";
  public JASPERREPORT = this.SERVER_URL + "/Jasper";
  public BRANCHMANAGER = this.SERVER_URL + "/BranchManager";
  public CRYPTOCURRENCY = this.SERVER_URL + "/Criptocurrency";
  public CLICK = this.SERVER_URL + "/Click";
  public LOAN = this.SERVER_URL + "/Loan";
  public LIMIT = this.SERVER_URL + "/Limit";
  public CREDENTIAL = this.SERVER_URL + "/Credential";
  public RATE_LIMIT = this.SERVER_URL + "/RateLimit";
  public METADATA = this.SERVER_URL + "/Metadata";
  public SUBSCRIPTIONPLAN = this.SERVER_URL + "/SubscriptionPlan";
  public SLA = this.SERVER_URL + "/SLA";
  public DONATIONCAMP = this.SERVER_URL + "/DonationCamp";
}
