import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-component-name',
  templateUrl: './component-name.component.html',
  styleUrls: ['./component-name.component.css']
})
export class ComponentNameComponent implements OnInit {
  myForm: FormGroup;
  showAddRepositoryPopup: boolean = false;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.myForm = this.formBuilder.group({
      jiraConnection: ['', Validators.required],
      jiraProject: ['', Validators.required],
      microServiceType: ['', Validators.required],
      gitHub: ['', Validators.required],
      gitHubRepository: ['', Validators.required],
      newRepository: [''],
      packageName: ['', Validators.required],
      userStories: ['', Validators.required]
    });
  }

  onSubmit() {
    // Handle form submission here
  }

  openAddRepositoryPopup() {
    this.showAddRepositoryPopup = true;
  }

  resetRepository() {
    this.myForm.get('newRepository').setValue('');
  }

  saveRepository() {
    const newRepository = this.myForm.get('newRepository').value;
    // Save new repository here
    this.showAddRepositoryPopup = false;
  }
}