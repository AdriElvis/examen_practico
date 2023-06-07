import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable} from 'rxjs';
import { Autobus } from '../app/modelo/autobus';
@Injectable({
  providedIn: 'root'
})
export class ServicioService {

  private url:string = 'http://localhost:8080/autobuses'

  constructor(private http:HttpClient) {}

  listar():Observable<Autobus[]>{
    return this.http.get<Autobus[]>(this.url)
  }
}
