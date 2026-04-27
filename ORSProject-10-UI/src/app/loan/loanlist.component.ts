import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-loanlist',
  templateUrl: './loanlist.component.html'
})
export class LoanlistComponent extends BaseListCtl {
  constructor(public locater: ServiceLocatorService, route: ActivatedRoute) {
      super(locater.endpoints.LOAN, locater, route);
    }
}
