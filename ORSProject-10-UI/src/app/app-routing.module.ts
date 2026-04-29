import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { RoleComponent } from './role/role.component';
import { UserComponent } from './user/user.component';
import { CollegeComponent } from './college/college.component';
import { StudentComponent } from './student/student.component';
import { MarksheetComponent } from './marksheet/marksheet.component';
import { CourseComponent } from './course/course.component';
import { SubjectComponent } from './subject/subject.component';
import { UserListComponent } from './user/user-list.component';
import { RoleListComponent } from './role/role-list.component';
import { CollegeListComponent } from './college/college-list.component';
import { StudentListComponent } from './student/student-list.component';
import { MarksheetListComponent } from './marksheet/marksheet-list.component';
import { CourseListComponent } from './course/course-list.component';
import { SubjectListComponent } from './subject/subject-list.component';
import { TimetableComponent } from './timetable/timetable.component';
import { TimetableListComponent } from './timetable/timetable-list.component';
import { FacultyComponent } from './faculty/faculty.component';
import { FacultyListComponent } from './faculty/faculty-list.component';
import { ForgotpasswordComponent } from './login/forgotpassword.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './login/signup.component';
import { ChangepasswordComponent } from './user/changepassword.component';
import { MyprofileComponent } from './user/myprofile.component';
import { GetmarksheetComponent } from './marksheet/getmarksheet.component';
import { MarksheetmeritlistComponent } from './marksheet/marksheetmerit-list.component';
import { BranchManagerComponent } from './branch-manager/branch-manager.component';
import { BranchManagerListComponent } from './branch-manager/branch-manager-list.component';
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

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'dashboard'
  },
  {
    path: 'dashboard',
    component: DashboardComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'signup',
    component: SignupComponent
  },
  {
    path: 'user',
    component: UserComponent
  },
  {
    path: 'user/:id',
    component: UserComponent
  },
  {
    path: 'userlist',
    component: UserListComponent
  },
  {
    path: 'role',
    component: RoleComponent
  },
  {
    path: 'role/:id',
    component: RoleComponent
  },
  {
    path: 'rolelist',
    component: RoleListComponent
  },
  {
    path: 'college',
    component: CollegeComponent
  },
  {
    path: 'college/:id',
    component: CollegeComponent
  },
  {
    path: 'collegelist',
    component: CollegeListComponent
  },
  {
    path: 'student',
    component: StudentComponent
  },
  {
    path: 'student/:id',
    component: StudentComponent
  },
  {
    path: 'studentlist',
    component: StudentListComponent
  },
  {
    path: 'marksheet',
    component: MarksheetComponent
  },
  {
    path: 'marksheet/:id',
    component: MarksheetComponent
  },
  {
    path: 'marksheetlist',
    component: MarksheetListComponent
  },
  {
    path: 'course',
    component: CourseComponent
  },
  {
    path: 'course/:id',
    component: CourseComponent
  },
  {
    path: 'courselist',
    component: CourseListComponent
  },
  {
    path: 'subject',
    component: SubjectComponent
  },
  {
    path: 'subject/:id',
    component: SubjectComponent
  },
  {
    path: 'subjectlist',
    component: SubjectListComponent
  },
  {
    path: 'timetable',
    component: TimetableComponent
  },
  {
    path: 'timetable/:id',
    component: TimetableComponent
  },
  {
    path: 'timetablelist',
    component: TimetableListComponent
  },
  {
    path: 'faculty',
    component: FacultyComponent
  },
  {
    path: 'faculty/:id',
    component: FacultyComponent
  },
  {
    path: 'facultylist',
    component: FacultyListComponent
  },
  {
    path: 'forgotpassword',
    component: ForgotpasswordComponent
  },
  {
    path: 'changepassword',
    component: ChangepasswordComponent
  },
  {
    path: 'myprofile/:id',
    component: MyprofileComponent
  },
  {
    path: 'marksheetmeritlist',
    component: MarksheetmeritlistComponent
  },
  {
    path: "getmarksheet",
    component: GetmarksheetComponent
  },
  {
    path: "getmarksheet/:id",
    component: GetmarksheetComponent
  },
  {
    path: 'branchmanager',
    component: BranchManagerComponent
  },
  {
    path: 'branchmanager/:id',
    component: BranchManagerComponent
  },
  {
    path: 'branchmanagerlist',
    component: BranchManagerListComponent
  },
  {
    path: 'cryptocurrency',
    component: CriptocurrencyComponent
  },
  {
    path: 'cryptocurrency/:id',
    component: CriptocurrencyComponent
  },
  {
    path: 'cryptocurrencylist',
    component: CriptocurrencylistComponent
  },
  {
    path: 'click',
    component: ClickComponent
  },
  {
    path: 'click/:id',
    component: ClickComponent
  },
  {
    path: 'clicklist',
    component: ClickListComponent
  },
  {
    path: 'loan',
    component: LoanComponent
  },
  {
    path: 'loan/:id',
    component: LoanComponent
  },
  {
    path: 'loanlist',
    component: LoanlistComponent
  },
  {
    path: 'limit',
    component: LimitComponent
  },
  {
    path: 'limit/:id',
    component: LimitComponent
  },
  {
    path: 'limitlist',
    component: LimitListComponent
  },
  {
    path: 'credential',
    component: CredentialComponent
  },
  {
    path: 'credential/:id',
    component: CredentialComponent
  },
  {
    path: 'credentiallist',
    component: CredentialListComponent
  },
  {
    path: 'ratelimit',
    component: RateLimitComponent
  },
  {
    path: 'ratelimit/:id',
    component: RateLimitComponent
  },
  {
    path: 'ratelimitlist',
    component: RateLimitListComponent
  },
  {
    path: 'metadata',
    component: MetadataComponent
  },
  {
    path: 'metadata/:id',
    component: MetadataComponent
  },
  {
    path: 'metadatalist',
    component: MetadataListComponent
  },
  {
    path: 'subscriptionplan',
    component: SubscriptionPlanComponent
  },
  {
    path: 'subscriptionplan/:id',
    component: SubscriptionPlanComponent
  }, {
    path: 'subscriptionplanlist',
    component: SubscriptionPlanListComponent
  },
  {
    path: 'sla',
    component: SLAComponent
  },
  {
    path: 'sla/:id',
    component: SLAComponent
  },
  {
    path: 'slalist',
    component: SLAListComponent
  },
  {
    path: 'donationcamp',
    component: DonationCampComponent
  },
  {
    path: 'donationcamp/:id',
    component: DonationCampComponent
  },
  {
    path: 'donationcamplist',
    component: DonationCampListComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
