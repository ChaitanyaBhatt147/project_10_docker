import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { HTTP_INTERCEPTORS, HttpClient, HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpServiceService } from './http-service.service';
import { AuthService} from './auth.service';
import { NavbarComponent } from './navbar/navbar.component';
import { RoleComponent } from './role/role.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { RouterModule } from '@angular/router';
import { EndpointServiceService } from './endpoint-service.service';
import { ServiceLocatorService } from './service-locator.service';
import { UserComponent } from './user/user.component';
import { CollegeComponent } from './college/college.component';
import { StudentComponent } from './student/student.component';
import { MarksheetComponent } from './marksheet/marksheet.component';
import { CourseComponent } from './course/course.component';
import { SubjectComponent } from './subject/subject.component';
import { TimetableComponent } from './timetable/timetable.component';
import { FacultyComponent } from './faculty/faculty.component';
import { CollegeListComponent } from './college/college-list.component';
import { CourseListComponent } from './course/course-list.component';
import { FacultyListComponent } from './faculty/faculty-list.component';
import { MarksheetListComponent } from './marksheet/marksheet-list.component';
import { RoleListComponent } from './role/role-list.component';
import { StudentListComponent } from './student/student-list.component';
import { SubjectListComponent } from './subject/subject-list.component';
import { UserListComponent } from './user/user-list.component';
import { TimetableListComponent } from './timetable/timetable-list.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './login/signup.component';
import { ForgotpasswordComponent } from './login/forgotpassword.component';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { ChangepasswordComponent } from './user/changepassword.component';
import { MyprofileComponent } from './user/myprofile.component';
import { GetmarksheetComponent } from './marksheet/getmarksheet.component';
import { MarksheetmeritlistComponent } from './marksheet/marksheetmerit-list.component';
import { CriptocurrencyComponent } from './criptocurrency/criptocurrency.component';
import { CriptocurrencylistComponent } from './criptocurrency/criptocurrencylist.component';
import { ClickComponent } from './click/click.component';
import { ClickListComponent } from './click/click-list.component';
import { LoanComponent } from './loan/loan.component';
import { LoanlistComponent } from './loan/loanlist.component';
import { LimitComponent } from './limit/limit.component';
import { LimitListComponent } from './limit/limit-list.component';
import { CredentialComponent } from './credential/credential.component';
import { CredentialListComponent } from './credential/credential-list.component';
import { RateLimitComponent } from './rate-limit/rate-limit.component';
import { RateLimitListComponent } from './rate-limit/rate-limit-list.component';
import { MetadataComponent } from './metadata/metadata.component';
import { MetadataListComponent } from './metadata/metadata-list.component';
import { SubscriptionPlanComponent } from './subscription-plan/subscription-plan.component';
import { SubscriptionPlanListComponent } from './subscription-plan/subscription-plan-list.component';
import { SLAComponent } from './sla/sla.component';
import { SLAListComponent } from './sla/slalist.component';
import { DonationCampComponent } from './donation-camp/donation-camp.component';
import { DonationCampListComponent } from './donation-camp/donation-camp-list.component';
import { BlockListComponent } from './block-list/block-list.component';
import { BlockListListComponent } from './block-list/block-list-list.component';
import { MappingComponent } from './mapping/mapping.component';
import { MappingListComponent } from './mapping/mapping-list.component';
import { JobComponent } from './job/job.component';
import { JobListComponent } from './job/job-list.component';

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json')};

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    RoleComponent,
    DashboardComponent,
    UserComponent,
    CollegeComponent,
    StudentComponent,
    MarksheetComponent,
    CourseComponent,
    SubjectComponent,
    TimetableComponent,
    FacultyComponent,
    CollegeListComponent,
    CourseListComponent,
    FacultyListComponent,
    MarksheetListComponent,
    RoleListComponent,
    StudentListComponent,
    SubjectListComponent,
    UserListComponent,
    TimetableListComponent,
    FooterComponent,
    LoginComponent,
    SignupComponent,
    ForgotpasswordComponent,
    ChangepasswordComponent,
    MyprofileComponent,
    GetmarksheetComponent,
    MarksheetmeritlistComponent,
    CriptocurrencyComponent,
    CriptocurrencylistComponent,
    ClickComponent,
    ClickListComponent,
    LoanComponent,
    LoanlistComponent,
    LimitComponent,
    LimitListComponent,
    CredentialComponent,
    CredentialListComponent,
    RateLimitComponent,
    RateLimitListComponent,
    MetadataComponent,
    MetadataListComponent,
    SubscriptionPlanComponent,
    SubscriptionPlanListComponent,
    SLAComponent,
    SLAListComponent,
    DonationCampComponent,
    DonationCampListComponent,
    BlockListComponent,
    BlockListListComponent,
    MappingComponent,
    MappingListComponent,
    JobComponent,
    JobListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule,
    FormsModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    })
  ],
  providers: [HttpServiceService,
    EndpointServiceService,
    ServiceLocatorService,
    { provide: HTTP_INTERCEPTORS, useClass: AuthService, multi: true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

