import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-donation-camp',
  templateUrl: './donation-camp.component.html'
})
export class DonationCampComponent extends BaseCtl{
  constructor(public loader: ServiceLocatorService, route: ActivatedRoute) {
    super(loader.endpoints.DONATIONCAMP, loader, route);
  }
}
