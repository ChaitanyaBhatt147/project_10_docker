import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-subscription-plan-list',
  templateUrl: './subscription-plan-list.component.html'
})
export class SubscriptionPlanListComponent extends BaseListCtl{
constructor(loader: ServiceLocatorService, route: ActivatedRoute) {
    super(loader.endpoints.SUBSCRIPTIONPLAN, loader, route);
  }
}
