import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-job-list',
  templateUrl: './job-list.component.html'
})
export class JobListComponent extends BaseListCtl{
constructor(public loader: ServiceLocatorService, route: ActivatedRoute) {
  super(loader.endpoints.JOB,loader, route);
}
}
