import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderViewComponent } from './header-view/header-view.component';
import { SlideViewComponent } from './slide-view/slide-view.component';
import { FooterViewComponent } from './footer-view/footer-view.component';
import { SectionListViewComponent } from './section-list-view/section-list-view.component';
import { NgxDocViewerModule } from 'ngx-doc-viewer';
import { FlexLayoutModule } from '@angular/flex-layout';
import { DetailsViewComponent } from './details-view/details-view.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatTabsModule } from '@angular/material/tabs';
import { MatGridListModule } from '@angular/material';

@NgModule({
  declarations: [
    AppComponent,
    HeaderViewComponent,
    SlideViewComponent,
    FooterViewComponent,
    SectionListViewComponent,
    DetailsViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgxDocViewerModule,
    FlexLayoutModule,
    BrowserAnimationsModule,
    MatTabsModule,
    MatGridListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
