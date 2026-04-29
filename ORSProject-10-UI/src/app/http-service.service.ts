import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class HttpServiceService {

  constructor(
    private httpClient: HttpClient,
    private router: Router,
  ) { }

  post(endpoint: any, bean: any, callback?: any) {
    return this.httpClient.post(endpoint, bean).subscribe(
      (data) => {
        if (callback) callback(data);
      },
      (error) => {
        this.handleError(error, callback);
      }
    );
  }

  get(endpoint: any, callback?: any) {
    return this.httpClient.get(endpoint).subscribe(
      (data) => {
        if (callback) callback(data);
      },
      (error) => {
        this.handleError(error, callback);
      }
    );
  }

  getReport(url: string, token: string) {
    this.httpClient
      .get(url, {
        headers: {
          Authorization: 'Bearer ' + token,
        },
        responseType: 'blob',
      })
      .subscribe((res: any) => {
        const file = new Blob([res], { type: 'application/pdf' });
        const fileURL = URL.createObjectURL(file);
        window.open(fileURL);
      }, (error) => {
        this.handleError(error);
      });
  }

  // 🔥 CENTRALIZED ERROR HANDLER
  private handleError(error: any, callback?: any) {

    let message = '';

    if (error.status === 0) {
      message = 'Backend server is down';
    }

    else if (error.status === 503) {
      message = error.error?.result?.message || 'Database server down!!';
    }


    else if (error.status === 500) {
      message = 'Internal server error';
    }


    this.router.navigate([this.router.url], {
      queryParams: { errorMessage: message }
    });

    if (callback) {
      callback({
        success: false,
        result: { message }
      });
    }
  }
}