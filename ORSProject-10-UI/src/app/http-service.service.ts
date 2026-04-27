import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class HttpServiceService {

  constructor(private httpClient: HttpClient, private router: Router) { }

  post(endpoint: any, bean: any, callback: any) {
    return this.httpClient.post(endpoint, bean).subscribe(
      (data) => {
        callback(data);
      }
    );
  }

  get(endpoint: any, callback: any) {
    return this.httpClient.get(endpoint).subscribe(
      (data) => {
        callback(data);
      },
      (error) => {
        this.handleError(error);
      }
    );
  }

  getReport(url: string, token: string) {
    this.httpClient.get(url, {
      headers: {
        Authorization: 'Bearer ' + token
      },
      responseType: 'blob'
    }).subscribe(
      (res: any) => {
        const file = new Blob([res], { type: 'application/pdf' });
        const fileURL = URL.createObjectURL(file);
        window.open(fileURL);
      },
      (error) => {
        this.handleError(error);
      }
    );
  }

  // Moved exception handling logic here
  private handleError(error: HttpErrorResponse) {
    const currentUrl = this.router.url.split('?')[0];

    if (error.status === 503) {
      this.router.navigate([currentUrl], {
        queryParams: {
          message: error.error,
          error: true
        }
      });
    }

    if (error.status === 403) {
      localStorage.clear();
      this.router.navigate(['/login'], {
        queryParams: { message: 'Token is expired... plz login again..!!', error: true },
      });
    }
  }
}