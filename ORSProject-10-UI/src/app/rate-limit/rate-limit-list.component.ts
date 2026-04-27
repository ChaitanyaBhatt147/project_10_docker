import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-rate-limit-list',
  templateUrl: './rate-limit-list.component.html'
})
export class RateLimitListComponent extends BaseListCtl{
  constructor(public loader:ServiceLocatorService, route: ActivatedRoute) {
    super(loader.endpoints.RATE_LIMIT, loader, route)
}
}
