import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-slalist',
  templateUrl: './slalist.component.html'
})
export class SLAListComponent extends BaseListCtl {
  constructor(locator: ServiceLocatorService, router: ActivatedRoute) {
    super(locator.endpoints.SLA, locator, router);
  }
}
