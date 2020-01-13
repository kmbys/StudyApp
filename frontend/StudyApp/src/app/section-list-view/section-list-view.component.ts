import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-section-list-view',
  templateUrl: './section-list-view.component.html',
  styleUrls: ['./section-list-view.component.css']
})
export class SectionListViewComponent implements OnInit {

  sections = [
    {
      title: 'Java 初級',
      name: '相良　涼介',
      startTime: '14:00',
      endTime: '15:00',
    },
    {
      title: 'Java 中級',
      name: '二瓶　由伸',
      startTime: '15:00',
      endTime: '16:00',
    },
    {
      title: 'Java 上級',
      name: '三上　俊',
      startTime: '17:00',
      endTime: '18:00',
    }
  ];

  constructor() {
  }

  ngOnInit() {

  }
}
