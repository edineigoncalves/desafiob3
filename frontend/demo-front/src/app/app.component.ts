import { Component } from '@angular/core';
import { IUser } from 'src/contracts/IUsers';
import { UsersService } from '../services/usuario.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  titulo = 'Cadastro de cliente';


	public  userId: number;
	public  companyId: number
	public email: string;
	public birthDate: string;
  public cliente: IUser;

  constructor(public service: UsersService){

  }

  salvar(value: IUser){
    console.log(JSON.stringify(value));
    this.service.criar(value)
    .subscribe( resp => console.log(resp) );
  }

}
