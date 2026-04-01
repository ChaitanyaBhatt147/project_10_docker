import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html'
})
export class CourseComponent extends BaseCtl {
  constructor(public locater: ServiceLocatorService, route: ActivatedRoute) {
    super(locater.endpoints.COURSE, locater, route);
  }
}
