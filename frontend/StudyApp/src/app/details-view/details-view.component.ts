import { Component, OnInit, Input } from '@angular/core';
import { SectionInfo } from '../model/sectionInfo';

@Component({
  selector: 'app-details-view',
  templateUrl: './details-view.component.html',
  styleUrls: ['./details-view.component.css']
})
export class DetailsViewComponent implements OnInit {

  @Input()
  private sectionInfos: Array<SectionInfo>;

  @Input()
  private index = 0;

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
