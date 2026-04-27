import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-metadata',
  templateUrl: './metadata.component.html'
})
export class MetadataComponent extends BaseCtl {
  constructor(locater: ServiceLocatorService, route: ActivatedRoute) {
    super(locater.endpoints.METADATA, locater, route);
  }
}
