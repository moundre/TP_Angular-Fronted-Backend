import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeapprenantsComponent } from './listeapprenants.component';

describe('ListeapprenantsComponent', () => {
  let component: ListeapprenantsComponent;
  let fixture: ComponentFixture<ListeapprenantsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeapprenantsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeapprenantsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
