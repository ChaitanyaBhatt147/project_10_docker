import { Component } from "@angular/core";
import { BaseListCtl } from "../base-list.component";
import { ServiceLocatorService } from "../service-locator.service";
import { ActivatedRoute } from "@angular/router";

@Component({
    selector: "app-click-list",
    templateUrl: "./click-list.component.html",
})
export class ClickListComponent extends BaseListCtl { 
    constructor(private locater: ServiceLocatorService, route: ActivatedRoute) {
        super(locater.endpoints.CLICK, locater, route);
    }
}