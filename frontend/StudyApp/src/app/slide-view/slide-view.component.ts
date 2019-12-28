import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-slide-view',
  templateUrl: './slide-view.component.html',
  styleUrls: ['./slide-view.component.css']
})
export class SlideViewComponent implements OnInit {

  viewer = "office";
  doc = "http://www.wakhok.ac.jp/~tatsuo/java2005/2shuu/java1-2.ppt";

  constructor() { }

  ngOnInit() {
  }

}
