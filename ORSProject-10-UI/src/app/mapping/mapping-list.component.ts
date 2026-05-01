import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-mapping-list',
  templateUrl: './mapping-list.component.html'
})
export class MappingListComponent extends BaseListCtl{
constructor(public loader: ServiceLocatorService,route: ActivatedRoute) {
    super(loader.endpoints.MAPPING,loader,route);
  }
}
