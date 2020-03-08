import { Component, OnInit, Input, Output } from '@angular/core';
import { SectionInfo } from '../model/sectionInfo';

@Component({
  selector: 'app-slide-view',
  templateUrl: './slide-view.component.html',
  styleUrls: ['./slide-view.component.css']
})
export class SlideViewComponent implements OnInit {

  @Input()
  private sectionInfos: Array<SectionInfo>;

  @Input()
  private index;

  viewer = 'office';

  /**
   * <dl>
   * <dt><b>メソッド概要: </b><dt>
   * <dd>デフォルトコンストラクタ</dd>
   * </dl>
   *
   */
  constructor() { }

  /**
   * <dl>
   * <dt><b>メソッド概要: </b></dt>
   * <dd>初期化<dd>
   * </dl>
   *
   */
  ngOnInit() {
  }
}
