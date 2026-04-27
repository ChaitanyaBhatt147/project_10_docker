import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-subscription-plan',
  templateUrl: './subscription-plan.component.html'
})
export class SubscriptionPlanComponent extends BaseCtl {
  constructor(loader: ServiceLocatorService, route: ActivatedRoute) {
    super(loader.endpoints.SUBSCRIPTIONPLAN, loader, route);
  }
}
