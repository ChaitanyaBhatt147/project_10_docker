import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-block-list',
  templateUrl: './block-list.component.html'
})
export class BlockListComponent extends BaseCtl{
  constructor(public loader:ServiceLocatorService, router:ActivatedRoute){
    super(loader.endpoints.BLOCKLIST, loader, router);
  }
}
