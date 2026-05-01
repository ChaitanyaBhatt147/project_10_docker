import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-mapping',
  templateUrl: './mapping.component.html'
})
export class MappingComponent extends BaseCtl{
  constructor(public loader: ServiceLocatorService,route: ActivatedRoute) {
    super(loader.endpoints.MAPPING,loader,route);
  }
}
