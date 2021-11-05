import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(
    private route:Router) { }

  ngOnInit(): void {
  }
  click(){
    this.route.navigate(['accueil']);
  }
}
