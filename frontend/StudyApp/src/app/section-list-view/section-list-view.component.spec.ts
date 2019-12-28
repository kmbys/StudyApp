import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SectionListViewComponent } from './section-list-view.component';

describe('SectionListViewComponent', () => {
  let component: SectionListViewComponent;
  let fixture: ComponentFixture<SectionListViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SectionListViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SectionListViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
