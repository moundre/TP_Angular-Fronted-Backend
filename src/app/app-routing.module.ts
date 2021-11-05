import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './pages/accueil/accueil.component';
import { DetailsapprenantComponent } from './pages/detailsapprenant/detailsapprenant.component';
import { ListeapprenantsComponent } from './pages/listeapprenants/listeapprenants.component';
import { ListepresenceapprenantComponent } from './pages/listepresenceapprenant/listepresenceapprenant.component';
import { LoginComponent } from './pages/login/login.component';

const routes: Routes = [
  {path: '', component : LoginComponent},
  {path: 'accueil', component : AccueilComponent},
  {path: 'liste', component : ListeapprenantsComponent},
  {path: 'listepresence', component : ListepresenceapprenantComponent},
  {path: 'detailsapprenant', component : DetailsapprenantComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
