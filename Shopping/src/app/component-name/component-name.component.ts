import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-component-name',
  templateUrl: './component-name.component.html',
  styleUrls: ['./component-name.component.css']
})
export class ComponentNameComponent implements OnInit {
  myForm: FormGroup;
  showAddRepositoryForm: boolean = false;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.myForm = this.formBuilder.group({
      jiraConnection: ['', Validators.required],
      jiraProject: ['', Validators.required],
      implementationType: ['', Validators.required],
      gitHub: ['', Validators.required],
      gitHubRepository: ['', Validators.required],
      newRepositoryName: ['', Validators.required],
      packageName: ['', Validators.required],
      userStories: ['', Validators.required]
    });
  }

  submitForm() {
    if (this.myForm.valid) {
      // Implement API call here
    } else {
      this.validateAllFormFields(this.myForm);
    }
  }

  validateAllFormFields(formGroup: FormGroup) {
    Object.keys(formGroup.controls).forEach(field => {
      const control = formGroup.get(field);
      if (control instanceof FormGroup) {
        this.validateAllFormFields(control);
      } else {
        control.markAsTouched({ onlySelf: true });
      }
    });
  }

  addNewRepository() {
    this.showAddRepositoryForm = true;
  }

  resetRepositoryName() {
    this.myForm.get('newRepositoryName').reset();
  }

  saveRepositoryName() {
    if (this.myForm.get('newRepositoryName').valid) {
      // Implement API call here
    } else {
      this.myForm.get('newRepositoryName').markAsTouched();
    }
  }
}