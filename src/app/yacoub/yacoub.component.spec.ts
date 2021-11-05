import { ComponentFixture, TestBed } from '@angular/core/testing';

import { YacoubComponent } from './yacoub.component';

describe('YacoubComponent', () => {
  let component: YacoubComponent;
  let fixture: ComponentFixture<YacoubComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ YacoubComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(YacoubComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
