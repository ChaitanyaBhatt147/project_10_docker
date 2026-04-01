import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-marksheet',
  templateUrl: './marksheet.component.html'
})
export class MarksheetComponent extends BaseCtl{
  constructor(public locater: ServiceLocatorService, route: ActivatedRoute){
    super(locater.endpoints.MARKSHEET, locater, route);
  }
}
