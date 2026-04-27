import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-donation-camp-list',
  templateUrl: './donation-camp-list.component.html'
})
export class DonationCampListComponent extends BaseListCtl{
  constructor(public loader: ServiceLocatorService, route: ActivatedRoute) {
    super(loader.endpoints.DONATIONCAMP, loader, route);
  }
}
