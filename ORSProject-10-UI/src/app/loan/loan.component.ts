import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-loan',
  templateUrl: './loan.component.html'
})
export class LoanComponent extends BaseCtl {
  constructor(public locater: ServiceLocatorService, route: ActivatedRoute) {
      super(locater.endpoints.COURSE, locater, route);
    }
}
