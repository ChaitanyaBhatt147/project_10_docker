import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-credential',
  templateUrl: './credential.component.html'
})
export class CredentialComponent extends BaseCtl{
  constructor( public loader: ServiceLocatorService,  route: ActivatedRoute) {
    super(loader.endpoints.CREDENTIAL, loader, route);
}
}
