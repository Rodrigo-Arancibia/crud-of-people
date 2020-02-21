import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Person } from 'src/app/Model/Person';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  person:Person = new Person();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  Save(){
    this.service.createPerson(this.person)
    .subscribe(data=>{
      alert("Succesfully added!");
      this.router.navigate(["list"]);
    })
  }

}