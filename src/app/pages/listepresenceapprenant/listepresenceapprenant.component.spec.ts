import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListepresenceapprenantComponent } from './listepresenceapprenant.component';

describe('ListepresenceapprenantComponent', () => {
  let component: ListepresenceapprenantComponent;
  let fixture: ComponentFixture<ListepresenceapprenantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListepresenceapprenantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListepresenceapprenantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
