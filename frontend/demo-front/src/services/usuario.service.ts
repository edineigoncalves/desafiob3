import { ApiService } from './api.service';
import { IUser } from '../contracts/IUsers';
import { Observable } from 'rxjs';
import {environment} from '../environments/environment';
import { Injectable } from '@angular/core';


@Injectable()
export class UsersService {

    public url: string;

    constructor(public api: ApiService) {
        this.url = environment.apiEndpoint + '/user';
    }

    // Criar
    criar(user: IUser): Observable<IUser> {
        return this.api.post(this.url+'/save', user);
    }

    // Ver
    ver(id: number): Observable<IUser> {
        const url = this.url + '/all' + id;
        return this.api.get(url);
    }

    listar(): Observable<IUser[]> {
        return this.api.get(this.url+'/all');
    }

    // Deletar
    deletar(id: number): Observable<IUser> {
        return this.api.remover(this.url+'/delete/', id);
    }

    editar(id: number, user: IUser) {
        return this.api.put ( this.url + '/' + id, user );
    }
}