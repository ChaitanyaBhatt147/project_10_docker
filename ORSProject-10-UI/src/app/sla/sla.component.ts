import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-sla',
  templateUrl: './sla.component.html'
})
export class SLAComponent extends BaseCtl{
  constructor(locator:ServiceLocatorService, router: ActivatedRoute){
    super(locator.endpoints.SLA, locator, router);
  }
}
