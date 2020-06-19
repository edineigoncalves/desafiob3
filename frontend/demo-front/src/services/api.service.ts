import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';
import {throwError} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs/internal/Observable';

@Injectable()
export class ApiService {



    constructor(public dados: HttpClient) {
    }

    patch(url: string, conteudo: any) {
      return this.dados.patch(url, conteudo);
    }

    // tslint:disable-next-line:comment-format
    //AssociarContato
    associar(url: string) {
      return this.dados.post<any>(url , null);
    }


    // POST
    post(url: string, conteudo: any): Observable<any> {
        return this.dados.post<any>(url, conteudo);
    }

    // PUT
    put(url: string, conteudo: any): Observable<any> {
        return this.dados.put<any>(url, conteudo);
    }

    // GET
    get(url: string, cabecalhos: HttpHeaders = new HttpHeaders()): Observable<any> {
        return this.dados.get<any>(url, {headers: cabecalhos});
    }

    // DELETE
    remover(url: string, conteudo: any): Observable<any> {

        return this.dados.delete<any>(url + '/' + conteudo);
    }




}