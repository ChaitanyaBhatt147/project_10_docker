import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-criptocurrency',
  templateUrl: './criptocurrency.component.html'
})
export class CriptocurrencyComponent extends BaseCtl {
  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.CRYPTOCURRENCY, locator, route);
  }
}
