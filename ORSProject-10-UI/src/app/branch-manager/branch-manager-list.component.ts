import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-branch-manager-list',
  templateUrl: './branch-manager-list.component.html'
})
export class BranchManagerListComponent extends BaseListCtl {
  constructor(locater: ServiceLocatorService, route: ActivatedRoute) {
    super(locater.endpoints.BRANCHMANAGER, locater, route);
  }
}
