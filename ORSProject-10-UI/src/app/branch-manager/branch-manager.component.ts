import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-branch-manager',
  templateUrl: './branch-manager.component.html'
})
export class BranchManagerComponent extends BaseCtl {
  constructor(public locater: ServiceLocatorService, route: ActivatedRoute) {
    super(locater.endpoints.BRANCHMANAGER, locater, route);
  }
}
