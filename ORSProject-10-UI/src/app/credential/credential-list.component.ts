import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-credential-list',
  templateUrl: './credential-list.component.html'
})
export class CredentialListComponent extends BaseListCtl {
  constructor(public loader: ServiceLocatorService, route: ActivatedRoute) {
    super(loader.endpoints.CREDENTIAL, loader, route);
  }
}
