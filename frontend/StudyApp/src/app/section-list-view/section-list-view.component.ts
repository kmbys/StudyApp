import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { SectionInfo } from '../model/sectionInfo';

@Component({
  selector: 'app-section-list-view',
  templateUrl: './section-list-view.component.html',
  styleUrls: ['./section-list-view.component.css']
})
export class SectionListViewComponent implements OnInit {

  @Input()
  private sectionInfos: Array<SectionInfo>;

  @Output()
  private index = 0;

  @Output()
  private event = new EventEmitter<number>();

  constructor() {
  }

  /**
   * <dl>
   * <dt><b>メソッド概要: </b></dt>
   * <dd>初期化<dd>
   * </dl>
   *
   */
  ngOnInit() {
  }

  /**
   * <dl>
   * <dt><b>メソッド概要: </b></dt>
   * <dd>セクションの位置を親コンポーネントに送信<dd>
   * </dd>
   *
   * @param i セクションの選択位置
   */
  outIndex(i: number) {
    this.event.emit(i);
  }
}
