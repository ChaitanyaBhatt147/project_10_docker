import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-criptocurrencylist',
  templateUrl: './criptocurrencylist.component.html'
})
export class CriptocurrencylistComponent extends BaseListCtl{
  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
      super(locator.endpoints.CRYPTOCURRENCY, locator, route);
    }
}
