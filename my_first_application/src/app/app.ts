import { HttpClient } from '@angular/common/http';
import { Component, OnInit, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './styles.css'
})
export class App implements OnInit{
  funcionarios: any[] = [];
  constructor(private http: HttpClient) { }
  ngOnInit(){
    this.http.get<any[]>('http://localhost:8080/api/funcionario').subscribe(funcionarios => {
      this.funcionarios = funcionarios;
    },
    error => {
      console.error('Erro ao buscar funcionários:', error);
    }
  )
  }
  protected readonly title = signal('my_first_application');
}
