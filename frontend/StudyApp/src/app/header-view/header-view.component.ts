import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-header-view',
  templateUrl: './header-view.component.html',
  styleUrls: ['./header-view.component.css']
})
export class HeaderViewComponent implements OnInit {

  @Input()
  private title: string;

  /**
   * <dl>
   * <dt><b>メソッド概要: </b><dt>
   * <dd>デフォルトコンストラクタ</dd>
   * </dl>
   *
   */
  constructor() {}

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
