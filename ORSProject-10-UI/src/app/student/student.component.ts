import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html'
})
export class StudentComponent extends BaseCtl {
constructor(public locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.STUDENT, locator, route);
  }
}
