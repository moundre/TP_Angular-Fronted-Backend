import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsapprenantComponent } from './detailsapprenant.component';

describe('DetailsapprenantComponent', () => {
  let component: DetailsapprenantComponent;
  let fixture: ComponentFixture<DetailsapprenantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsapprenantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsapprenantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
