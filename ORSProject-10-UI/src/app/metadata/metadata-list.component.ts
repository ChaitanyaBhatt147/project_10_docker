import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-metadata-list',
  templateUrl: './metadata-list.component.html'
})
export class MetadataListComponent extends BaseListCtl{
  constructor(loader:ServiceLocatorService, route: ActivatedRoute) {
    super(loader.endpoints.METADATA, loader, route);
  }
}
