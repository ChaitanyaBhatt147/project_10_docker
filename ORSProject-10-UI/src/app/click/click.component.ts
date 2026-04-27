import { Component } from "@angular/core";
import { ServiceLocatorService } from "../service-locator.service";
import { ActivatedRoute } from "@angular/router";
import { BaseCtl } from "../base.component";

@Component({
    selector: "app-click",
    templateUrl: "./click.component.html"
})
export class ClickComponent extends BaseCtl {
    constructor(public locater: ServiceLocatorService, route: ActivatedRoute) {
        super(locater.endpoints.CLICK, locater, route);
    }
}
