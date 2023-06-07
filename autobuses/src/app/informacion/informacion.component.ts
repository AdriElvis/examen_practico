import { Component } from '@angular/core';
import { Autobus } from '../modelo/autobus';
import { ServicioService } from '../servicio.service';


@Component({
  selector: 'app-informacion',
  templateUrl: './informacion.component.html',
  styleUrls: ['./informacion.component.css']
})
export class InformacionComponent {
  lista:Autobus[]=[]

  constructor(private servicio:ServicioService){
    this.servicio.listar().subscribe(data => {this.lista = data; console.log(data)} )
    
  }
}
